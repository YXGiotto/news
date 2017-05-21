package com.example.yls.news.activity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.inputmethod.InputMethodManager;

import cn.bmob.v3.Bmob;


/**
 * Created by yls on 2016/12/28.
 */

public abstract class BaseFragmentActivity extends FragmentActivity {
    private ProgressDialog mProgressDialog;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutResId());
        init();
    }

    protected void init() {

    }

    public abstract int getLayoutResId();

    public void goTo(Class activity,boolean isFinish) {
        Intent intent = new Intent(this, activity);
        startActivity(intent);
        if (isFinish){
            finish();
        }
    }
    public void goTo(Class activity,boolean isFinish,String key,String value) {
        Intent intent = new Intent(this, activity);
        intent.putExtra(key,value);
        startActivity(intent);
        if (isFinish){
            finish();
        }
    }


    public void showProgressDialog(String msg) {
        if (mProgressDialog == null) {
            mProgressDialog = new ProgressDialog(this);
        }
        mProgressDialog.setMessage(msg);
        mProgressDialog.show();
    }

    public void hideProgressDialog() {
        mProgressDialog.hide();
    }
//隐藏软件盘
    public void hideKeyBoard() {
        InputMethodManager inputMethodManager = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
        inputMethodManager.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);
    }
}
