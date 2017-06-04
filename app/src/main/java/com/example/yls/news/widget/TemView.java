package com.example.yls.news.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;

import com.example.yls.news.model.TempPoint;
import com.example.yls.news.model.Temperature;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by asus- on 2017/6/4.
 */

public class TemView extends View{
   private ArrayList<Temperature> temList =  new ArrayList<>();
    private ArrayList<TempPoint> pointList = new ArrayList<>();
    private Paint paint = new Paint();
    private int radius = 10;
    public TemView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initTempList();
        calPoint();
    }

    public void calPoint() {
        for (int i = 0; i <temList.size() ; i++) {
            int x = 50 + (i*150);
            int lowy = (40 - (temList.get(i).low)) * 10;
            int highy = (40 - (temList.get(i).high)) * 10;
            TempPoint point = new TempPoint(x, lowy, highy);
            pointList.add(point);
        }
    }

    public void initTempList() {
        Temperature t1 = new Temperature(12, 26, new Date(2017, 5, 1));
        Temperature t2 = new Temperature(14, 32, new Date(2017, 5, 2));
        Temperature t3 = new Temperature(16, 29, new Date(2017, 5, 3));
        Temperature t4 = new Temperature(13, 31, new Date(2017, 5, 4));
        Temperature t5 = new Temperature(15, 28, new Date(2017, 5, 5));
        temList.add(t1);
        temList.add(t2);
        temList.add(t3);
        temList.add(t4);
        temList.add(t5);
        temList.add(t1);
        temList.add(t2);
        temList.add(t3);
        temList.add(t4);
        temList.add(t5);

    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        drawPoints(canvas);
        drawLint(canvas);

    }

    public void drawLint(Canvas canvas) {
        Path lowPath = new Path();
        Path hignPath = new Path();
        for (int i = 0; i <pointList.size() ; i++) {
            TempPoint tempPoint=pointList.get(i);
            if(i==0){
                lowPath.moveTo(tempPoint.x, tempPoint.lowy);
                hignPath.moveTo(tempPoint.x, tempPoint.highy);
            }else {
                lowPath.lineTo(tempPoint.x, tempPoint.lowy);
                hignPath.lineTo(tempPoint.x, tempPoint.highy);
            }
        }

        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(5);
        paint.setColor(Color.GREEN);
        canvas.drawPath(lowPath, paint);

        paint.setColor(Color.RED);
        canvas.drawPath(hignPath, paint);

    }

    public void drawPoints(Canvas canvas) {
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        for(int i=0;  i<pointList.size(); i++) {
            TempPoint tp = pointList.get(i);

            paint.setColor(Color.GREEN);
            canvas.drawCircle(tp.x, tp.lowy, radius, paint);

            paint.setColor(Color.RED);
            canvas.drawCircle(tp.x, tp.highy, radius, paint);
        }

    }


}
