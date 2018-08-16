package com.soren.androidmvvm.view.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

public class ViewPagerBindingAdapter extends FragmentPagerAdapter {

    public interface OnItemClickListener {
        void onItemClick(Fragment fragment);
    }

    private int holderLayout, variableId;
    protected List<Fragment> tabs;

    private OnItemClickListener onItemClickListener;

    public ViewPagerBindingAdapter(FragmentManager fm, List<Fragment> tabs) {
        super(fm);
        this.tabs = tabs;
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    @Override
    public Fragment getItem(int position) {
        return tabs.get(position);
    }

    @Override
    public int getCount() {
        return tabs.size();
    }
}
