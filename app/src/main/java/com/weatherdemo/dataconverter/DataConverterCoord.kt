package com.weatherdemo.dataconverter

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.weatherdemo.model.ModelCoord
import java.io.Serializable


class DataConverterCoord : Serializable {

    @TypeConverter // note this annotation
    fun fromOValuesList(optionValues: ModelCoord): String? {
        if (optionValues == null) {
            return null
        }
        val gson = Gson()
        val type = object : TypeToken<ModelCoord>() {

        }.getType()
        return gson.toJson(optionValues, type)
    }

    @TypeConverter // note this annotation
    fun toValuesList(optionValuesString: String?): ModelCoord? {
        if (optionValuesString == null) {
            return null
        }
        val gson = Gson()
        val type = object : TypeToken<ModelCoord>() {

        }.getType()
        return gson.fromJson(optionValuesString, type)
    }

}

