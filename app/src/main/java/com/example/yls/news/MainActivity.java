package com.example.yls.news;

import android.support.annotation.IdRes;
import android.support.v4.app.FragmentTransaction;

import com.example.yls.news.activity.BaseFragmentActivity;
import com.example.yls.news.factory.FragmentFactory;
import com.example.yls.news.fragment.MyFragment;
import com.example.yls.news.fragment.VideoFragment;
import com.example.yls.news.fragment.IndexFragment;
import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnTabSelectListener;
import com.roughike.bottombar.TabSelectionInterceptor;

public class MainActivity extends BaseFragmentActivity {

    private BottomBar bottomBar;
    private IndexFragment indexFragment;
    private VideoFragment videoFragment;
    private MyFragment myFragment;

    @Override
    public int getLayoutResId() {
        return R.layout.activity_main;
    }

    @Override
    protected void init() {
        super.init();
        initView();
    }



    private void initView() {
        bottomBar = (BottomBar) findViewById(R.id.bottomBar);
        bottomBar.setOnTabSelectListener(new OnTabSelectListener() {
            @Override
            public void onTabSelected(@IdRes int tabId) {
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.frameLayout, FragmentFactory.getInstance().getFragment(tabId));
                fragmentTransaction.commit();
            }
        });
    }
}
