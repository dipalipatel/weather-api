package com.weatherdemo.dataconverter

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.weatherdemo.model.ModelWind
import java.io.Serializable


class DataConverterWind : Serializable {

    @TypeConverter // note this annotation
    fun fromOValuesList(optionValues: ModelWind): String? {
        if (optionValues == null) {
            return null
        }
        val gson = Gson()
        val type = object : TypeToken<ModelWind>() {

        }.getType()
        return gson.toJson(optionValues, type)
    }

    @TypeConverter // note this annotation
    fun toValuesList(optionValuesString: String?): ModelWind? {
        if (optionValuesString == null) {
            return null
        }
        val gson = Gson()
        val type = object : TypeToken<ModelWind>() {

        }.getType()
        return gson.fromJson(optionValuesString, type)
    }

}

