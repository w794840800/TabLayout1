package com.example.administrator.tablayout1;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.zip.Inflater;

/**
 * Created by Administrator on 2016/5/21.
 */
public class MyRecyclerAdapter extends RecyclerView.Adapter<MyRecyclerAdapter.MyViewHolder> {
    Context mContext;
    public MyRecyclerAdapter(Context context){
        mContext=context;
    }
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
      View myViewHolder= LayoutInflater.from(mContext).inflate(R.layout.item_recycler,parent,false);
        return new MyViewHolder(myViewHolder);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
   //
    }

    @Override
    public int getItemCount() {
        return 40;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        TextView textView;

    public MyViewHolder(View itemView) {
        super(itemView);
       // textView= (TextView) itemView.findViewById(R.id.item_recycler);


    }
}

}
