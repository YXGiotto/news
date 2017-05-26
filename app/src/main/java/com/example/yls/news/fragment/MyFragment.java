package com.example.yls.news.fragment;

import android.view.View;
import android.widget.TextView;

import com.example.yls.news.R;
import com.example.yls.news.activity.CollectActivity;
import com.example.yls.news.activity.UploadVideoActivity;
import com.example.yls.news.fragment.BaseFragment;

public class MyFragment extends BaseFragment implements View.OnClickListener{
    private TextView tvCollect;
    private TextView tvUpload;
    @Override
    public int getLayoutResId() {
        return R.layout.fragment_my;
    }


    @Override
    protected void init(View root) {
        super.init(root);
        initView(root);
    }

    private void initView(View root) {
        tvCollect= (TextView) root.findViewById(R.id.tv_collect_my);
        tvUpload=(TextView) root.findViewById(R.id.upload);
        tvCollect.setOnClickListener(this);
        tvUpload.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
         switch (v.getId()){
             case R.id.tv_collect_my:
                 goTo(CollectActivity.class,false);
             break;
             case R.id.upload:
                 goTo(UploadVideoActivity.class,false);
                 break;
         }
    }
}
