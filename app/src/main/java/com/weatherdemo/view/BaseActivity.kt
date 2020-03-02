package com.weatherdemo.view

import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import com.weatherdemo.utils.ProgressDialog

abstract class BaseActivity<DB : ViewDataBinding> : AppCompatActivity() {

    lateinit var mBinding: DB
    private var kcsDialog: ProgressDialog? = null

    protected fun bindView(layout: Int) {
        mBinding = DataBindingUtil.setContentView(this, layout)

    }

    fun showProgressDialog() {
        if (isFinishing) {
            return
        }
        runOnUiThread(Runnable {
            if (isFinishing) {
                return@Runnable
            }

            //if dialog not dismiss then first dialog=null.so not to show anytimewhen activtiy finish...
            if (kcsDialog != null) {
                kcsDialog = null
            }
            if (kcsDialog == null)
                kcsDialog = ProgressDialog(this@BaseActivity, false)
            if (kcsDialog != null && !kcsDialog!!.isShowing)
                kcsDialog!!.show()
        })
    }

    fun dismissProgressDialog() {
        if (isFinishing) {
            return
        }
        if (kcsDialog != null && kcsDialog!!.isShowing) {
            kcsDialog!!.dismiss()
            kcsDialog = null
        }
    }


}