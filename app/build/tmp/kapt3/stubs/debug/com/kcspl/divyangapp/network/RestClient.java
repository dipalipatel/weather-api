package com.kcspl.divyangapp.network;

import java.lang.System;

/**
 * This class is used in API Request and Response time
 * Using RestClient instance api call also configure network timeout and log interceptor
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00162\u00020\u0001:\u0002\u0016\u0017B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0011\u001a\u00020\u0004J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0002R\u0014\u0010\u0003\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u0080.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/kcspl/divyangapp/network/RestClient;", "", "()V", "client", "Lokhttp3/OkHttpClient;", "getClient", "()Lokhttp3/OkHttpClient;", "nullOnEmptyConverterFactory", "Lretrofit2/Converter$Factory;", "retrofit", "Lretrofit2/Retrofit;", "getRetrofit$app_debug", "()Lretrofit2/Retrofit;", "setRetrofit$app_debug", "(Lretrofit2/Retrofit;)V", "service", "Lcom/kcspl/divyangapp/network/WebServiceAPI;", "getUnsafeOkHttpClient", "initRetrofit", "", "loggingInterceptor", "Lokhttp3/Interceptor;", "Companion", "NullOnEmptyConverterFactory", "app_debug"})
public final class RestClient {
    
    /**
     * The API reference
     */
    private com.kcspl.divyangapp.network.WebServiceAPI service;
    @org.jetbrains.annotations.NotNull()
    public retrofit2.Retrofit retrofit;
    private final retrofit2.Converter.Factory nullOnEmptyConverterFactory = null;
    private static final java.lang.String HEADER_TOKEN = "Authorization";
    @android.annotation.SuppressLint(value = {"StaticFieldLeak"})
    private static com.kcspl.divyangapp.network.RestClient webServiceClient;
    private static android.content.Context mContext;
    private static final int CONNECT_TIME_OUT_SEC = 180;
    private static final int READ_TIME_OUT_SEC = 160;
    private static final long API_DEFAULT_PAGE_KEY = 1L;
    public static final com.kcspl.divyangapp.network.RestClient.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final retrofit2.Retrofit getRetrofit$app_debug() {
        return null;
    }
    
    public final void setRetrofit$app_debug(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit p0) {
    }
    
    private final okhttp3.OkHttpClient getClient() {
        return null;
    }
    
    private final void initRetrofit() {
    }
    
    /**
     * @return Interceptor that provides logging
     */
    private final okhttp3.Interceptor loggingInterceptor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final okhttp3.OkHttpClient getUnsafeOkHttpClient() {
        return null;
    }
    
    public RestClient() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J=\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u0003\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016\u00a2\u0006\u0002\u0010\r\u00a8\u0006\u000e"}, d2 = {"Lcom/kcspl/divyangapp/network/RestClient$NullOnEmptyConverterFactory;", "Lretrofit2/Converter$Factory;", "(Lcom/kcspl/divyangapp/network/RestClient;)V", "responseBodyConverter", "Lretrofit2/Converter;", "Lokhttp3/ResponseBody;", "type", "Ljava/lang/reflect/Type;", "annotations", "", "", "retrofit", "Lretrofit2/Retrofit;", "(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;Lretrofit2/Retrofit;)Lretrofit2/Converter;", "app_debug"})
    final class NullOnEmptyConverterFactory extends retrofit2.Converter.Factory {
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        public retrofit2.Converter<okhttp3.ResponseBody, ?> responseBodyConverter(@org.jetbrains.annotations.Nullable()
        java.lang.reflect.Type type, @org.jetbrains.annotations.Nullable()
        java.lang.annotation.Annotation[] annotations, @org.jetbrains.annotations.Nullable()
        retrofit2.Retrofit retrofit) {
            return null;
        }
        
        public NullOnEmptyConverterFactory() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\rR\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0082D\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u000e\u001a\u00020\u000f8F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/kcspl/divyangapp/network/RestClient$Companion;", "", "()V", "API_DEFAULT_PAGE_KEY", "", "getAPI_DEFAULT_PAGE_KEY", "()J", "CONNECT_TIME_OUT_SEC", "", "HEADER_TOKEN", "", "READ_TIME_OUT_SEC", "mContext", "Landroid/content/Context;", "retrofitClient", "Lretrofit2/Retrofit;", "getRetrofitClient", "()Lretrofit2/Retrofit;", "webServiceClient", "Lcom/kcspl/divyangapp/network/RestClient;", "getService", "Lcom/kcspl/divyangapp/network/WebServiceAPI;", "init", "", "context", "app_debug"})
    public static final class Companion {
        
        public final long getAPI_DEFAULT_PAGE_KEY() {
            return 0L;
        }
        
        /**
         * will init retrofit. needs to be called before using API. preferably from Application class
         *
         * @param context
         */
        public final void init(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final retrofit2.Retrofit getRetrofitClient() {
            return null;
        }
        
        /**
         * @return Web API
         */
        @org.jetbrains.annotations.Nullable()
        public final com.kcspl.divyangapp.network.WebServiceAPI getService() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}