package com.example.yls.news.fragment;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

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

public class NewsFragment extends BaseFragment{
    private RecyclerView rvnews;
    private NewsAdapter newsAdapter;
    private NewsBean newsBean;
    private final String URL1 = "http://v.juhe.cn/toutiao/index?type=top&key=951120925db65e7801656e888efa6c4c";
    private final String URL2 = "http://v.juhe.cn/toutiao/index?type=guonei&key=951120925db65e7801656e888efa6c4c";
    private final String URL3 = "http://v.juhe.cn/toutiao/index?type=guoji&key=951120925db65e7801656e888efa6c4c";

    @Override
    public int getLayoutResId() {
        return R.layout.fragment_news;
    }

    @Override
    protected void init(View root) {
        super.init(root);
        initView(root);
        requestData();
    }

    private void requestData() {
        int mType= getArguments().getInt("NEWSTYPE");
        String url=null;
        switch (mType){
            case 1:
                url=URL1;
                break;
            case 2:
                url=URL2;
                break;

            case 3:
                url=URL3;
                break;
            default:
                break;

        }
        final OkHttpClient client=new OkHttpClient();
        final Request request=new Request.Builder().url(url).build();
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

    private void initView(View view) {
        rvnews= (RecyclerView) view.findViewById(R.id.rv_news_list);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getActivity());
        rvnews.setLayoutManager(linearLayoutManager);
    }


}
