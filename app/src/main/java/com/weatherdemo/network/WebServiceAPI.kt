package com.kcspl.divyangapp.network

import com.weatherdemo.model.ResponseModel
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query


/**
 **The web API interface**
 *  Please define all your web API extensions here
 */
interface WebServiceAPI {

    @GET("weather?appid=d173208ff8690b7d667796077ea28401")
    fun getWeatherList(@Query("lat") latitude: String, @Query("lon") longitude: String): Call<ResponseModel>

}
