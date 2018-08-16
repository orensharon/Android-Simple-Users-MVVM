package com.soren.androidmvvm.view.base;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.annotation.LayoutRes;
import android.support.v7.app.AppCompatActivity;

public abstract class BindingActivity<B extends ViewDataBinding, VM extends BaseActivityViewModel> extends AppCompatActivity {

    private B binding;
    private VM viewModel;

    public abstract VM onCreate();
    public abstract @IdRes int getVariable();
    public abstract @LayoutRes int getLayoutId();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.bind();
        this.viewModel.onCreate();
    }

    @Override
    protected void onStart() {
        super.onStart();
        viewModel.onStart();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        this.viewModel.onActivityResult(requestCode, resultCode, data);
    }

    @Override
    protected void onResume() {
        super.onResume();
        this.viewModel.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        this.viewModel.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
        this.viewModel.onStop();
    }

    @Override
    public void onBackPressed() {
        if (!this.viewModel.onBackPressed()) {
            super.onBackPressed();
        }
    }

    public B getBinding() {
        return binding;
    }

    public void bind() {
        binding = DataBindingUtil.setContentView(this, getLayoutId());
        this.viewModel = viewModel == null ? onCreate() : this.viewModel;
        binding.setVariable(getVariable(), this.viewModel);
        binding.executePendingBindings();
    }
}
