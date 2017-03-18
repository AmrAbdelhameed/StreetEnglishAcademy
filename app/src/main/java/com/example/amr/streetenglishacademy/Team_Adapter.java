package com.example.amr.streetenglishacademy;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by NgocTri on 11/15/2015.
 */
public class Team_Adapter extends BaseAdapter {

    private Context mContext;
    private List<Team_Item> mTeamItemList;

    //Constructor

    public Team_Adapter(Context mContext, List<Team_Item> mTeamItemList) {
        this.mContext = mContext;
        this.mTeamItemList = mTeamItemList;
    }

    @Override
    public int getCount() {
        return mTeamItemList.size();
    }

    @Override
    public Object getItem(int position) {
        return mTeamItemList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = View.inflate(mContext, R.layout.item_team_sea, null);
        TextView tvName = (TextView) v.findViewById(R.id.tv_name);
        TextView tvPrice = (TextView) v.findViewById(R.id.tv_price);
        TextView tvDescription = (TextView) v.findViewById(R.id.tv_description);
        //Set text for TextView
        tvName.setText("Name : " + mTeamItemList.get(position).getName());
        tvPrice.setText("Position : " + mTeamItemList.get(position).getPrice());
        tvDescription.setText("About " + mTeamItemList.get(position).getName() + " : " + mTeamItemList.get(position).getDescription());

        //Save product id to tag
        v.setTag(mTeamItemList.get(position).getId());

        return v;
    }
}
