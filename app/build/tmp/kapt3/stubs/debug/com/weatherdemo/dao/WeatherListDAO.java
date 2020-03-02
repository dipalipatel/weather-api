package com.weatherdemo.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'J\b\u0010\u0005\u001a\u00020\u0004H\'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0004H\'\u00a8\u0006\t"}, d2 = {"Lcom/weatherdemo/dao/WeatherListDAO;", "", "getAllWeatherList", "", "Lcom/weatherdemo/model/ResponseModel;", "getSpecificWeatherList", "insertWeatherList", "", "model", "app_debug"})
public abstract interface WeatherListDAO {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "Select * from ResponseModel order by unique_id DESC")
    public abstract java.util.List<com.weatherdemo.model.ResponseModel> getAllWeatherList();
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertWeatherList(@org.jetbrains.annotations.NotNull()
    com.weatherdemo.model.ResponseModel model);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "Select * from ResponseModel order by unique_id DESC")
    public abstract com.weatherdemo.model.ResponseModel getSpecificWeatherList();
}