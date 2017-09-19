package com.example.amr.streetenglishacademy;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by amr on 17/09/17.
 */

public class MyListAdaper extends BaseAdapter {

    private Context mContext;
    private ArrayList<String> data , datapos, datades;
    private ArrayList<Integer> datapic;

    //Constructor
    public MyListAdaper(Context mContext, ArrayList<String> data, ArrayList<String> datapos, ArrayList<String> datades, ArrayList<Integer> datapic) {
        this.mContext = mContext;
        this.data = data;
        this.datapos = datapos;
        this.datades = datades;
        this.datapic = datapic;
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
        TextView des = (TextView) v.findViewById(R.id.destext);

        title.setText(data.get(position));
        pos.setText(datapos.get(position));
        des.setText(datades.get(position));

        title.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(mContext, ImageUser.class);
                Bundle b = new Bundle();
                b.putInt("pic", datapic.get(position));
                i.putExtras(b);
                mContext.startActivity(i);
            }
        });

        pos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(mContext, ImageUser.class);
                Bundle b = new Bundle();
                b.putInt("pic", datapic.get(position));
                i.putExtras(b);
                mContext.startActivity(i);
            }
        });

        des.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(mContext, ImageUser.class);
                Bundle b = new Bundle();
                b.putInt("pic", datapic.get(position));
                i.putExtras(b);
                mContext.startActivity(i);
            }
        });

        return v;
    }
}
