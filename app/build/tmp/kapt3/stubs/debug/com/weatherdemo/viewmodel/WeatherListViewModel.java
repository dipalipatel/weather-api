package com.weatherdemo.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J$\u0010\t\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bR\u001c\u0010\u0003\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/weatherdemo/viewmodel/WeatherListViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "accessRight", "Landroidx/lifecycle/MutableLiveData;", "Lcom/weatherdemo/model/DataWrapper;", "Lcom/weatherdemo/model/ResponseModel;", "mRepository", "Lcom/weatherdemo/repository/WeatherListRepository;", "getWeatherList", "latitude", "", "longitude", "app_debug"})
public final class WeatherListViewModel extends androidx.lifecycle.ViewModel {
    private androidx.lifecycle.MutableLiveData<com.weatherdemo.model.DataWrapper<com.weatherdemo.model.ResponseModel>> accessRight;
    private final com.weatherdemo.repository.WeatherListRepository mRepository = null;
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.MutableLiveData<com.weatherdemo.model.DataWrapper<com.weatherdemo.model.ResponseModel>> getWeatherList(@org.jetbrains.annotations.NotNull()
    java.lang.String latitude, @org.jetbrains.annotations.NotNull()
    java.lang.String longitude) {
        return null;
    }
    
    public WeatherListViewModel() {
        super();
    }
}