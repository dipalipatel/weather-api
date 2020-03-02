package com.weatherdemo.databinding;
import com.weatherdemo.R;
import com.weatherdemo.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class WeatherDetailActivityBindingImpl extends WeatherDetailActivityBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.toolbar, 7);
        sViewsWithIds.put(R.id.weatherDetailTxtLblName, 8);
        sViewsWithIds.put(R.id.weatherDetailTxtLblLat, 9);
        sViewsWithIds.put(R.id.weatherDetailTxtLblLongitude, 10);
        sViewsWithIds.put(R.id.weatherDetailTxtLblTempMin, 11);
        sViewsWithIds.put(R.id.weatherDetailTxtLblTempMax, 12);
        sViewsWithIds.put(R.id.weatherDetailTxtLblWindspeed, 13);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public WeatherDetailActivityBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 14, sIncludes, sViewsWithIds));
    }
    private WeatherDetailActivityBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.appcompat.widget.Toolbar) bindings[7]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[2]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[9]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[10]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[8]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[12]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[11]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[13]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[3]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[1]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[5]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[4]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[6]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.weatherDetailTxtLat.setTag(null);
        this.weatherDetailTxtLongitude.setTag(null);
        this.weatherDetailTxtName.setTag(null);
        this.weatherDetailTxtTempMax.setTag(null);
        this.weatherDetailTxtTempMin.setTag(null);
        this.weatherDetailTxtWindSpeed.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.model == variableId) {
            setModel((com.weatherdemo.model.ResponseModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setModel(@Nullable com.weatherdemo.model.ResponseModel Model) {
        this.mModel = Model;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.model);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        com.weatherdemo.model.ResponseModel model = mModel;
        java.lang.String stringValueOfModelWindSpeed = null;
        float modelMainTempMax = 0f;
        java.lang.String modelName = null;
        java.lang.String stringValueOfModelCoordLon = null;
        float modelWindSpeed = 0f;
        java.lang.String stringValueOfModelMainTempMax = null;
        java.lang.String stringValueOfModelMainTempMin = null;
        com.weatherdemo.model.ModelCoord modelCoord = null;
        com.weatherdemo.model.ModelWind modelWind = null;
        double modelCoordLat = 0.0;
        com.weatherdemo.model.ModelMain modelMain = null;
        java.lang.String stringValueOfModelCoordLat = null;
        double modelCoordLon = 0.0;
        float modelMainTempMin = 0f;

        if ((dirtyFlags & 0x3L) != 0) {



                if (model != null) {
                    // read model.name
                    modelName = model.getName();
                    // read model.coord
                    modelCoord = model.getCoord();
                    // read model.wind
                    modelWind = model.getWind();
                    // read model.main
                    modelMain = model.getMain();
                }


                if (modelCoord != null) {
                    // read model.coord.lat
                    modelCoordLat = modelCoord.getLat();
                    // read model.coord.lon
                    modelCoordLon = modelCoord.getLon();
                }
                if (modelWind != null) {
                    // read model.wind.speed
                    modelWindSpeed = modelWind.getSpeed();
                }
                if (modelMain != null) {
                    // read model.main.temp_max
                    modelMainTempMax = modelMain.getTemp_max();
                    // read model.main.temp_min
                    modelMainTempMin = modelMain.getTemp_min();
                }


                // read String.valueOf(model.coord.lat)
                stringValueOfModelCoordLat = java.lang.String.valueOf(modelCoordLat);
                // read String.valueOf(model.coord.lon)
                stringValueOfModelCoordLon = java.lang.String.valueOf(modelCoordLon);
                // read String.valueOf(model.wind.speed)
                stringValueOfModelWindSpeed = java.lang.String.valueOf(modelWindSpeed);
                // read String.valueOf(model.main.temp_max)
                stringValueOfModelMainTempMax = java.lang.String.valueOf(modelMainTempMax);
                // read String.valueOf(model.main.temp_min)
                stringValueOfModelMainTempMin = java.lang.String.valueOf(modelMainTempMin);
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.weatherDetailTxtLat, stringValueOfModelCoordLat);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.weatherDetailTxtLongitude, stringValueOfModelCoordLon);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.weatherDetailTxtName, modelName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.weatherDetailTxtTempMax, stringValueOfModelMainTempMax);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.weatherDetailTxtTempMin, stringValueOfModelMainTempMin);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.weatherDetailTxtWindSpeed, stringValueOfModelWindSpeed);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): model
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}