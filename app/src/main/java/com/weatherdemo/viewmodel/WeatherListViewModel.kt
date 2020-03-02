package com.weatherdemo.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.weatherdemo.model.DataWrapper
import com.weatherdemo.model.ResponseModel
import com.weatherdemo.repository.WeatherListRepository


class WeatherListViewModel : ViewModel() {

    private var accessRight: MutableLiveData<DataWrapper<ResponseModel>>? = null
    private val mRepository = WeatherListRepository()


    fun getWeatherList(latitude: String, longitude: String): MutableLiveData<DataWrapper<ResponseModel>>? {
        accessRight = mRepository.getWeatherList(latitude,longitude)
        return accessRight
    }
}