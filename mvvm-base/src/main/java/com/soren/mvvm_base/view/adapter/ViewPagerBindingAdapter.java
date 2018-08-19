package com.soren.mvvm_base.view.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

public class ViewPagerBindingAdapter extends FragmentPagerAdapter {

    private List<Fragment> tabs;
    private String[] tabTitles;

    public ViewPagerBindingAdapter(FragmentManager fm, List<Fragment> tabs, String[] tabTitles) {
        super(fm);
        this.tabs = tabs;
        this.tabTitles = tabTitles;
    }

    @Override
    public Fragment getItem(int position) {
        return tabs.get(position);
    }

    @Override
    public int getCount() {
        return tabs.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return this.tabTitles[position];
    }
}
