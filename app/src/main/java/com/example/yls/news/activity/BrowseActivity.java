package com.example.yls.news.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.yls.news.R;

public class BrowseActivity extends BaseActivity {
    private WebView wvNews;
    @Override
    public int getLayoutResId() {
        return R.layout.activity_browse;
    }

    @Override
    protected void init() {
        super.init();
        String url=getIntent().getStringExtra("url");
        wvNews = (WebView) findViewById(R.id.wv_news);
        wvNews.getSettings().setJavaScriptEnabled(true);
        wvNews.loadUrl(url);
        wvNews.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }
        });
    }



    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == KeyEvent.KEYCODE_BACK) && wvNews.canGoBack()) {
            wvNews.goBack(); //goBack()表示返回WebView的上一页面
            return true;
        }
        return super.onKeyDown(keyCode,event);
    }
}
