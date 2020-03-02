package com.viewmodelkotlin.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.weatherdemo.dao.WeatherListDAO
import com.weatherdemo.dataconverter.DataConverterCoord
import com.weatherdemo.dataconverter.DataConverterMain
import com.weatherdemo.dataconverter.DataConverterWind
import com.weatherdemo.model.ResponseModel


/**
 * Created by chirag.shah on 14-08-2018.
 */

@Database(
    entities = arrayOf(
        ResponseModel::class
    ),
    version = 1
)
@TypeConverters(DataConverterMain::class, DataConverterCoord::class, DataConverterWind::class)
abstract class WeatherDatabase : RoomDatabase() {
    abstract fun daoResponseModel(): WeatherListDAO

    companion object {
        private var ourInstance: WeatherDatabase? = null

        fun getInstance(context: Context): WeatherDatabase? {
            if (ourInstance == null) {
                synchronized(WeatherDatabase::class.java) {
                    if (ourInstance == null) {
                        ourInstance =
                            Room.databaseBuilder(context, WeatherDatabase::class.java, "weather_db")
                                .allowMainThreadQueries()
                                .build()
                    }
                }
            }
            return ourInstance
        }
    }
}
