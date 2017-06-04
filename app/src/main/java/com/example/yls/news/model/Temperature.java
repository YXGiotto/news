package com.example.yls.news.model;

import java.util.Date;

/**
 * Created by asus- on 2017/6/4.
 */

public class Temperature {
    public   int low;
    public  int high;
    public Date mDate;

    public Temperature(int low, int high, Date mDate) {
        this.high = high;
        this.low = low;
        this.mDate = mDate;
    }
}
