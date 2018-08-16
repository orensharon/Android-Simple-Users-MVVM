package com.soren.androidmvvm.view;

import com.soren.androidmvvm.R;
import com.soren.androidmvvm.BR;
import com.soren.androidmvvm.databinding.ActivityMainBinding;
import com.soren.androidmvvm.view_model.MainActivityVM;
import com.soren.mvvm_base.view.base.BindingActivity;

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

}
