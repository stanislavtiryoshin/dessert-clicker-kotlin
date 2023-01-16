package androidx.databinding;

import android.view.View;

public class DataBinderMapperImpl extends MergedDataBinderMapper {
  DataBinderMapperImpl() {
    addMapper(new com.example.android.dessertclicker.DataBinderMapperImpl() {
      @Override
      public ViewDataBinding getDataBinder(androidx.databinding.DataBindingComponent bindingComponent, View[] view, int layoutId) {
        return null;
      }

      @Override
      public ViewDataBinding getDataBinder(androidx.databinding.DataBindingComponent bindingComponent, View view, int layoutId) {
        return null;
      }
    });
  }
}
