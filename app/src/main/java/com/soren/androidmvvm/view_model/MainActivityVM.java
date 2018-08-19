package com.soren.androidmvvm.view_model;


import android.support.v4.app.Fragment;

import com.soren.androidmvvm.view.MainActivity;
import com.soren.androidmvvm.view.profile.ProfileFragment;
import com.soren.androidmvvm.view.users.UsersFragment;
import com.soren.mvvm_base.binding.fields.TabLayoutConfiguration;
import com.soren.mvvm_base.view.adapter.ViewPagerBindingAdapter;
import com.soren.mvvm_base.view_model.base.BaseActivityViewModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivityVM extends BaseActivityViewModel<MainActivity> {

    public final TabLayoutConfiguration tabLayoutConfiguration;

    private List<Fragment> tabs;

    public MainActivityVM(MainActivity activity) {
        super(activity);
        this.tabLayoutConfiguration = new TabLayoutConfiguration();
        this.initTabs();
    }

    private void initTabs() {
        this.tabs = new ArrayList<>();
        this.tabs.add(UsersFragment.getInstance());
        this.tabs.add(ProfileFragment.getInstance());
        String[] tabTitles = new String[] { "Users", "Me" };
        this.tabLayoutConfiguration.setAdapter(new ViewPagerBindingAdapter(getActivity().getSupportFragmentManager(), this.tabs, tabTitles));
    }
}
