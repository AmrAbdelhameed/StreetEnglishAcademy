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
    private ListView lvProduct;
    private Content_Adapter adapter;
    private List<Content_Item> mCItemList;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.second_layout, container, false);

        lvProduct = (ListView) myView.findViewById(R.id.listview_product2);

        mCItemList = new ArrayList<>();
        //Add sample data for list
        //We can get data from DB, webservice here
        mCItemList.add(new Content_Item(8, "Phonetics", "Direct to Google Drive"));
        mCItemList.add(new Content_Item(5, "Vocabulary", "Direct to Google Drive"));
        mCItemList.add(new Content_Item(9, "Grammar", "Direct to Google Drive"));
        mCItemList.add(new Content_Item(10, "Listening", "Direct to Google Drive"));
        mCItemList.add(new Content_Item(11, "Reading", "Direct to Google Drive"));
        mCItemList.add(new Content_Item(4, "Videos", "Direct to Google Drive"));
        mCItemList.add(new Content_Item(1, "Conversations", "Direct to Google Drive"));
        mCItemList.add(new Content_Item(2, "Idioms", "Direct to Google Drive"));
        mCItemList.add(new Content_Item(3, "Phrasal Verbs", "Direct to Google Drive"));
        mCItemList.add(new Content_Item(6, "Exercises", "Direct to Google Drive"));
        mCItemList.add(new Content_Item(7, "Tests", "Direct to Google Drive"));
        mCItemList.add(new Content_Item(12, "TOEFL", "Direct to Google Drive"));
        mCItemList.add(new Content_Item(13, "IELTS", "Direct to Google Drive"));
        mCItemList.add(new Content_Item(14, "Miscellaneous", "Direct to Google Drive"));

        //Init adapter
        adapter = new Content_Adapter(getActivity(), mCItemList);
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
