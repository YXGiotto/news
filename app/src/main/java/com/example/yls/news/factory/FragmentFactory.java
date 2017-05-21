package com.example.yls.news.factory;

import android.support.v4.app.Fragment;

import com.example.yls.news.R;
import com.example.yls.news.fragment.IndexFragment;
import com.example.yls.news.fragment.MyFragment;
import com.example.yls.news.fragment.VideoFragment;

/**
 * Created by asus- on 2017/5/20.
 */

public class FragmentFactory {
    private static FragmentFactory instance;
    private IndexFragment indexFragment;
    private MyFragment myFragment;
    private VideoFragment videoFragment;

    public static FragmentFactory getInstance() {
        if (instance == null) {
            synchronized (FragmentFactory.class) {
                instance = new FragmentFactory();
            }
        }

        return instance;
    }

    public Fragment getFragment(int tabId) {
        switch (tabId) {
            case R.id.tab_index:
                return getIndexFragment();
            case R.id.tab_video:
                return getVideoFragment();
            case R.id.tab_me:
                return getMyFragment();
        }
        return null;
    }

    public Fragment getIndexFragment() {
        if (indexFragment == null) {
            indexFragment = new IndexFragment();
        }
        return indexFragment;
    }

    public Fragment getMyFragment() {
        if (myFragment == null) {
            myFragment = new MyFragment();
        }
        return myFragment;
    }

    public Fragment getVideoFragment() {
        if (videoFragment == null) {
            videoFragment = new VideoFragment();
        }
        return videoFragment;
    }

}
