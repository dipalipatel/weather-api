package com.weatherdemo.adapter

import android.app.Activity
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView
import com.google.gson.Gson
import com.weatherdemo.R
import com.weatherdemo.databinding.RowListItemBinding
import com.weatherdemo.model.ResponseModel
import com.weatherdemo.utils.CommonMethod
import com.weatherdemo.utils.CommonVariables
import com.weatherdemo.view.WeatherDetailActivity

class MyWeatherDataAdapter(
    private val mContext: Activity,
    val mResponseModelList: ArrayList<ResponseModel>

) : RecyclerView.Adapter<MyWeatherDataAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val layoutInflater = LayoutInflater.from(mContext)
        val binding = DataBindingUtil.inflate<ViewDataBinding>(
            layoutInflater,
            R.layout.row_list_item,
            parent,
            false
        )
        return MyViewHolder(binding as RowListItemBinding)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        //set data in adapter
        holder.mBinding.rowListItemTxtTempratureValue.text =
            mResponseModelList[position].main.temp.toString()
        holder.mBinding.rowListItemTxtDateValue.text =
            CommonMethod.convertDateFormate(
                CommonVariables.DATABASE_DATE_FORMAT,
                CommonVariables.DISPLAY_DATE_FORMAT,
                mResponseModelList[position].currentdt
            )
    }

    override fun getItemCount(): Int {
        return mResponseModelList.size
    }

    inner class MyViewHolder(internal val mBinding: RowListItemBinding) :
        RecyclerView.ViewHolder(mBinding.root) {

        init {
            //click event
            mBinding.rowListItemCardView.setOnClickListener {
                mBinding.rowListItemTxtViewMore.performClick()
            }
            mBinding.rowListItemTxtViewMore.setOnClickListener {
                var intent = Intent(mContext, WeatherDetailActivity::class.java)
                intent.putExtra(
                    CommonVariables.INTENT_JSON_MODEL_STR,
                    Gson().toJson(mResponseModelList[adapterPosition])
                )
                CommonMethod.startActivity(intent, mContext)
            }
        }
    }
}
