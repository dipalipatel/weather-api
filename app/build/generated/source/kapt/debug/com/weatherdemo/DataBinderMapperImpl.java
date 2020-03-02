package com.weatherdemo;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.weatherdemo.databinding.RowEmptyLayoutBindingImpl;
import com.weatherdemo.databinding.RowListItemBindingImpl;
import com.weatherdemo.databinding.WeatherDetailActivityBindingImpl;
import com.weatherdemo.databinding.WeatherListActivityBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ROWEMPTYLAYOUT = 1;

  private static final int LAYOUT_ROWLISTITEM = 2;

  private static final int LAYOUT_WEATHERDETAILACTIVITY = 3;

  private static final int LAYOUT_WEATHERLISTACTIVITY = 4;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(4);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.weatherdemo.R.layout.row_empty_layout, LAYOUT_ROWEMPTYLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.weatherdemo.R.layout.row_list_item, LAYOUT_ROWLISTITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.weatherdemo.R.layout.weather_detail_activity, LAYOUT_WEATHERDETAILACTIVITY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.weatherdemo.R.layout.weather_list_activity, LAYOUT_WEATHERLISTACTIVITY);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ROWEMPTYLAYOUT: {
          if ("layout/row_empty_layout_0".equals(tag)) {
            return new RowEmptyLayoutBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for row_empty_layout is invalid. Received: " + tag);
        }
        case  LAYOUT_ROWLISTITEM: {
          if ("layout/row_list_item_0".equals(tag)) {
            return new RowListItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for row_list_item is invalid. Received: " + tag);
        }
        case  LAYOUT_WEATHERDETAILACTIVITY: {
          if ("layout/weather_detail_activity_0".equals(tag)) {
            return new WeatherDetailActivityBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for weather_detail_activity is invalid. Received: " + tag);
        }
        case  LAYOUT_WEATHERLISTACTIVITY: {
          if ("layout/weather_list_activity_0".equals(tag)) {
            return new WeatherListActivityBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for weather_list_activity is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(3);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "model");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(4);

    static {
      sKeys.put("layout/row_empty_layout_0", com.weatherdemo.R.layout.row_empty_layout);
      sKeys.put("layout/row_list_item_0", com.weatherdemo.R.layout.row_list_item);
      sKeys.put("layout/weather_detail_activity_0", com.weatherdemo.R.layout.weather_detail_activity);
      sKeys.put("layout/weather_list_activity_0", com.weatherdemo.R.layout.weather_list_activity);
    }
  }
}
