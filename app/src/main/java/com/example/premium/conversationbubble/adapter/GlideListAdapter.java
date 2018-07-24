package com.example.premium.conversationbubble.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.example.premium.conversationbubble.R;

import java.util.ArrayList;



public class GlideListAdapter extends RecyclerView.Adapter<GlideListAdapter.ViewHolder> {

    Context applicationContext;
    ArrayList<String> list=new ArrayList<String> ();

    public GlideListAdapter(Context applicationContext, ArrayList<String> list) {
        this.applicationContext = applicationContext;
        this.list = list;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.inflate_glide_image_load, parent, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;

    }


    public void onBindViewHolder( ViewHolder holder, int position) {

        Glide.with(applicationContext)
                .load(list.get(position))
                .into(holder.iv_pic);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {

        public final TextView tv_name;
        public final ImageView iv_pic;

        public ViewHolder(View view)
        {
            super(view);
            tv_name =  view.findViewById(R.id.tv_name);
            iv_pic = view.findViewById(R.id.iv_pic);
        }

    }
}
