package com.kcspl.divyangapp.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0002J1\u0010\u0007\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0001\u0010\u00012\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00010\u000bH\u0002\u00a2\u0006\u0002\u0010\fJ\u0017\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00018\u0000H$\u00a2\u0006\u0002\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u001e\u0010\u0018\u001a\u00020\u000e2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J$\u0010\u001b\u001a\u00020\u000e2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0016J\u0012\u0010\u001d\u001a\u00020\u000e2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0006H$\u00a8\u0006\u001f"}, d2 = {"Lcom/kcspl/divyangapp/network/CustomApiCallback;", "T", "Lcom/weatherdemo/model/ResponseModel;", "Lretrofit2/Callback;", "()V", "createErrorMsgJson", "", "getResponse", "tResponse", "Lretrofit2/Response;", "tClass", "Ljava/lang/Class;", "(Lretrofit2/Response;Ljava/lang/Class;)Ljava/lang/Object;", "handleResponseData", "", "data", "(Lcom/weatherdemo/model/ResponseModel;)V", "isErrorInWebResponse", "", "statusCode", "", "isKnownException", "t", "", "onFailure", "call", "Lretrofit2/Call;", "onResponse", "response", "showErrorMessage", "errormessage", "app_debug"})
public abstract class CustomApiCallback<T extends com.weatherdemo.model.ResponseModel> implements retrofit2.Callback<T> {
    
    @java.lang.Override()
    public void onResponse(@org.jetbrains.annotations.NotNull()
    retrofit2.Call<T> call, @org.jetbrains.annotations.NotNull()
    retrofit2.Response<T> response) {
    }
    
    protected abstract void handleResponseData(@org.jetbrains.annotations.Nullable()
    T data);
    
    protected abstract void showErrorMessage(@org.jetbrains.annotations.Nullable()
    java.lang.String errormessage);
    
    @java.lang.Override()
    public void onFailure(@org.jetbrains.annotations.NotNull()
    retrofit2.Call<T> call, @org.jetbrains.annotations.NotNull()
    java.lang.Throwable t) {
    }
    
    private final boolean isKnownException(java.lang.Throwable t) {
        return false;
    }
    
    private final boolean isErrorInWebResponse(int statusCode) {
        return false;
    }
    
    private final <T extends java.lang.Object>T getResponse(retrofit2.Response<T> tResponse, java.lang.Class<T> tClass) {
        return null;
    }
    
    private final java.lang.String createErrorMsgJson() {
        return null;
    }
    
    public CustomApiCallback() {
        super();
    }
}