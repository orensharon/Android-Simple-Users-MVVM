package com.soren.androidmvvm.view;

import android.os.Bundle;

import com.soren.androidmvvm.R;
import com.soren.androidmvvm.BR;
import com.soren.androidmvvm.binding.fields.TabLayoutConfiguration;
import com.soren.androidmvvm.databinding.ActivityMainBinding;
import com.soren.androidmvvm.view.base.BindingActivity;
import com.soren.androidmvvm.view_model.MainActivityVM;

public class MainActivity extends BindingActivity<ActivityMainBinding, MainActivityVM> {

    @Override
    public MainActivityVM onCreate() {
        return new MainActivityVM(this);
    }

    @Override
    public int getVariable() {
        return BR.viewModel;
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
