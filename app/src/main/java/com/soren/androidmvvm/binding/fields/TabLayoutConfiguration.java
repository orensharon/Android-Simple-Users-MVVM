package com.soren.androidmvvm.binding.fields;

import android.databinding.BaseObservable;
import android.databinding.BindingAdapter;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;

import com.soren.androidmvvm.BR;
import com.soren.androidmvvm.view.adapter.ViewPagerBindingAdapter;


public class TabLayoutConfiguration extends BaseObservable {

    private FragmentPagerAdapter adapter;

    public void setAdapter(ViewPagerBindingAdapter adapter) {
        this.adapter = adapter;
        notifyPropertyChanged(BR.adapter);
    }

    public FragmentPagerAdapter getAdapter() {
        return adapter;
    }

    @BindingAdapter({"bind:pager"})
    public static void bindViewPagerTabs(final TabLayout view, final ViewPager pagerView) {
        view.setupWithViewPager(pagerView, true);
    }

    @BindingAdapter("app:configuration")
    public static void configureTabLayoutView(ViewPager viewPager, TabLayoutConfiguration configuration) {
        viewPager.setAdapter(configuration.getAdapter());
    }
}