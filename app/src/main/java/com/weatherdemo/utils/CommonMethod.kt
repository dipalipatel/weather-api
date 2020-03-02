package com.weatherdemo.utils

import android.app.Activity
import android.content.DialogInterface
import android.content.Intent
import android.text.TextUtils
import androidx.appcompat.app.AlertDialog
import com.weatherdemo.R
import java.text.SimpleDateFormat
import java.util.*

object CommonMethod {
    fun getCurrentDate(dateFormat: String): String {
        val sdf = SimpleDateFormat(dateFormat)
        val currentDate = sdf.format(Date())
        return currentDate.toString()
    }

    fun convertDateFormate(dateformat1: String, dateformat2: String, specificDate: String): String {
        val parser = SimpleDateFormat(dateformat1)
        val formatter = SimpleDateFormat(dateformat2)
        return formatter.format(parser.parse(specificDate))
    }

    // call this method when you have to pass data in intent
    fun startActivity(intent: Intent, activity: Activity) {

        activity.startActivity(intent)
        activity.overridePendingTransition(
            R.anim.push_in_from_left,
            R.anim.push_out_to_right
        )
    }

    fun finishActivity(activity: Activity) {
        activity.finish()
        activity.overridePendingTransition(0, R.anim.push_out_to_left)
    }
    fun showMessageYesNo(
        context: Activity?,
        title: String,
        message: String,
        yesListener: DialogInterface.OnClickListener?, noListener: DialogInterface.OnClickListener?
    ) {
        val builder = AlertDialog.Builder(context!!, R.style.AlertDialogTheme)
            .setMessage(message)
            .setPositiveButton(context.resources.getString(R.string.common_yes), yesListener)
            .setNegativeButton(context.resources.getString(R.string.common_no), noListener)
        if (TextUtils.isEmpty(title)) {
            builder.setTitle(title)
        }
        builder.create()
        builder.show()
    }

}