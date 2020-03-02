package com.weatherdemo.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0003J\b\u0010\u0018\u001a\u00020\u0017H\u0002J\b\u0010\u0019\u001a\u00020\u0015H\u0002J\b\u0010\u001a\u001a\u00020\u0017H\u0016J\u0012\u0010\u001b\u001a\u00020\u00172\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0014J\u0012\u0010\u001e\u001a\u00020\u00152\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u0010\u0010!\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020#H\u0016J+\u0010$\u001a\u00020\u00172\u0006\u0010%\u001a\u00020\u00052\f\u0010&\u001a\b\u0012\u0004\u0012\u00020(0\'2\u0006\u0010)\u001a\u00020*H\u0016\u00a2\u0006\u0002\u0010+J\b\u0010,\u001a\u00020\u0017H\u0003J\b\u0010-\u001a\u00020\u0017H\u0002J\b\u0010.\u001a\u00020\u0017H\u0002J\u0010\u0010/\u001a\u00020\u00172\u0006\u00100\u001a\u00020\u0015H\u0002J\u0016\u00101\u001a\u00020\u00172\u0006\u00102\u001a\u00020(2\u0006\u00103\u001a\u00020(R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u00020\rX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00064"}, d2 = {"Lcom/weatherdemo/view/WeatherListActivity;", "Lcom/weatherdemo/view/BaseActivity;", "Lcom/weatherdemo/databinding/WeatherListActivityBinding;", "()V", "PERMISSION_ID", "", "getPERMISSION_ID", "()I", "adapter", "Lcom/weatherdemo/adapter/MyWeatherDataAdapter;", "database", "Lcom/viewmodelkotlin/database/WeatherDatabase;", "mFusedLocationClient", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "getMFusedLocationClient", "()Lcom/google/android/gms/location/FusedLocationProviderClient;", "setMFusedLocationClient", "(Lcom/google/android/gms/location/FusedLocationProviderClient;)V", "mLocationCallback", "Lcom/google/android/gms/location/LocationCallback;", "checkPermissions", "", "getLastLocation", "", "initToolBar", "isLocationEnabled", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onRequestPermissionsResult", "requestCode", "permissions", "", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "requestNewLocationData", "requestPermissions", "setAllListInAdapter", "setDataAdapter", "isAllRecord", "webCallGetCurrentWeatherData", "latitude", "longitude", "app_debug"})
public final class WeatherListActivity extends com.weatherdemo.view.BaseActivity<com.weatherdemo.databinding.WeatherListActivityBinding> {
    private com.weatherdemo.adapter.MyWeatherDataAdapter adapter;
    private com.viewmodelkotlin.database.WeatherDatabase database;
    private final int PERMISSION_ID = 42;
    @org.jetbrains.annotations.NotNull()
    public com.google.android.gms.location.FusedLocationProviderClient mFusedLocationClient;
    private final com.google.android.gms.location.LocationCallback mLocationCallback = null;
    private java.util.HashMap _$_findViewCache;
    
    public final int getPERMISSION_ID() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.gms.location.FusedLocationProviderClient getMFusedLocationClient() {
        return null;
    }
    
    public final void setMFusedLocationClient(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.location.FusedLocationProviderClient p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initToolBar() {
    }
    
    @java.lang.Override()
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.Nullable()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    private final void getLastLocation() {
    }
    
    public final void webCallGetCurrentWeatherData(@org.jetbrains.annotations.NotNull()
    java.lang.String latitude, @org.jetbrains.annotations.NotNull()
    java.lang.String longitude) {
    }
    
    private final void setDataAdapter(boolean isAllRecord) {
    }
    
    private final void setAllListInAdapter() {
    }
    
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    private final void requestNewLocationData() {
    }
    
    private final boolean isLocationEnabled() {
        return false;
    }
    
    private final boolean checkPermissions() {
        return false;
    }
    
    private final void requestPermissions() {
    }
    
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    public WeatherListActivity() {
        super();
    }
}