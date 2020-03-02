package com.weatherdemo.view

import android.Manifest
import android.annotation.SuppressLint
import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import android.content.pm.PackageManager
import android.location.Location
import android.location.LocationManager
import android.os.Bundle
import android.os.Looper
import android.provider.Settings
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.google.android.gms.location.*
import com.viewmodelkotlin.database.WeatherDatabase
import com.weatherdemo.R
import com.weatherdemo.adapter.MyWeatherDataAdapter
import com.weatherdemo.databinding.WeatherListActivityBinding
import com.weatherdemo.model.ResponseModel
import com.weatherdemo.utils.CommonMethod
import com.weatherdemo.utils.CommonVariables
import com.weatherdemo.viewmodel.WeatherListViewModel
import kotlinx.android.synthetic.main.weather_list_activity.view.*

class WeatherListActivity : BaseActivity<WeatherListActivityBinding>() {

    private var adapter: MyWeatherDataAdapter? =null
    private var database: WeatherDatabase? = null
    val PERMISSION_ID = 42
    lateinit var mFusedLocationClient: FusedLocationProviderClient

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindView(R.layout.weather_list_activity)
        initToolBar()
        mFusedLocationClient = LocationServices.getFusedLocationProviderClient(this)

    }

    private fun initToolBar() {
        setSupportActionBar(mBinding.toolbar.toolbar)
        title = ""
        mBinding.toolbar.title = resources.getString(R.string.app_name)
        supportActionBar?.setDisplayHomeAsUpEnabled(false)
        database = WeatherDatabase.getInstance(this)
        setDataAdapter(true)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.menu_settings, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.action_save -> {
                getLastLocation()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }

    @SuppressLint("MissingPermission")
    private fun getLastLocation() {
        if (checkPermissions()) {
            if (isLocationEnabled()) {
                mFusedLocationClient.lastLocation.addOnCompleteListener(this) { task ->
                    val location: Location? = task.result
                    if (location == null) {
                        requestNewLocationData()
                    } else {
                        webCallGetCurrentWeatherData(
                            location.latitude.toString(),
                            location.longitude.toString()
                        )

                    }
                }
            } else {
                Toast.makeText(this, "Turn on location", Toast.LENGTH_LONG).show()
                val intent = Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS)
                startActivity(intent)
            }
        } else {
            requestPermissions()
        }
    }

    fun webCallGetCurrentWeatherData(latitude: String, longitude: String) {
        showProgressDialog()
        val viewModel = ViewModelProviders.of(this).get(WeatherListViewModel::class.java)
        viewModel.getWeatherList(latitude, longitude)?.observe(this, Observer { mResponseModel ->
            dismissProgressDialog()
            if (mResponseModel.data == null) {
                Toast.makeText(this, mResponseModel.message, Toast.LENGTH_LONG).show()
            } else {
                //Toast.makeText(this, mResponseModel.message, Toast.LENGTH_LONG).show()
                mResponseModel.data!!.currentdt =
                    CommonMethod.getCurrentDate(CommonVariables.DATABASE_DATE_FORMAT)
                database!!.daoResponseModel().insertWeatherList(mResponseModel.data!!)
                setDataAdapter(false)
            }
        })
    }

    private fun setDataAdapter(isAllRecord: Boolean) {
        mBinding.recyclerview.visibility = View.VISIBLE
        mBinding.rowEmptyLayout.emptyLnrmain.visibility = View.GONE

        if (isAllRecord) {
            setAllListInAdapter()
        } else {
            val mModel = database!!.daoResponseModel().getSpecificWeatherList()
            if (adapter != null) {
                adapter?.mResponseModelList?.add(0, mModel)
                adapter?.notifyItemInserted(0)
                mBinding.recyclerview.scrollToPosition(0)
            } else {
                setAllListInAdapter()
            }
        }

    }


    private fun setAllListInAdapter() {
        val mModel = database!!.daoResponseModel().getAllWeatherList()
        if (mModel != null && mModel.isNotEmpty()) {
            adapter = MyWeatherDataAdapter(this, mModel as ArrayList<ResponseModel>)
            mBinding.recyclerview.adapter = adapter
        } else {
            mBinding.recyclerview.visibility = View.GONE
            mBinding.rowEmptyLayout.emptyLnrmain.visibility = View.VISIBLE
        }
    }

    @SuppressLint("MissingPermission")
    private fun requestNewLocationData() {
        val mLocationRequest = LocationRequest()
        mLocationRequest.priority = LocationRequest.PRIORITY_HIGH_ACCURACY
        mLocationRequest.interval = 0
        mLocationRequest.fastestInterval = 0
        mLocationRequest.numUpdates = 1

        mFusedLocationClient = LocationServices.getFusedLocationProviderClient(this)
        mFusedLocationClient.requestLocationUpdates(
            mLocationRequest, mLocationCallback,
            Looper.myLooper()
        )
    }

    private val mLocationCallback = object : LocationCallback() {
        override fun onLocationResult(locationResult: LocationResult) {
            val mLastLocation: Location = locationResult.lastLocation
            webCallGetCurrentWeatherData(
                mLastLocation.latitude.toString(),
                mLastLocation.longitude.toString()
            )
        }
    }

    private fun isLocationEnabled(): Boolean {
        val locationManager: LocationManager =
            getSystemService(Context.LOCATION_SERVICE) as LocationManager
        return locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER) || locationManager.isProviderEnabled(
            LocationManager.NETWORK_PROVIDER
        )
    }

    private fun checkPermissions(): Boolean {
        if (ActivityCompat.checkSelfPermission(
                this,
                Manifest.permission.ACCESS_COARSE_LOCATION
            ) == PackageManager.PERMISSION_GRANTED &&
            ActivityCompat.checkSelfPermission(
                this,
                Manifest.permission.ACCESS_FINE_LOCATION
            ) == PackageManager.PERMISSION_GRANTED
        ) {
            return true
        }
        return false
    }

    private fun requestPermissions() {
        ActivityCompat.requestPermissions(
            this,
            arrayOf(
                Manifest.permission.ACCESS_COARSE_LOCATION,
                Manifest.permission.ACCESS_FINE_LOCATION
            ),
            PERMISSION_ID
        )
    }


    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<String>,
        grantResults: IntArray
    ) {
        if (requestCode == PERMISSION_ID) {
            if (ActivityCompat.shouldShowRequestPermissionRationale(
                    this,
                    Manifest.permission.ACCESS_COARSE_LOCATION
                ) ||
                ActivityCompat.shouldShowRequestPermissionRationale(
                    this,
                    Manifest.permission.ACCESS_FINE_LOCATION
                )
            ) {
                getLastLocation()
            } else if ((grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED)) {
                getLastLocation()
            }else if ((grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_DENIED)) {
                getLastLocation()
            }
        }
    }

    override fun onBackPressed() {
        CommonMethod.showMessageYesNo(
            this,
            "",
            resources.getString(R.string.exitapp_msg),
            DialogInterface.OnClickListener { p0, p1 ->
                CommonMethod.finishActivity(this)
            }, null
        )
    }
}
