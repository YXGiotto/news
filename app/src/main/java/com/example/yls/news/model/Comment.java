package com.example.yls.news.model;

import cn.bmob.v3.BmobObject;

/**
 * Created by asus- on 2017/5/19.
 */

public class Comment extends BmobObject {
    private String uniquekey;
    private String content;
    private String commentTime;

    public String getUniquekey() {
        return uniquekey;
    }

    public void setUniquekey(String uniquekey) {
        this.uniquekey = uniquekey;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(String commentTime) {
        this.commentTime = commentTime;
    }
}
