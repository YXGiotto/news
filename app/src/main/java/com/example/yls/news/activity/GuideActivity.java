package com.example.yls.news.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import android.widget.ViewFlipper;

import com.example.yls.news.MainActivity;
import com.example.yls.news.R;

public class GuideActivity extends BaseActivity {
    private ViewFlipper guide_flipper;
    private GestureDetector mGestureDetector;
    private TextView txtStart;
    private CustomGestureDetectorListener mDetectorListener;

    @Override
    public int getLayoutResId() {
        return R.layout.activity_guide;
    }

    @Override
    protected void init() {
        super.init();
        guide_flipper= (ViewFlipper) findViewById(R.id.guide_flipper);
        txtStart= (TextView) findViewById(R.id.txt_start);
        mDetectorListener=new CustomGestureDetectorListener();
        mGestureDetector=new GestureDetector(GuideActivity.this, mDetectorListener);
        txtStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goTo(MainActivity.class,true);
            }
        });
    }


    @Override
    public boolean onTouchEvent(MotionEvent event) {
        mGestureDetector.onTouchEvent(event);
        return super.onTouchEvent(event);
    }

    class CustomGestureDetectorListener extends GestureDetector.SimpleOnGestureListener{
        @Override
        public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
            if (e1.getX() > e2.getX()) { //如果初始触点的X坐标比最终触点的X坐标大表示向左滑动
                guide_flipper.showNext();
            }

            if (e1.getX() < e2.getX()) { //如果初始触点的X坐标比最终触点的X坐标小表示向右滑动
                guide_flipper.showPrevious();
            }

            return super.onFling(e1, e2, velocityX, velocityY);
        }
    }
}
