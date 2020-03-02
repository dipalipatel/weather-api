package com.weatherdemo

import android.app.Application
import android.content.Context
import com.kcspl.divyangapp.network.RestClient


class ApplicationClass : Application() {


    private var devyangApp: ApplicationClass? = null


    override fun onCreate() {
        super.onCreate()
        devyangApp = this

        RestClient.init(this)



    }

    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
    }


}
