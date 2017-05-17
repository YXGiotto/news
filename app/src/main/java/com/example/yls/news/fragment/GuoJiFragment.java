package com.example.yls.news.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.yls.news.R;
import com.example.yls.news.adapter.NewsAdapter;
import com.example.yls.news.model.NewsBean;
import com.google.gson.Gson;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by yls on 2017/5/16.
 */

public class GuoJiFragment extends Fragment{
    private RecyclerView rvnews;
    private NewsAdapter newsAdapter;
    private NewsBean newsBean;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_guoji,null);
        initView(view);
        requestData();
        return view;
    }

    private void requestData() {
        final OkHttpClient client=new OkHttpClient();
        final Request request=new Request.Builder().url("http://v.juhe.cn/toutiao/index?type=guoji&key=1953e0eee44fab207a57718d22cb479e").build();
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    String data=client.newCall(request).execute().body().string();
                    Log.d("dd",data);
                    Gson gson=new Gson();
                    newsBean= gson.fromJson(data,NewsBean.class);
                    getActivity().runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            setAdapter();
                        }
                    });
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();

    }

    private void setAdapter() {
        newsAdapter=new NewsAdapter(getActivity(),newsBean);
        rvnews.setAdapter(newsAdapter);
    }

    private void initView( View view) {
        rvnews= (RecyclerView) view.findViewById(R.id.rv_news_list);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getActivity());
        rvnews.setLayoutManager(linearLayoutManager);
    }
}
