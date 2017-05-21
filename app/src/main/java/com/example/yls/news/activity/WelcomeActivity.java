package com.example.yls.news.activity;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.yls.news.MainActivity;
import com.example.yls.news.R;
import com.example.yls.news.utils.SPUtils;

import org.jsoup.Jsoup;

public class WelcomeActivity extends BaseActivity{


    @Override
    public int getLayoutResId() {
        return R.layout.activity_welcome;
    }

    @Override
    protected void init() {
        super.init();
        if(SPUtils.getIsFirstRun(WelcomeActivity.this)) {
             goTo(GuideActivity.class,true);
            SPUtils.setIsFristRun(WelcomeActivity.this,false);
        }else {
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                   goTo(MainActivity.class,true);
                }
            }, 2000);
        }
    }
}
