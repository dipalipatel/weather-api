package com.weatherdemo.dataconverter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0004H\u0007\u00a8\u0006\t"}, d2 = {"Lcom/weatherdemo/dataconverter/DataConverterMain;", "Ljava/io/Serializable;", "()V", "fromOValuesList", "", "optionValues", "Lcom/weatherdemo/model/ModelMain;", "toValuesList", "optionValuesString", "app_debug"})
public final class DataConverterMain implements java.io.Serializable {
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverter()
    public final java.lang.String fromOValuesList(@org.jetbrains.annotations.NotNull()
    com.weatherdemo.model.ModelMain optionValues) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverter()
    public final com.weatherdemo.model.ModelMain toValuesList(@org.jetbrains.annotations.Nullable()
    java.lang.String optionValuesString) {
        return null;
    }
    
    public DataConverterMain() {
        super();
    }
}