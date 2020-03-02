package com.weatherdemo.view

import android.os.Bundle
import android.text.TextUtils
import android.view.MenuItem
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationServices
import com.google.gson.Gson
import com.weatherdemo.R
import com.weatherdemo.databinding.WeatherDetailActivityBinding
import com.weatherdemo.model.ResponseModel
import com.weatherdemo.utils.CommonMethod
import com.weatherdemo.utils.CommonVariables
import kotlinx.android.synthetic.main.weather_detail_activity.view.*

class WeatherDetailActivity : BaseActivity<WeatherDetailActivityBinding>() {

    lateinit var mFusedLocationClient: FusedLocationProviderClient

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindView(R.layout.weather_detail_activity)
        initToolBar()
        mFusedLocationClient = LocationServices.getFusedLocationProviderClient(this)

    }

    private fun initToolBar() {
        setSupportActionBar(mBinding.toolbar.toolbar)
        title = ""
        mBinding.toolbar.title = resources.getString(R.string.detail_screen_title)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)
        setData()
    }

    private fun setData() {
        if (!TextUtils.isEmpty(intent.getStringExtra(CommonVariables.INTENT_JSON_MODEL_STR))) {
            val mModelDetail = Gson().fromJson(
                intent.getStringExtra(CommonVariables.INTENT_JSON_MODEL_STR),
                ResponseModel::class.java
            )
            mBinding.model = mModelDetail
        }
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> {
                onBackPressed()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onBackPressed() {
        super.onBackPressed()
        CommonMethod.finishActivity(this)
    }
}
