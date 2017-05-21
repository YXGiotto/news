package com.example.yls.news.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.yls.news.R;
import com.example.yls.news.model.Collect;
import com.example.yls.news.model.Comment;
import com.example.yls.news.model.NewsBean;

import java.text.SimpleDateFormat;
import java.util.Date;

import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.SaveListener;

public class BrowseActivity extends BaseActivity implements View.OnClickListener {
    private WebView wvNews;
    private EditText edtContentComment;
    private TextView tvSend;
    private ImageView ivComment;
    private ImageView ivCollect;
    private ImageView ivBack;
    @Override
    public int getLayoutResId() {
        return R.layout.activity_browse;
    }

    @Override
    protected void init() {
        super.init();
        String url=getIntent().getStringExtra("url");
        initView();
        wvNews.getSettings().setJavaScriptEnabled(true);
        wvNews.loadUrl(url);
        wvNews.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }
        });
    }

    private void initView() {
        wvNews = (WebView) findViewById(R.id.wv_news);
        edtContentComment = (EditText) findViewById(R.id.edt_content_comment);
        tvSend = (TextView) findViewById(R.id.tv_send);
        ivComment = (ImageView) findViewById(R.id.iv_comment);
        ivCollect = (ImageView) findViewById(R.id.iv_collect);
        ivBack= (ImageView) findViewById(R.id.iv_back);
        ivBack.setOnClickListener(this);
        tvSend.setOnClickListener(this);
        ivComment.setOnClickListener(this);
        ivCollect.setOnClickListener(this);
    }


    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == KeyEvent.KEYCODE_BACK) && wvNews.canGoBack()) {
            wvNews.goBack(); //goBack()表示返回WebView的上一页面
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tv_send:
                String content = edtContentComment.getText().toString();
                if (content.length()==0){
                    Toast.makeText(this, "评论不能为空!", Toast.LENGTH_SHORT).show();
                    return;
                }
                String uniquekey = getIntent().getStringExtra("uniquekey");
                //发表评论
                send(uniquekey,content,getCurrentTime());
                break;
            case R.id.iv_comment:
                String value = getIntent().getStringExtra("uniquekey");
                goTo(CommentActivity.class, false,"uniquekey",value);
                break;
            case R.id.iv_collect:
                String uniquekey2 = getIntent().getStringExtra("uniquekey");
                String title = getIntent().getStringExtra("title");
                String author_name =getIntent().getStringExtra("author_name");
                String url = getIntent().getStringExtra("url");
                String thumbnail_pic_s = getIntent().getStringExtra("thumbnail_pic_s");
                collect(title,author_name,url,thumbnail_pic_s,uniquekey2);
                break;

            case R.id.iv_back:
                finish();
            break;
        }
    }

    private void collect(String title, String author_name, String url, String thumbnail_pic_s,String uniquekey2) {
        Collect collect=new Collect();
        collect.setUniquekey(uniquekey2);
        collect.setTitle(title);
        collect.setAuthor_name(author_name);
        collect.setUrl(url);
        collect.setThumbnail_pic_s(thumbnail_pic_s);
        collect.save(new SaveListener<String>() {
            @Override
            public void done(String s, BmobException e) {
                if (e == null) {
                    Toast.makeText(BrowseActivity.this, "收藏成功", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(BrowseActivity.this, "收藏失败", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }


    public String getCurrentTime() {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date curDate = new Date(System.currentTimeMillis());
        String str = formatter.format(curDate);
        return str;
    }

    private void send(String uniquekey, String content, String currentTime) {
        Comment comment = new Comment();
        comment.setCommentTime(currentTime);
        comment.setContent(content);
        comment.setUniquekey(uniquekey);
        comment.save(new SaveListener<String>() {
            @Override
            public void done(String s, BmobException e) {
                if (e == null) {
                    edtContentComment.getText().clear();
                    Toast.makeText(BrowseActivity.this, "发表评论成功", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(BrowseActivity.this, "发表评论失败", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
