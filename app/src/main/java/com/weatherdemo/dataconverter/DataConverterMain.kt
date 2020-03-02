package com.weatherdemo.dataconverter

import androidx.room.TypeConverter

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.weatherdemo.model.ModelMain

import java.io.Serializable


class DataConverterMain : Serializable {

    @TypeConverter // note this annotation
    fun fromOValuesList(optionValues: ModelMain): String? {
        if (optionValues == null) {
            return null
        }
        val gson = Gson()
        val type = object : TypeToken<ModelMain>() {

        }.getType()
        return gson.toJson(optionValues, type)
    }

    @TypeConverter // note this annotation
    fun toValuesList(optionValuesString: String?): ModelMain? {
        if (optionValuesString == null) {
            return null
        }
        val gson = Gson()
        val type = object : TypeToken<ModelMain>() {

        }.getType()
        return gson.fromJson(optionValuesString, type)
    }

}

