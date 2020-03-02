package com.weatherdemo.dao;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.weatherdemo.dataconverter.DataConverterCoord;
import com.weatherdemo.dataconverter.DataConverterMain;
import com.weatherdemo.dataconverter.DataConverterWind;
import com.weatherdemo.model.ModelCoord;
import com.weatherdemo.model.ModelMain;
import com.weatherdemo.model.ModelWind;
import com.weatherdemo.model.ResponseModel;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
public final class WeatherListDAO_Impl implements WeatherListDAO {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfResponseModel;

  private final DataConverterCoord __dataConverterCoord = new DataConverterCoord();

  private final DataConverterMain __dataConverterMain = new DataConverterMain();

  private final DataConverterWind __dataConverterWind = new DataConverterWind();

  public WeatherListDAO_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfResponseModel = new EntityInsertionAdapter<ResponseModel>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `ResponseModel`(`unique_id`,`visibility`,`dt`,`currentdt`,`timezone`,`cod`,`base`,`name`,`ModelCoord`,`ModelMain`,`ModelWind`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ResponseModel value) {
        stmt.bindLong(1, value.getUnique_id());
        stmt.bindLong(2, value.getVisibility());
        stmt.bindLong(3, value.getDt());
        if (value.getCurrentdt() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getCurrentdt());
        }
        stmt.bindLong(5, value.getTimezone());
        stmt.bindLong(6, value.getCod());
        if (value.getBase() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getBase());
        }
        if (value.getName() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getName());
        }
        final String _tmp;
        _tmp = __dataConverterCoord.fromOValuesList(value.getCoord());
        if (_tmp == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, _tmp);
        }
        final String _tmp_1;
        _tmp_1 = __dataConverterMain.fromOValuesList(value.getMain());
        if (_tmp_1 == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, _tmp_1);
        }
        final String _tmp_2;
        _tmp_2 = __dataConverterWind.fromOValuesList(value.getWind());
        if (_tmp_2 == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, _tmp_2);
        }
      }
    };
  }

  @Override
  public void insertWeatherList(ResponseModel model) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfResponseModel.insert(model);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<ResponseModel> getAllWeatherList() {
    final String _sql = "Select * from ResponseModel order by unique_id DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfUniqueId = _cursor.getColumnIndexOrThrow("unique_id");
      final int _cursorIndexOfVisibility = _cursor.getColumnIndexOrThrow("visibility");
      final int _cursorIndexOfDt = _cursor.getColumnIndexOrThrow("dt");
      final int _cursorIndexOfCurrentdt = _cursor.getColumnIndexOrThrow("currentdt");
      final int _cursorIndexOfTimezone = _cursor.getColumnIndexOrThrow("timezone");
      final int _cursorIndexOfCod = _cursor.getColumnIndexOrThrow("cod");
      final int _cursorIndexOfBase = _cursor.getColumnIndexOrThrow("base");
      final int _cursorIndexOfName = _cursor.getColumnIndexOrThrow("name");
      final int _cursorIndexOfCoord = _cursor.getColumnIndexOrThrow("ModelCoord");
      final int _cursorIndexOfMain = _cursor.getColumnIndexOrThrow("ModelMain");
      final int _cursorIndexOfWind = _cursor.getColumnIndexOrThrow("ModelWind");
      final List<ResponseModel> _result = new ArrayList<ResponseModel>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final ResponseModel _item;
        final int _tmpUnique_id;
        _tmpUnique_id = _cursor.getInt(_cursorIndexOfUniqueId);
        final int _tmpVisibility;
        _tmpVisibility = _cursor.getInt(_cursorIndexOfVisibility);
        final int _tmpDt;
        _tmpDt = _cursor.getInt(_cursorIndexOfDt);
        final String _tmpCurrentdt;
        _tmpCurrentdt = _cursor.getString(_cursorIndexOfCurrentdt);
        final int _tmpTimezone;
        _tmpTimezone = _cursor.getInt(_cursorIndexOfTimezone);
        final int _tmpCod;
        _tmpCod = _cursor.getInt(_cursorIndexOfCod);
        final String _tmpBase;
        _tmpBase = _cursor.getString(_cursorIndexOfBase);
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        final ModelCoord _tmpCoord;
        final String _tmp;
        _tmp = _cursor.getString(_cursorIndexOfCoord);
        _tmpCoord = __dataConverterCoord.toValuesList(_tmp);
        final ModelMain _tmpMain;
        final String _tmp_1;
        _tmp_1 = _cursor.getString(_cursorIndexOfMain);
        _tmpMain = __dataConverterMain.toValuesList(_tmp_1);
        final ModelWind _tmpWind;
        final String _tmp_2;
        _tmp_2 = _cursor.getString(_cursorIndexOfWind);
        _tmpWind = __dataConverterWind.toValuesList(_tmp_2);
        _item = new ResponseModel(_tmpUnique_id,_tmpVisibility,_tmpDt,_tmpCurrentdt,_tmpTimezone,_tmpCod,_tmpBase,_tmpName,_tmpCoord,_tmpMain,_tmpWind);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public ResponseModel getSpecificWeatherList() {
    final String _sql = "Select * from ResponseModel order by unique_id DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfUniqueId = _cursor.getColumnIndexOrThrow("unique_id");
      final int _cursorIndexOfVisibility = _cursor.getColumnIndexOrThrow("visibility");
      final int _cursorIndexOfDt = _cursor.getColumnIndexOrThrow("dt");
      final int _cursorIndexOfCurrentdt = _cursor.getColumnIndexOrThrow("currentdt");
      final int _cursorIndexOfTimezone = _cursor.getColumnIndexOrThrow("timezone");
      final int _cursorIndexOfCod = _cursor.getColumnIndexOrThrow("cod");
      final int _cursorIndexOfBase = _cursor.getColumnIndexOrThrow("base");
      final int _cursorIndexOfName = _cursor.getColumnIndexOrThrow("name");
      final int _cursorIndexOfCoord = _cursor.getColumnIndexOrThrow("ModelCoord");
      final int _cursorIndexOfMain = _cursor.getColumnIndexOrThrow("ModelMain");
      final int _cursorIndexOfWind = _cursor.getColumnIndexOrThrow("ModelWind");
      final ResponseModel _result;
      if(_cursor.moveToFirst()) {
        final int _tmpUnique_id;
        _tmpUnique_id = _cursor.getInt(_cursorIndexOfUniqueId);
        final int _tmpVisibility;
        _tmpVisibility = _cursor.getInt(_cursorIndexOfVisibility);
        final int _tmpDt;
        _tmpDt = _cursor.getInt(_cursorIndexOfDt);
        final String _tmpCurrentdt;
        _tmpCurrentdt = _cursor.getString(_cursorIndexOfCurrentdt);
        final int _tmpTimezone;
        _tmpTimezone = _cursor.getInt(_cursorIndexOfTimezone);
        final int _tmpCod;
        _tmpCod = _cursor.getInt(_cursorIndexOfCod);
        final String _tmpBase;
        _tmpBase = _cursor.getString(_cursorIndexOfBase);
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        final ModelCoord _tmpCoord;
        final String _tmp;
        _tmp = _cursor.getString(_cursorIndexOfCoord);
        _tmpCoord = __dataConverterCoord.toValuesList(_tmp);
        final ModelMain _tmpMain;
        final String _tmp_1;
        _tmp_1 = _cursor.getString(_cursorIndexOfMain);
        _tmpMain = __dataConverterMain.toValuesList(_tmp_1);
        final ModelWind _tmpWind;
        final String _tmp_2;
        _tmp_2 = _cursor.getString(_cursorIndexOfWind);
        _tmpWind = __dataConverterWind.toValuesList(_tmp_2);
        _result = new ResponseModel(_tmpUnique_id,_tmpVisibility,_tmpDt,_tmpCurrentdt,_tmpTimezone,_tmpCod,_tmpBase,_tmpName,_tmpCoord,_tmpMain,_tmpWind);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
