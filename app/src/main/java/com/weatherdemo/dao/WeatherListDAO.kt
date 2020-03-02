package com.weatherdemo.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.weatherdemo.model.ResponseModel


@Dao
interface WeatherListDAO {

    @Query("Select * from ResponseModel order by unique_id DESC")
    fun getAllWeatherList(): List<ResponseModel>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertWeatherList(model: ResponseModel)

    @Query("Select * from ResponseModel order by unique_id DESC")
    fun getSpecificWeatherList(): ResponseModel

}