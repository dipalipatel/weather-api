package com.weatherdemo.repository

import androidx.lifecycle.MutableLiveData
import com.weatherdemo.model.DataWrapper
import com.weatherdemo.model.ResponseModel
import com.kcspl.divyangapp.network.CustomApiCallback
import com.kcspl.divyangapp.network.RestClient


class WeatherListRepository {
    fun getWeatherList(latitude: String, longitude: String): MutableLiveData<DataWrapper<ResponseModel>> {
        val dataWrapper = DataWrapper<ResponseModel>()
        val mResponseModel = MutableLiveData<DataWrapper<ResponseModel>>()

        RestClient.getService()?.getWeatherList(latitude,longitude)
            ?.enqueue(object : CustomApiCallback<ResponseModel>() {

                override fun handleResponseData(data: ResponseModel?) {
                    dataWrapper.data = data
                    mResponseModel.value = dataWrapper
                }

                override fun showErrorMessage(errormessage: String?) {
                    dataWrapper.message = errormessage
                    dataWrapper.data = null
                    mResponseModel.value = dataWrapper
                }
            })
        return mResponseModel
    }


}