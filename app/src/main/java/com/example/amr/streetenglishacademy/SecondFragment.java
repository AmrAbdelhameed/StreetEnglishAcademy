package com.example.amr.streetenglishacademy;

import android.app.Fragment;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class SecondFragment extends Fragment {

    View myView;
    ListView lvProduct;
    ContentAdapter adapter;
    List<ContentItem> mCItemList;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.second_layout, container, false);

        lvProduct = (ListView) myView.findViewById(R.id.listview_product2);

        mCItemList = new ArrayList<>();

        mCItemList.add(new ContentItem(8, "Phonetics", "Opening in Google Drive."));
        mCItemList.add(new ContentItem(5, "Vocabulary", "Opening in Google Drive."));
        mCItemList.add(new ContentItem(9, "Grammar", "Opening in Google Drive."));
        mCItemList.add(new ContentItem(10, "Listening", "Opening in Google Drive."));
        mCItemList.add(new ContentItem(11, "Reading", "Opening in Google Drive."));
        mCItemList.add(new ContentItem(4, "Videos", "Opening in Google Drive."));
        mCItemList.add(new ContentItem(1, "Conversations", "Opening in Google Drive."));
        mCItemList.add(new ContentItem(2, "Idioms", "Opening in Google Drive."));
        mCItemList.add(new ContentItem(3, "Phrasal Verbs", "Opening in Google Drive."));
        mCItemList.add(new ContentItem(6, "Exercises", "Opening in Google Drive."));
        mCItemList.add(new ContentItem(7, "Tests", "Opening in Google Drive."));
        mCItemList.add(new ContentItem(12, "TOEFL", "Opening in Google Drive."));
        mCItemList.add(new ContentItem(13, "IELTS", "Opening in Google Drive."));
        mCItemList.add(new ContentItem(14, "Miscellaneous", "Opening in Google Drive."));

        //Init adapter
        adapter = new ContentAdapter(getActivity(), mCItemList);
        lvProduct.setAdapter(adapter);

        lvProduct.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (view.getTag().toString().equals("1")) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1GJsqjfG8WrrnkAZv-fXAK9c-QKZqe1qv")));
                } else if (view.getTag().toString().equals("2")) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1rx_n9c-jnNcRXjgt-Kj98O1bduva5Shn")));
                } else if (view.getTag().toString().equals("3")) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1Qzuk1f9Ax4i0LJrlwOjABnyYZojyTG4l")));
                } else if (view.getTag().toString().equals("4")) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1v7mPiC5OZIHrhZ2hGYUXfg_EalDylD6K")));
                } else if (view.getTag().toString().equals("5")) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1E9cFrKFA_88dk6OD7bZb7tycNmk1fGfn")));
                } else if (view.getTag().toString().equals("6")) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=13bHTN8tzVFzTxXzMKuThkYncLgh4Wit0")));
                } else if (view.getTag().toString().equals("7")) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1teHp7lL7EwKFIGB1CEfzh2p827FIODre")));
                } else if (view.getTag().toString().equals("8")) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1jdsL9A0oLmOimnOlT2p4iB9vTXngG-a8")));
                } else if (view.getTag().toString().equals("9")) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1dkP_SCnldeXXiK1bzSoOjRTu3tNrKqKN")));
                } else if (view.getTag().toString().equals("10")) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1iaqS4bkAXEHyy0scQCLbB4-lrETiQSNC")));
                } else if (view.getTag().toString().equals("11")) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1c9o1caG28iIsEDAF5gWEYPo-0TXhO9Vi")));
                } else if (view.getTag().toString().equals("12")) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=17-_90o7g6f0AMQPAu8LjXxcenC5fqt_i")));
                } else if (view.getTag().toString().equals("13")) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1RkpoyaJX-G6R535ma6ILGFTEaW7pzcja")));
                } else if (view.getTag().toString().equals("14")) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1OT58SgQuZo2mS_4Rwxi5QeYl8H7WaLxw")));
                }
            }
        });

        return myView;
    }
}
