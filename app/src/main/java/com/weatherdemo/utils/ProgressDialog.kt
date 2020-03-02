package com.weatherdemo.utils

import android.app.Dialog
import android.content.Context
import android.view.Window
import com.weatherdemo.R


class ProgressDialog(context: Context, isCancelable: Boolean) : Dialog(context) {

    init {
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        setContentView(R.layout.progress_dialog)
        setCancelable(isCancelable)
        window!!.setBackgroundDrawableResource(android.R.color.transparent)
    }
}