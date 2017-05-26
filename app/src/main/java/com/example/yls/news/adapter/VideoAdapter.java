package com.example.yls.news.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.yls.news.R;
import com.example.yls.news.activity.BrowseActivity;
import com.example.yls.news.listener.OnLongClickListener;
import com.example.yls.news.model.Collect;
import com.example.yls.news.model.Video;
import com.tencent.smtt.sdk.WebView;
import com.tencent.smtt.sdk.WebViewClient;

import java.util.List;



/**
 * Created by yls on 2017/5/16.
 */

public class VideoAdapter extends RecyclerView.Adapter<VideoAdapter.ViewHolder> {
    private List<Video>videoList;
    private Context context;


    public VideoAdapter(Context context, List<Video>videoList) {
        this.context = context;
        this.videoList = videoList;
    }



    @Override
    public VideoAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_video, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(VideoAdapter.ViewHolder holder, int position) {
        final Video video =videoList.get(position);
     /*   holder.jcVideoPlayerStandard.setUp(video.getVideoUrl(), JCVideoPlayer.SCREEN_LAYOUT_LIST, "MV");*/
        holder.webView.loadUrl(video.getVideoUrl());
        holder.webView.getSettings().setJavaScriptEnabled(true);
        holder.webView.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }
        });

    }

    @Override
    public int getItemCount() {
        return videoList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        WebView webView;
        public ViewHolder(View itemView) {
            super(itemView);
            webView= (WebView) itemView.findViewById(R.id.videoplayer);

        }
    }
}
