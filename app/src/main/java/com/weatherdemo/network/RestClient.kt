package com.kcspl.divyangapp.network


import android.annotation.SuppressLint
import android.content.Context
import com.google.gson.GsonBuilder
import com.weatherdemo.BuildConfig
import com.weatherdemo.utils.CommonVariables
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.ResponseBody
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Converter
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.lang.reflect.Type
import java.util.concurrent.TimeUnit
import javax.net.ssl.SSLContext
import javax.net.ssl.TrustManager
import javax.net.ssl.X509TrustManager


/**
 *This class is used in API Request and Response time
 * Using RestClient instance api call also configure network timeout and log interceptor
 *
 */
class RestClient {
    /**
     * Private constructor for singleton purpose
     */

    /**
     * The API reference
     */
    private var service: WebServiceAPI? = null


    internal lateinit var retrofit: Retrofit

    /**
     * @return OkHttpClient with log and custom header interceptors
     */
    private val client: OkHttpClient
        get() = OkHttpClient.Builder()
            .connectTimeout(CONNECT_TIME_OUT_SEC.toLong(), TimeUnit.SECONDS)
            .readTimeout(READ_TIME_OUT_SEC.toLong(), TimeUnit.SECONDS)
            .addInterceptor(loggingInterceptor())
            .build()

    /*
    *
    *               Internal helper and initializer
    *****************************************************************************
     */
    private fun initRetrofit() {

/*
        val okHttpClient = UnsafeOkHttpClient.getUnsafeOkHttpClient()
*/
        val gson = GsonBuilder()
            .setLenient()
            .create()
        retrofit = Retrofit.Builder()
            .baseUrl(CommonVariables.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create(gson))
            .addConverterFactory(nullOnEmptyConverterFactory)
            .client(getUnsafeOkHttpClient())
            .build()
        service = retrofit.create(WebServiceAPI::class.java)
    }


    /**
     * @return Interceptor that provides logging
     */
    private fun loggingInterceptor(): Interceptor {
        val logging = HttpLoggingInterceptor()
        // set your desired log level
        if (BuildConfig.DEBUG) {
            logging.level = HttpLoggingInterceptor.Level.BODY
        } else {
            logging.level = HttpLoggingInterceptor.Level.NONE
        }
        return logging
    }

    private inner class NullOnEmptyConverterFactory : Converter.Factory() {

        override fun responseBodyConverter(
            type: Type?,
            annotations: Array<Annotation>?,
            retrofit: Retrofit?
        ): Converter<ResponseBody, *>? {
            val delegate = retrofit!!.nextResponseBodyConverter<Any>(this, type!!, annotations!!)
            return Converter<ResponseBody, Any> { body ->
                if (body.contentLength() == 0L) null else delegate.convert(
                    body
                )
            }
        }
    }

    fun getUnsafeOkHttpClient(): OkHttpClient {
        try {
            // Create a trust manager that does not validate certificate chains
            val trustAllCerts = arrayOf<TrustManager>(object : X509TrustManager {
                override fun checkClientTrusted(
                    chain: Array<java.security.cert.X509Certificate>,
                    authType: String
                ) {
                }

                override fun checkServerTrusted(
                    chain: Array<java.security.cert.X509Certificate>,
                    authType: String
                ) {
                }

                override fun getAcceptedIssuers(): Array<java.security.cert.X509Certificate> {
                    return arrayOf()
                }
            })

            // Install the all-trusting trust manager
            val sslContext = SSLContext.getInstance("SSL")
            sslContext.init(null, trustAllCerts, java.security.SecureRandom())

            // Create an ssl socket factory with our all-trusting manager
            val sslSocketFactory = sslContext.socketFactory

            val builder = OkHttpClient.Builder()
                .connectTimeout(CONNECT_TIME_OUT_SEC.toLong(), TimeUnit.SECONDS)
                .readTimeout(READ_TIME_OUT_SEC.toLong(), TimeUnit.SECONDS)
                //.addInterceptor(customHeaderInterceptor())
                .addInterceptor(loggingInterceptor())
            builder.sslSocketFactory(sslSocketFactory, trustAllCerts[0] as X509TrustManager)
            // builder.hostnameVerifier { hostname, session -> true }

            return builder.build()
        } catch (e: Exception) {
            throw RuntimeException(e)
        }

    }

    private val nullOnEmptyConverterFactory = object : Converter.Factory() {
        fun converterFactory() = this
        override fun responseBodyConverter(
            type: Type,
            annotations: Array<out Annotation>,
            retrofit: Retrofit
        ) =
            object : Converter<ResponseBody, Any?> {
                val nextResponseBodyConverter =
                    retrofit.nextResponseBodyConverter<Any?>(converterFactory(), type, annotations)

                override fun convert(value: ResponseBody) =
                    if (value.contentLength() != 0L) nextResponseBodyConverter.convert(value) else null
            }
    }

    companion object {
        private val HEADER_TOKEN = "Authorization"
        @SuppressLint("StaticFieldLeak")
        private var webServiceClient: RestClient? = null

        private var mContext: Context? = null
        private val CONNECT_TIME_OUT_SEC = 180
        private val READ_TIME_OUT_SEC = 160
        val API_DEFAULT_PAGE_KEY: Long = 1
        /**
         * will init retrofit. needs to be called before using API. preferably from Application class
         *
         * @param context
         */
        fun init(context: Context) {
            if (webServiceClient == null) {
                webServiceClient = RestClient()
                webServiceClient!!.initRetrofit()

            }
            mContext = context
        }

        val retrofitClient: Retrofit
            get() = webServiceClient!!.retrofit

        /**
         * @return Web API
         */
        fun getService(): WebServiceAPI? {
            if (webServiceClient == null) {
                throw IllegalStateException("Please initialise retrofit first")
            }

            return webServiceClient!!.service
        }


        /* private fun customHeaderInterceptor(): Interceptor {
             return Interceptor { chain ->
                 val original = chain.request()
                 val requestBuilder = original.newBuilder()
                     .header(CV.HEADER_CONTENT_KEY, CV.HEADER_CONTENT_TYPE)
                     .method(original.method, original.body)
                 requestBuilder.header(HEADER_TOKEN, "Bearer "+ CM.getSp(mContext!!, CV.PREF_ACCESS_TOKEN, "") as String)



                 val request = requestBuilder.build()
                 chain.proceed(request)
             }
         }*/
    }
}

