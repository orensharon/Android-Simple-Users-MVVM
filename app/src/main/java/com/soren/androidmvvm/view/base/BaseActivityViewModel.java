package com.soren.androidmvvm.view.base;

import android.content.Intent;
import android.databinding.BaseObservable;
import android.support.v7.app.AppCompatActivity;

public abstract class BaseActivityViewModel<A extends AppCompatActivity> extends BaseObservable
        implements ActivityLifeCycle{

    protected A activity;

    public BaseActivityViewModel(A activity) {
        this.activity = activity;
    }

    public A getActivity() {
        return activity;
    }

    @Override
    public void onCreate() {

    }

    @Override
    public void onStart() {

    }

    @Override
    public void onResume() {

    }

    @Override
    public void onPause() {

    }

    @Override
    public void onStop() {

    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {

    }

    @Override
    public boolean onBackPressed() {
        return false;
    }
}
