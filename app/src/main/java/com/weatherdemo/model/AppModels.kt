package com.weatherdemo.model

import androidx.room.*
import com.weatherdemo.dataconverter.DataConverterCoord
import com.weatherdemo.dataconverter.DataConverterMain
import com.weatherdemo.dataconverter.DataConverterWind


data class DataWrapper<T>(
    var data: T? = null,
    var message: String? = null,
    var statuscode: Int = 0

)

@Entity(indices = arrayOf(Index(value = *arrayOf("unique_id"), unique = true)))
data class ResponseModel(
    @PrimaryKey(autoGenerate = true)
    var unique_id: Int = 0,
    val visibility: Int = 0,
    var dt: Int = 0,
    var currentdt: String = "",
    val timezone: Int = 0,
    val cod: Int = 0,
    val base: String = "",
    val name: String = "",
    @TypeConverters(DataConverterCoord::class)
    @ColumnInfo(name = "ModelCoord")
    val coord: ModelCoord = ModelCoord(),
    @ColumnInfo(name = "ModelMain")
    @TypeConverters(DataConverterMain::class)
    val main: ModelMain,
    @ColumnInfo(name = "ModelWind")
    @TypeConverters(DataConverterWind::class)
    val wind: ModelWind = ModelWind()
)

data class ModelMain(
    var lon: Double = 0.0,
    var temp: Float = 0f,
    var feelsLike: Float = 0f,
    var temp_min: Float = 0f,
    var temp_max: Float = 0f,
    var pressure: Int = 0,
    var humidity: Int = 0
)

data class ModelWind(
    var speed: Float = 0f,
    var deg: Int = 0
)

data class ModelCoord(
    var lon: Double = 0.0,
    var lat: Double = 0.0
)
