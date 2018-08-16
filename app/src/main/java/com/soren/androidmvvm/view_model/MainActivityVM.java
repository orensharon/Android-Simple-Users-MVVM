package com.soren.androidmvvm.view_model;


import android.support.v4.app.Fragment;

import com.soren.androidmvvm.binding.fields.TabLayoutConfiguration;
import com.soren.androidmvvm.view.MainActivity;
import com.soren.androidmvvm.view.adapter.ViewPagerBindingAdapter;
import com.soren.androidmvvm.view.base.BaseActivityViewModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivityVM extends BaseActivityViewModel<MainActivity> {

    public final TabLayoutConfiguration tabLayoutConfiguration;


    public MainActivityVM(MainActivity activity) {
        super(activity);
        this.tabLayoutConfiguration = new TabLayoutConfiguration();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        this.initTabs();
    }

    private void initTabs() {
        List<Fragment> tabs = new ArrayList<>();
        tabs.add(new Fragment());
        tabs.add(new Fragment());
        ViewPagerBindingAdapter adapter = new ViewPagerBindingAdapter(getActivity().getSupportFragmentManager(), tabs);
        this.tabLayoutConfiguration.setAdapter(adapter);
    }
}
