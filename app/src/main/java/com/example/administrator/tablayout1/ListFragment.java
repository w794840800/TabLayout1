package com.example.administrator.tablayout1;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Administrator on 2016/5/21.
 */
public class ListFragment extends Fragment {
    private RecyclerView recyclerView;

    public View onCreateView(LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {


        recyclerView= (RecyclerView) inflater.inflate(R.layout.fragment_recycler,container,false);

        return recyclerView;

    }

    @Override
    public void onActivityCreated( Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(new MyRecyclerAdapter(getActivity()));
    }
}
