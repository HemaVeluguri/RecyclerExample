package com.example.navya.recyclerexample;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    Context context;
    String[] na;
    int[] im;

    public MyAdapter(MainActivity mainActivity, String[] names, int[] images) {

        this.context=mainActivity;
        this.im=images;
        this.na=names;
    }

    @NonNull
    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v=LayoutInflater.from(context).inflate(R.layout.rowdesign,parent,false);

        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.MyViewHolder holder, int position) {

        holder.iv.setImageResource(im[position]);
        holder.tv.setText(na[position]);
    }

    @Override
    public int getItemCount() {
        return im.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView iv;
        TextView tv;

        public MyViewHolder(View itemView) {
            super(itemView);

            iv=itemView.findViewById(R.id.imageview);
            tv=itemView.findViewById(R.id.textview);
        }
    }
}