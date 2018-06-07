package com.example.amr.streetenglishacademy;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class ContentAdapter extends BaseAdapter {

    private Context mContext;
    private List<ContentItem> mCItemList;

    //Constructor

    public ContentAdapter(Context mContext, List<ContentItem> mTeamItemList) {
        this.mContext = mContext;
        this.mCItemList = mTeamItemList;
    }

    @Override
    public int getCount() {
        return mCItemList.size();
    }

    @Override
    public Object getItem(int position) {
        return mCItemList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = View.inflate(mContext, R.layout.item_content, null);
        TextView tvName = (TextView) v.findViewById(R.id.tv_namecontent);
        TextView tvPrice = (TextView) v.findViewById(R.id.tv_no_of_items);

        //Set text for TextView
        tvName.setText(mCItemList.get(position).getNameContent());
        tvPrice.setText(mCItemList.get(position).getOpenDriveMsg());

        v.setTag(mCItemList.get(position).getId());

        return v;
    }
}
