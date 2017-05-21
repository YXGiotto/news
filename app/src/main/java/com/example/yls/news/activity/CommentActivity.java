package com.example.yls.news.activity;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.yls.news.R;
import com.example.yls.news.adapter.CommentAdapter;
import com.example.yls.news.model.Comment;

import java.util.ArrayList;
import java.util.List;

import cn.bmob.v3.BmobQuery;
import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.FindListener;

public class CommentActivity extends BaseActivity implements View.OnClickListener{
    RecyclerView rvComment;
    private CommentAdapter commentAdapter;
    private List<Comment>commentList;
    private ImageView ivBack;
    @Override
    public int getLayoutResId() {
        return R.layout.activity_comment;
    }

    @Override
    protected void init() {
        super.init();
        rvComment = (RecyclerView) findViewById(R.id.rv_comment);
        ivBack= (ImageView) findViewById(R.id.iv_back);
        ivBack.setOnClickListener(this);
        initData();
        commentAdapter = new CommentAdapter(commentList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        rvComment.setLayoutManager(linearLayoutManager);
        rvComment.setAdapter(commentAdapter);

    }

    private void initData() {
        String value = getIntent().getStringExtra("uniquekey");
        commentList=new ArrayList<Comment>();
        BmobQuery<Comment> query = new BmobQuery<Comment>();
        query.addWhereEqualTo("uniquekey", value);
        query.findObjects(new FindListener<Comment>() {
            @Override
            public void done(List<Comment> object, BmobException e) {
                if(e==null){
                    for (Comment comment : object) {
                           commentList.add(comment);
                    }
                    commentAdapter.notifyDataSetChanged();
                }else{
                    Log.i("bmob","失败："+e.getMessage()+","+e.getErrorCode());
                }
            }
        });

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.iv_back:
                finish();
            break;
        }
    }
}
