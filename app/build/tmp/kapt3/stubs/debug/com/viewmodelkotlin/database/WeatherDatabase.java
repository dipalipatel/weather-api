package com.viewmodelkotlin.database;

import java.lang.System;

/**
 * Created by chirag.shah on 14-08-2018.
 */
@androidx.room.TypeConverters(value = {com.weatherdemo.dataconverter.DataConverterMain.class, com.weatherdemo.dataconverter.DataConverterCoord.class, com.weatherdemo.dataconverter.DataConverterWind.class})
@androidx.room.Database(entities = {com.weatherdemo.model.ResponseModel.class}, version = 1)
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lcom/viewmodelkotlin/database/WeatherDatabase;", "Landroidx/room/RoomDatabase;", "()V", "daoResponseModel", "Lcom/weatherdemo/dao/WeatherListDAO;", "Companion", "app_debug"})
public abstract class WeatherDatabase extends androidx.room.RoomDatabase {
    private static com.viewmodelkotlin.database.WeatherDatabase ourInstance;
    public static final com.viewmodelkotlin.database.WeatherDatabase.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.weatherdemo.dao.WeatherListDAO daoResponseModel();
    
    public WeatherDatabase() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/viewmodelkotlin/database/WeatherDatabase$Companion;", "", "()V", "ourInstance", "Lcom/viewmodelkotlin/database/WeatherDatabase;", "getInstance", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.Nullable()
        public final com.viewmodelkotlin.database.WeatherDatabase getInstance(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}