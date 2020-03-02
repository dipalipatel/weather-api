package com.viewmodelkotlin.database;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import com.weatherdemo.dao.WeatherListDAO;
import com.weatherdemo.dao.WeatherListDAO_Impl;
import java.lang.IllegalStateException;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

@SuppressWarnings("unchecked")
public final class WeatherDatabase_Impl extends WeatherDatabase {
  private volatile WeatherListDAO _weatherListDAO;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `ResponseModel` (`unique_id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `visibility` INTEGER NOT NULL, `dt` INTEGER NOT NULL, `currentdt` TEXT NOT NULL, `timezone` INTEGER NOT NULL, `cod` INTEGER NOT NULL, `base` TEXT NOT NULL, `name` TEXT NOT NULL, `ModelCoord` TEXT NOT NULL, `ModelMain` TEXT NOT NULL, `ModelWind` TEXT NOT NULL)");
        _db.execSQL("CREATE UNIQUE INDEX `index_ResponseModel_unique_id` ON `ResponseModel` (`unique_id`)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"2916d38e22243800754aa62011e25165\")");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `ResponseModel`");
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      protected void validateMigration(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsResponseModel = new HashMap<String, TableInfo.Column>(11);
        _columnsResponseModel.put("unique_id", new TableInfo.Column("unique_id", "INTEGER", true, 1));
        _columnsResponseModel.put("visibility", new TableInfo.Column("visibility", "INTEGER", true, 0));
        _columnsResponseModel.put("dt", new TableInfo.Column("dt", "INTEGER", true, 0));
        _columnsResponseModel.put("currentdt", new TableInfo.Column("currentdt", "TEXT", true, 0));
        _columnsResponseModel.put("timezone", new TableInfo.Column("timezone", "INTEGER", true, 0));
        _columnsResponseModel.put("cod", new TableInfo.Column("cod", "INTEGER", true, 0));
        _columnsResponseModel.put("base", new TableInfo.Column("base", "TEXT", true, 0));
        _columnsResponseModel.put("name", new TableInfo.Column("name", "TEXT", true, 0));
        _columnsResponseModel.put("ModelCoord", new TableInfo.Column("ModelCoord", "TEXT", true, 0));
        _columnsResponseModel.put("ModelMain", new TableInfo.Column("ModelMain", "TEXT", true, 0));
        _columnsResponseModel.put("ModelWind", new TableInfo.Column("ModelWind", "TEXT", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysResponseModel = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesResponseModel = new HashSet<TableInfo.Index>(1);
        _indicesResponseModel.add(new TableInfo.Index("index_ResponseModel_unique_id", true, Arrays.asList("unique_id")));
        final TableInfo _infoResponseModel = new TableInfo("ResponseModel", _columnsResponseModel, _foreignKeysResponseModel, _indicesResponseModel);
        final TableInfo _existingResponseModel = TableInfo.read(_db, "ResponseModel");
        if (! _infoResponseModel.equals(_existingResponseModel)) {
          throw new IllegalStateException("Migration didn't properly handle ResponseModel(com.weatherdemo.model.ResponseModel).\n"
                  + " Expected:\n" + _infoResponseModel + "\n"
                  + " Found:\n" + _existingResponseModel);
        }
      }
    }, "2916d38e22243800754aa62011e25165", "928b0bec30dd8e9877d2b1a68b756524");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    return new InvalidationTracker(this, "ResponseModel");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `ResponseModel`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public WeatherListDAO daoResponseModel() {
    if (_weatherListDAO != null) {
      return _weatherListDAO;
    } else {
      synchronized(this) {
        if(_weatherListDAO == null) {
          _weatherListDAO = new WeatherListDAO_Impl(this);
        }
        return _weatherListDAO;
      }
    }
  }
}
