package com.example.yls.news.fragment;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.yls.news.R;
import com.example.yls.news.adapter.VideoAdapter;
import com.example.yls.news.model.Video;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import cn.bmob.v3.BmobQuery;
import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.FindListener;


public class VideoFragment extends BaseFragment {
    private RecyclerView rvVideo;
    private List<Video>videoList;
    private VideoAdapter videoAdapter;
    @Override
    public int getLayoutResId() {
        return R.layout.fragment_video;
    }

    @Override
    protected void init(View root) {
        super.init(root);
        rvVideo= (RecyclerView) root.findViewById(R.id.rv_video);
        videoList=new ArrayList<>();
        videoAdapter=new VideoAdapter(getActivity(),videoList);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getActivity());
        rvVideo.setLayoutManager(linearLayoutManager);
        rvVideo.setAdapter(videoAdapter);
        initData();
    }

    private void initData() {
        videoList.clear();
        BmobQuery<Video> query = new BmobQuery<Video>();
        query.findObjects(new FindListener<Video>() {
            @Override
            public void done(List<Video> object, BmobException e) {
                if(e==null){
                    for (Video video : object) {
                        videoList.add(video);
                    }
                    videoAdapter.notifyDataSetChanged();
                }else{

                }
            }
        });
    }


}
