package com.example.amr.streetenglishacademy;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class AboutTeamAdapter extends BaseAdapter {

    private Context mContext;
    private ArrayList<UserItem> data;

    public AboutTeamAdapter(Context mContext, ArrayList<UserItem> data) {
        this.mContext = mContext;
        this.data = data;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        View v = View.inflate(mContext, R.layout.list_item, null);

        TextView title = (TextView) v.findViewById(R.id.list_item_text);
        TextView pos = (TextView) v.findViewById(R.id.postext);
        de.hdodenhof.circleimageview.CircleImageView image_user = v.findViewById(R.id.image_user);

        title.setText(data.get(position).getUserName());
        pos.setText(data.get(position).getUserPos());
        image_user.setImageResource(data.get(position).getUserPicture());

        image_user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(mContext, ImageUser.class);
                Bundle b = new Bundle();
                b.putInt("pic", data.get(position).getUserPicture());
                i.putExtras(b);
                mContext.startActivity(i);
            }
        });

        return v;
    }
}