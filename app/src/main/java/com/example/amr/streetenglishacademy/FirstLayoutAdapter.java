package com.example.amr.streetenglishacademy;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

public class FirstLayoutAdapter extends RecyclerView.Adapter<FirstLayoutAdapter.MyViewHolder> {

    private Context mContext;
    private List<HomeItem> data;

    public FirstLayoutAdapter(Context mContext, List<HomeItem> data) {
        this.mContext = mContext;
        this.data = data;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_view_layout, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {

        final HomeItem item = data.get(position);
        holder.name.setText(item.getNameH());
        holder.image.setBackgroundResource(item.getImageH());

        holder.btnMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(mContext, DetailsActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("name", item.getNameH());
                bundle.putString("desc", item.getDesc());
                bundle.putInt("image", item.getImageH());
                i.putExtras(bundle);
                mContext.startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView name;
        public Button image, btnMore;

        public MyViewHolder(View view) {
            super(view);
            name = view.findViewById(R.id.name);
            image = view.findViewById(R.id.image);
            btnMore = view.findViewById(R.id.btnMore);
        }
    }
}