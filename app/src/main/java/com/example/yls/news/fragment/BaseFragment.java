package com.example.yls.news.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;


/**
 * Created by yls on 2016/12/28.
 */

public abstract class BaseFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root=inflater.inflate(getLayoutResId(),null);
        init(root);
        return root;

    }
    public abstract int getLayoutResId();
    protected  void init(View root){

    }
    /*public void goTo(Class activity){
        Intent intent = new Intent(getContext(), activity);
        startActivity(intent);
        getActivity().finish();
    }*/
    public void goTo(Class activity,boolean isFinished){
        Intent intent = new Intent(getActivity(), activity);
        startActivity(intent);
        if(isFinished){
            getActivity().finish();
        }

    }

}
