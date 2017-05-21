package com.example.yls.news.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.yls.news.R;
import com.example.yls.news.activity.BaseActivity;
import com.example.yls.news.adapter.MyFragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by yls on 2016/12/28.
 */

public  class IndexFragment extends BaseFragment {
    private ViewPager mViewPager;
    private TabLayout mViewPagerTitle;
    private MyFragmentPagerAdapter mMyFragmentPagerAdapter;
    private List<Fragment> mFragmentList;
    private List<String> titleFragmentList;

    @Override
    public int getLayoutResId() {
        return R.layout.fragment_index;
    }

    @Override
    protected void init(View root) {
        super.init(root);
        initView(root);
        initData();
    }


    private void initData() {
        titleFragmentList = new ArrayList<String>();
        titleFragmentList.add("头条");
        titleFragmentList.add("国内");
        titleFragmentList.add("国际");
        mFragmentList = new ArrayList<Fragment>();
        NewsFragment touTiaoFragment = new NewsFragment();
        Bundle touTiaoBundle = new Bundle();
        touTiaoBundle.putInt("NEWSTYPE", 1);
        touTiaoFragment.setArguments(touTiaoBundle);
        NewsFragment guoNeiFragment = new NewsFragment();
        Bundle guoNeiBundle = new Bundle();
        guoNeiBundle.putInt("NEWSTYPE", 2);
        guoNeiFragment.setArguments(guoNeiBundle);
        NewsFragment guoJiFragment = new NewsFragment();
        Bundle guoJiBundle = new Bundle();
        guoJiBundle.putInt("NEWSTYPE", 3);
        guoJiFragment.setArguments(guoJiBundle);
        mFragmentList.add(touTiaoFragment);
        mFragmentList.add(guoNeiFragment);
        mFragmentList.add(guoJiFragment);
        mMyFragmentPagerAdapter = new MyFragmentPagerAdapter(getActivity().getSupportFragmentManager(), mFragmentList, titleFragmentList);
        mViewPagerTitle.addTab(mViewPagerTitle.newTab().setText(titleFragmentList.get(0)));
        mViewPagerTitle.addTab(mViewPagerTitle.newTab().setText(titleFragmentList.get(1)));
        mViewPagerTitle.addTab(mViewPagerTitle.newTab().setText(titleFragmentList.get(2)));
        mViewPager.setAdapter(mMyFragmentPagerAdapter);
        mViewPagerTitle.setupWithViewPager(mViewPager);
    }

    private void initView(View root) {
        mViewPager = (ViewPager)root.findViewById(R.id.viewPager);
        mViewPagerTitle = (TabLayout) root.findViewById(R.id.title_viewPager);
    }

}
