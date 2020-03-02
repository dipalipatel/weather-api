package com.kcspl.divyangapp.network;

import java.lang.System;

/**
 * The web API interface**
 *  Please define all your web API extensions here
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\'\u00a8\u0006\b"}, d2 = {"Lcom/kcspl/divyangapp/network/WebServiceAPI;", "", "getWeatherList", "Lretrofit2/Call;", "Lcom/weatherdemo/model/ResponseModel;", "latitude", "", "longitude", "app_debug"})
public abstract interface WebServiceAPI {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "weather?appid=d173208ff8690b7d667796077ea28401")
    public abstract retrofit2.Call<com.weatherdemo.model.ResponseModel> getWeatherList(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "lat")
    java.lang.String latitude, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "lon")
    java.lang.String longitude);
}