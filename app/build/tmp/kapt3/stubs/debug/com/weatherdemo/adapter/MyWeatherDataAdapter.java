package com.weatherdemo.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0016B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b\u00a2\u0006\u0002\u0010\tJ\b\u0010\f\u001a\u00020\rH\u0016J\u001c\u0010\u000e\u001a\u00020\u000f2\n\u0010\u0010\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0011\u001a\u00020\rH\u0016J\u001c\u0010\u0012\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\rH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R!\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0017"}, d2 = {"Lcom/weatherdemo/adapter/MyWeatherDataAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/weatherdemo/adapter/MyWeatherDataAdapter$MyViewHolder;", "mContext", "Landroid/app/Activity;", "mResponseModelList", "Ljava/util/ArrayList;", "Lcom/weatherdemo/model/ResponseModel;", "Lkotlin/collections/ArrayList;", "(Landroid/app/Activity;Ljava/util/ArrayList;)V", "getMResponseModelList", "()Ljava/util/ArrayList;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "MyViewHolder", "app_debug"})
public final class MyWeatherDataAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.weatherdemo.adapter.MyWeatherDataAdapter.MyViewHolder> {
    private final android.app.Activity mContext = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<com.weatherdemo.model.ResponseModel> mResponseModelList = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.weatherdemo.adapter.MyWeatherDataAdapter.MyViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.weatherdemo.adapter.MyWeatherDataAdapter.MyViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.weatherdemo.model.ResponseModel> getMResponseModelList() {
        return null;
    }
    
    public MyWeatherDataAdapter(@org.jetbrains.annotations.NotNull()
    android.app.Activity mContext, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.weatherdemo.model.ResponseModel> mResponseModelList) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/weatherdemo/adapter/MyWeatherDataAdapter$MyViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "mBinding", "Lcom/weatherdemo/databinding/RowListItemBinding;", "(Lcom/weatherdemo/adapter/MyWeatherDataAdapter;Lcom/weatherdemo/databinding/RowListItemBinding;)V", "getMBinding$app_debug", "()Lcom/weatherdemo/databinding/RowListItemBinding;", "app_debug"})
    public final class MyViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.weatherdemo.databinding.RowListItemBinding mBinding = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.weatherdemo.databinding.RowListItemBinding getMBinding$app_debug() {
            return null;
        }
        
        public MyViewHolder(@org.jetbrains.annotations.NotNull()
        com.weatherdemo.databinding.RowListItemBinding mBinding) {
            super(null);
        }
    }
}