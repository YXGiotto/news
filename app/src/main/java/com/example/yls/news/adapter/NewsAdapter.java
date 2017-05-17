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
import com.example.yls.news.model.NewsBean;

/**
 * Created by yls on 2017/5/16.
 */

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.ViewHolder> {
    private NewsBean newsBean;
    private Context context;


    public NewsAdapter(Context context, NewsBean newsBean) {
        this.context = context;
        this.newsBean = newsBean;
    }



    @Override
    public NewsAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_news, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(NewsAdapter.ViewHolder holder, int position) {
        final NewsBean.ResultBean.DataBean dataBean = newsBean.getResult().getData().get(position);
        Glide.with(context).load(dataBean.getThumbnail_pic_s()).into(holder.ivcoverNews);
        holder.tvtitleNews.setText(dataBean.getTitle());
        holder.tvAuthorName.setText(dataBean.getAuthor_name());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context, BrowseActivity.class);
                intent.putExtra("url",dataBean.getUrl());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return newsBean.getResult().getData().size();
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
