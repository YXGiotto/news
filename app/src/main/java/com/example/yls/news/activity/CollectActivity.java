package com.example.yls.news.activity;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.yls.news.R;
import com.example.yls.news.adapter.CollectAdapter;
import com.example.yls.news.adapter.NewsAdapter;
import com.example.yls.news.listener.OnLongClickListener;
import com.example.yls.news.model.Collect;
import com.example.yls.news.model.Comment;

import java.util.ArrayList;
import java.util.List;

import cn.bmob.v3.BmobQuery;
import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.FindListener;
import cn.bmob.v3.listener.UpdateListener;

public class CollectActivity extends BaseActivity implements View.OnClickListener,OnLongClickListener{
    private RecyclerView rvnews;
    private CollectAdapter collectAdapter;
    private List<Collect>collectList;
    private ImageView ivBack;
    private AlertDialog.Builder builder;
    @Override
    public int getLayoutResId() {
        return R.layout.activity_collect;
    }

    @Override
    protected void init() {
        super.init();
        initView();
        setAdapter();
        initData();
    }


    public void showAlertDialog(String msg, final String objectId) {
        if (builder == null) {
            builder = new AlertDialog.Builder(this);
        }
        builder.setMessage(msg);
        builder.setTitle("提示");
        builder.setPositiveButton("确认", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Collect collect=new Collect();
                collect.setObjectId(objectId);
                collect.delete(new UpdateListener() {
                    @Override
                    public void done(BmobException e) {
                        if(e==null){
                            Toast.makeText(CollectActivity.this, "删除成功", Toast.LENGTH_SHORT).show();
                                initData();
                        }else{
                            Toast.makeText(CollectActivity.this, "删除失败"+e.getMessage(), Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }
        });
        builder.setNegativeButton("取消", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        builder.create().show();

    }
    private void initData() {
        collectList.clear();
        BmobQuery<Collect> query = new BmobQuery<Collect>();
        query.findObjects(new FindListener<Collect>() {
            @Override
            public void done(List<Collect> object, BmobException e) {
                if(e==null){
                    for (Collect collect : object) {
                        collectList.add(collect);
                    }
                    collectAdapter.notifyDataSetChanged();

                }else{

                }
            }
        });
    }

    private void initView() {
        rvnews= (RecyclerView) findViewById(R.id.rv_news_list);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        rvnews.setLayoutManager(linearLayoutManager);
        ivBack= (ImageView) findViewById(R.id.iv_back);
        ivBack.setOnClickListener(this);
    }
    private void setAdapter() {
        collectList=new ArrayList<Collect>();
        collectAdapter=new CollectAdapter(CollectActivity.this,collectList);
        collectAdapter.setOnLongClickListener(this);
        rvnews.setAdapter(collectAdapter);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.iv_back:
                finish();
            break;
        }
    }

    @Override
    public void delCollect(String objectId) {
         showAlertDialog("确定删除该收藏?",objectId);
    }
}
