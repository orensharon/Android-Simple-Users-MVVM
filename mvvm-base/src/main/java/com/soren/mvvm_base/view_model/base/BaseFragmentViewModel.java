package com.soren.mvvm_base.view_model.base;

import android.app.Activity;
import android.content.Intent;
import android.databinding.BaseObservable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

import com.soren.mvvm_base.view.base.BindingFragment;

public abstract class BaseFragmentViewModel<F extends BindingFragment> extends BaseObservable
        implements FragmentLifeCycle {

    private F fragment;
    private Activity activity;

    public BaseFragmentViewModel(F fragment) {
        this.fragment = fragment;
        this.activity = fragment.getActivity();
    }

    public F getFragment() {
        return fragment;
    }

    public Fragment getParentFragment() {
        return fragment.getParentFragment();
    }

    public AppCompatActivity getActivity() {
        return (AppCompatActivity) activity;
    }

    @Override
    public void onViewCreated() {

    }

    @Override
    public void onStart() {

    }

    @Override
    public void onStop() {

    }

    @Override
    public void onDestroy() {

    }

    @Override
    public void onPause() {

    }

    @Override
    public void onResume() {

    }

    @Override
    public void onDestroyView() {

    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {

    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {

    }

    @Override
    public void onSaveInstanceState(Bundle outState) {

    }

    @Override
    public void onViewStateRestored(Bundle savedInstanceState) {

    }
}