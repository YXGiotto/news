package com.example.yls.news.model;

import java.util.Set;

import cn.bmob.v3.BmobObject;

/**
 * Created by asus- on 2017/5/26.
 */

public class Video extends BmobObject{
    private String videoUrl;

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }
}
