package com.example.yls.news.activity;

import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.yls.news.R;
import com.example.yls.news.model.Video;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import cn.bmob.v3.datatype.BmobFile;
import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.SaveListener;
import cn.bmob.v3.listener.UploadFileListener;

public class UploadVideoActivity extends BaseActivity {


    @BindView(R.id.btn1)
    Button btn1;
    @BindView(R.id.btn2)
    Button btn2;
    @BindView(R.id.btn3)
    Button btn3;
    @BindView(R.id.btn4)
    Button btn4;
    @BindView(R.id.btn5)
    Button btn5;
    @BindView(R.id.btn6)
    Button btn6;
    @BindView(R.id.btn7)
    Button btn7;
    @BindView(R.id.btn8)
    Button btn8;
   private String path=null;
    @Override
    public int getLayoutResId() {
        return R.layout.activity_upload_video;
    }

    @Override
    protected void init() {
        super.init();
        path= Environment.getExternalStorageDirectory().getAbsolutePath()+"/"+"mv";
        Toast.makeText(this,path, Toast.LENGTH_SHORT).show();
    }


    @OnClick({R.id.btn1, R.id.btn2, R.id.btn3, R.id.btn4, R.id.btn5, R.id.btn6, R.id.btn7, R.id.btn8})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn1:
                /*upload();*/
                String path1=path+"/"+"G-Eazy Kehlani - Good Life.mp4";
                upload(path1);
                break;
            case R.id.btn2:
                String path2=path+"/"+"Owl City Carly Rae Jepsen - Good Time.mp4";
                upload(path2);
                break;
            case R.id.btn3:
                String path3=path+"/"+"戴荃 - 悟空.mp4";
                upload(path3);
                break;
            case R.id.btn4:
                String path4=path+"/"+"李玉刚 - 刚好遇见你.mp4";
                upload(path4);
                break;
            case R.id.btn5:

                String path5=path+"/"+"刘思涵 - 走在冷风中.mp4";
                upload(path5);
                break;
            case R.id.btn6:
                String path6=path+"/"+"曲婉婷 - 我的歌声里.mp4";
                upload(path6);
                break;
            case R.id.btn7:
                String path7=path+"/"+"汪峰 - 像梦一样自由.mp4";
                upload(path7);
                break;
            case R.id.btn8:
                String path8=path+"/"+"薛之谦 - 刚刚好.mp4";
                upload(path8);
                break;
        }
    }

    private void upload(String picPath) {
        showProgressDialog("上传中....");
        final BmobFile bmobFile = new BmobFile(new File(picPath));
        bmobFile.uploadblock(new UploadFileListener() {

            @Override
            public void done(BmobException e) {
                if(e==null){
                    hideProgressDialog();
                    Toast.makeText(UploadVideoActivity.this, "上传成功", Toast.LENGTH_SHORT).show();
                    Video video=new Video();
                    video.setVideoUrl(bmobFile.getFileUrl());
                    video.save(new SaveListener<String>() {
                        @Override
                        public void done(String s, BmobException e) {
                            if (e==null){
                                Toast.makeText(UploadVideoActivity.this, "ok ok", Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
                   /* //bmobFile.getFileUrl()--返回的上传文件的完整地址
                    toast("上传文件成功:" + bmobFile.getFileUrl());*/
                }else{
                    /*toast("上传文件失败：" + e.getMessage());*/
                }

            }

            @Override
            public void onProgress(Integer value) {
                // 返回的上传进度（百分比）
            }
        });

    }
}
