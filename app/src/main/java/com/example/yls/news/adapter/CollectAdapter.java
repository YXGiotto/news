package com.example.yls.news.adapter;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
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
import com.example.yls.news.model.NewsBean;

import java.util.List;

/**
 * Created by yls on 2017/5/16.
 */

public class CollectAdapter extends RecyclerView.Adapter<CollectAdapter.ViewHolder> {
    private OnLongClickListener onLongClickListener;
    private List<Collect>collectList;
    private Context context;


    public CollectAdapter(Context context, List<Collect>collectList) {
        this.context = context;
        this.collectList = collectList;
    }

public void setOnLongClickListener(OnLongClickListener onLongClickListener){
    this.onLongClickListener=onLongClickListener;
}

    @Override
    public CollectAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_news, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CollectAdapter.ViewHolder holder, int position) {
        final Collect dataBean =collectList.get(position);
        Glide.with(context).load(dataBean.getThumbnail_pic_s()).into(holder.ivcoverNews);
        holder.tvtitleNews.setText(dataBean.getTitle());
        holder.tvAuthorName.setText(dataBean.getAuthor_name());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context, BrowseActivity.class);
                intent.putExtra("uniquekey",dataBean.getUniquekey());
                intent.putExtra("url",dataBean.getUrl());
                intent.putExtra("title",dataBean.getTitle());
                intent.putExtra("author_name",dataBean.getAuthor_name());
                intent.putExtra("thumbnail_pic_s",dataBean.getThumbnail_pic_s());
                context.startActivity(intent);
            }
        });

        holder.itemView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                onLongClickListener.delCollect(dataBean.getObjectId());
                return true;
            }
        });
    }

    @Override
    public int getItemCount() {
        return collectList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        ImageView ivcoverNews;
        TextView tvtitleNews;
        TextView tvAuthorName;

        public ViewHolder(View itemView) {
            super(itemView);
            ivcoverNews = (ImageView) itemView.findViewById(R.id.iv_cover_news);
            tvtitleNews = (TextView) itemView.findViewById(R.id.tv_title_news);
            tvAuthorName = (TextView) itemView.findViewById(R.id.tv_author_name);

        }
    }
}
