package com.weatherdemo.model;

import java.lang.System;

@androidx.room.Entity(indices = {@androidx.room.Index(unique = true, value = {"unique_id"})})
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bs\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007\u0012\b\b\u0003\u0010\f\u001a\u00020\r\u0012\b\b\u0001\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0003\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\u0002\u0010\u0012J\t\u0010(\u001a\u00020\u0003H\u00c6\u0003J\t\u0010)\u001a\u00020\u000fH\u00c6\u0003J\t\u0010*\u001a\u00020\u0011H\u00c6\u0003J\t\u0010+\u001a\u00020\u0003H\u00c6\u0003J\t\u0010,\u001a\u00020\u0003H\u00c6\u0003J\t\u0010-\u001a\u00020\u0007H\u00c6\u0003J\t\u0010.\u001a\u00020\u0003H\u00c6\u0003J\t\u0010/\u001a\u00020\u0003H\u00c6\u0003J\t\u00100\u001a\u00020\u0007H\u00c6\u0003J\t\u00101\u001a\u00020\u0007H\u00c6\u0003J\t\u00102\u001a\u00020\rH\u00c6\u0003Jw\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0003\u0010\f\u001a\u00020\r2\b\b\u0003\u0010\u000e\u001a\u00020\u000f2\b\b\u0003\u0010\u0010\u001a\u00020\u0011H\u00c6\u0001J\u0013\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00107\u001a\u00020\u0003H\u00d6\u0001J\t\u00108\u001a\u00020\u0007H\u00d6\u0001R\u0011\u0010\n\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0016\"\u0004\b\u001d\u0010\u001eR\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u000b\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0014R\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0016R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0016\"\u0004\b$\u0010\u001eR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0016R\u0016\u0010\u0010\u001a\u00020\u00118\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\'\u00a8\u00069"}, d2 = {"Lcom/weatherdemo/model/ResponseModel;", "", "unique_id", "", "visibility", "dt", "currentdt", "", "timezone", "cod", "base", "name", "coord", "Lcom/weatherdemo/model/ModelCoord;", "main", "Lcom/weatherdemo/model/ModelMain;", "wind", "Lcom/weatherdemo/model/ModelWind;", "(IIILjava/lang/String;IILjava/lang/String;Ljava/lang/String;Lcom/weatherdemo/model/ModelCoord;Lcom/weatherdemo/model/ModelMain;Lcom/weatherdemo/model/ModelWind;)V", "getBase", "()Ljava/lang/String;", "getCod", "()I", "getCoord", "()Lcom/weatherdemo/model/ModelCoord;", "getCurrentdt", "setCurrentdt", "(Ljava/lang/String;)V", "getDt", "setDt", "(I)V", "getMain", "()Lcom/weatherdemo/model/ModelMain;", "getName", "getTimezone", "getUnique_id", "setUnique_id", "getVisibility", "getWind", "()Lcom/weatherdemo/model/ModelWind;", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class ResponseModel {
    @androidx.room.PrimaryKey(autoGenerate = true)
    private int unique_id;
    private final int visibility = 0;
    private int dt;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String currentdt;
    private final int timezone = 0;
    private final int cod = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String base = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String name = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "ModelCoord")
    private final com.weatherdemo.model.ModelCoord coord = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "ModelMain")
    private final com.weatherdemo.model.ModelMain main = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "ModelWind")
    private final com.weatherdemo.model.ModelWind wind = null;
    
    public final int getUnique_id() {
        return 0;
    }
    
    public final void setUnique_id(int p0) {
    }
    
    public final int getVisibility() {
        return 0;
    }
    
    public final int getDt() {
        return 0;
    }
    
    public final void setDt(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCurrentdt() {
        return null;
    }
    
    public final void setCurrentdt(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getTimezone() {
        return 0;
    }
    
    public final int getCod() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.weatherdemo.model.ModelCoord getCoord() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.weatherdemo.model.ModelMain getMain() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.weatherdemo.model.ModelWind getWind() {
        return null;
    }
    
    public ResponseModel(int unique_id, int visibility, int dt, @org.jetbrains.annotations.NotNull()
    java.lang.String currentdt, int timezone, int cod, @org.jetbrains.annotations.NotNull()
    java.lang.String base, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    @androidx.room.TypeConverters(value = {com.weatherdemo.dataconverter.DataConverterCoord.class})
    com.weatherdemo.model.ModelCoord coord, @org.jetbrains.annotations.NotNull()
    @androidx.room.TypeConverters(value = {com.weatherdemo.dataconverter.DataConverterMain.class})
    com.weatherdemo.model.ModelMain main, @org.jetbrains.annotations.NotNull()
    @androidx.room.TypeConverters(value = {com.weatherdemo.dataconverter.DataConverterWind.class})
    com.weatherdemo.model.ModelWind wind) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int component2() {
        return 0;
    }
    
    public final int component3() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    public final int component5() {
        return 0;
    }
    
    public final int component6() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.weatherdemo.model.ModelCoord component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.weatherdemo.model.ModelMain component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.weatherdemo.model.ModelWind component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.weatherdemo.model.ResponseModel copy(int unique_id, int visibility, int dt, @org.jetbrains.annotations.NotNull()
    java.lang.String currentdt, int timezone, int cod, @org.jetbrains.annotations.NotNull()
    java.lang.String base, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    @androidx.room.TypeConverters(value = {com.weatherdemo.dataconverter.DataConverterCoord.class})
    com.weatherdemo.model.ModelCoord coord, @org.jetbrains.annotations.NotNull()
    @androidx.room.TypeConverters(value = {com.weatherdemo.dataconverter.DataConverterMain.class})
    com.weatherdemo.model.ModelMain main, @org.jetbrains.annotations.NotNull()
    @androidx.room.TypeConverters(value = {com.weatherdemo.dataconverter.DataConverterWind.class})
    com.weatherdemo.model.ModelWind wind) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}