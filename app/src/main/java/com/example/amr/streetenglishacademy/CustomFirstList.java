package com.example.amr.streetenglishacademy;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class CustomFirstList extends ArrayAdapter<Integer> {

    private ArrayList<Integer> data_array;

    private Activity context;

    public CustomFirstList(Activity context, ArrayList<Integer> data_array) {
        super(context, R.layout.list_view_layout, data_array);
        this.context = context;
        this.data_array = data_array;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();

        View listViewItem = inflater.inflate(R.layout.list_view_layout, null, true);

        ImageView imageView = (ImageView) listViewItem.findViewById(R.id.imagevi);

        imageView.setImageResource(data_array.get(position));

        return listViewItem;
    }
}