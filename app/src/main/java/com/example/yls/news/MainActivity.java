package com.example.yls.news;

import android.support.annotation.IdRes;
import android.support.v4.app.FragmentTransaction;

import com.example.yls.news.activity.BaseFragmentActivity;
import com.example.yls.news.factory.FragmentController;
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
    private FragmentController controller;

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
        controller=FragmentController.getInstance(this,R.id.frameLayout);
        controller.showFragment(0);
        bottomBar = (BottomBar) findViewById(R.id.bottomBar);
        bottomBar.setOnTabSelectListener(new OnTabSelectListener() {
            @Override
            public void onTabSelected(@IdRes int tabId) {
                switch (tabId){
                    case R.id.tab_index:
                        controller.showFragment(0);
                    break;
                    case R.id.tab_video:
                        controller.showFragment(1);
                        break;
                    case R.id.tab_me:
                        controller.showFragment(2);
                        break;
                }

                /*FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.frameLayout, FragmentFactory.getInstance().getFragment(tabId));
                fragmentTransaction.commit();*/
            }
        });
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        FragmentController.destoryController();

    }




}
