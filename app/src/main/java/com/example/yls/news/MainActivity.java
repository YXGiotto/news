package com.example.yls.news;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

import com.example.yls.news.adapter.MyFragmentPagerAdapter;
import com.example.yls.news.fragment.GuoJiFragment;
import com.example.yls.news.fragment.GuoNeiFragment;
import com.example.yls.news.fragment.TouTiaoFragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends FragmentActivity {
    private ViewPager mViewPager;
    private TabLayout mViewPagerTitle;
    private MyFragmentPagerAdapter mMyFragmentPagerAdapter;
    private List<Fragment> mFragmentList;
    private List<String>titleFragmentList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
    }

    private void initData() {
        titleFragmentList=new ArrayList<String>();
        titleFragmentList.add("头条");
        titleFragmentList.add("国内");
        titleFragmentList.add("国际");
        mFragmentList = new ArrayList<Fragment>();
        TouTiaoFragment touTiaoFragment=new TouTiaoFragment();
        GuoNeiFragment guoNeiFragment=new GuoNeiFragment();
        GuoJiFragment guoJiFragment=new GuoJiFragment();
        mFragmentList.add(touTiaoFragment);
        mFragmentList.add(guoNeiFragment);
        mFragmentList.add(guoJiFragment);
        mMyFragmentPagerAdapter=new MyFragmentPagerAdapter(getSupportFragmentManager(),mFragmentList,titleFragmentList);
        mViewPagerTitle.addTab(mViewPagerTitle.newTab().setText(titleFragmentList.get(0)));
        mViewPagerTitle.addTab(mViewPagerTitle.newTab().setText(titleFragmentList.get(1)));
        mViewPagerTitle.addTab(mViewPagerTitle.newTab().setText(titleFragmentList.get(2)));
        mViewPager.setAdapter(mMyFragmentPagerAdapter);
        mViewPagerTitle.setupWithViewPager(mViewPager);
    }

    private void initView() {
        mViewPager = (ViewPager) findViewById(R.id.viewPager);
        mViewPagerTitle = (TabLayout) findViewById(R.id.title_viewPager);
    }
}
