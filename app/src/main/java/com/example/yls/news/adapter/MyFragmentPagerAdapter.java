package com.example.yls.news.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by yls on 2017/5/16.
 */

public class MyFragmentPagerAdapter extends FragmentPagerAdapter {
    private List<Fragment>mFragmentList;
    private List<String>titleFragmentList;

    public MyFragmentPagerAdapter(FragmentManager fm,List<Fragment>mFragmentList,List<String>titleFragmentList) {
        super(fm);
        this.mFragmentList=mFragmentList;
        this.titleFragmentList=titleFragmentList;
    }

    @Override
    public Fragment getItem(int position) {
        return mFragmentList.get(position);
    }

    @Override
    public int getCount() {
        return mFragmentList.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titleFragmentList.get(position);
    }
}
