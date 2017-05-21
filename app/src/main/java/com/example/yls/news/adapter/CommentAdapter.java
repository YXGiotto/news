package com.example.yls.news.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.yls.news.R;
import com.example.yls.news.model.Comment;

import java.util.List;


/**
 * Created by asus- on 2017/5/14.
 */

public class CommentAdapter extends RecyclerView.Adapter<CommentAdapter.ViewHolder> {
    private List<Comment> commentList;

    public CommentAdapter(List<Comment> commentList) {
        this.commentList = commentList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_comment, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Comment comment = commentList.get(position);
        holder.tvTime.setText(comment.getCommentTime());
        holder.tvContent.setText(comment.getContent());
    }

    @Override
    public int getItemCount() {

        return commentList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvTime;
        TextView tvContent;

        public ViewHolder(View itemView) {
            super(itemView);
            tvTime = (TextView) itemView.findViewById(R.id.tv_time_comment);
            tvContent = (TextView) itemView.findViewById(R.id.tv_content_comment);

        }
    }
}
