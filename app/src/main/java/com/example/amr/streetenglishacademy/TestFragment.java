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

public class TestFragment extends Fragment {

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
        mCItemList.add(new Content_Item(1, "Conversations", "Direct to Google Drive"));
        mCItemList.add(new Content_Item(2, "Idioms", "Direct to Google Drive"));
        mCItemList.add(new Content_Item(3, "Phrasal Verbs", "Direct to Google Drive"));
        mCItemList.add(new Content_Item(4, "Videos", "Direct to Google Drive"));
        mCItemList.add(new Content_Item(5, "Vocabulary", "Direct to Google Drive"));
        //Init adapter
        adapter = new Content_Adapter(getActivity(), mCItemList);
        lvProduct.setAdapter(adapter);

        lvProduct.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (view.getTag().toString().equals("1"))
                {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=0B4Db4KEZ1GtzcE5iNEpCa1FPZlk")));
                }
                else if (view.getTag().toString().equals("2"))
                {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/drive/folders/0B4Db4KEZ1GtzWXYwSEgxNjkyVWM")));
                }
                else if (view.getTag().toString().equals("3"))
                {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/drive/folders/0B4Db4KEZ1GtzVWNLaW5qdDJSMHM")));
                }
                else if (view.getTag().toString().equals("4"))
                {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/drive/folders/0B4Db4KEZ1GtzOTZIajhwang0TUU")));
                }
                else if (view.getTag().toString().equals("5"))
                {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/drive/folders/0B4Db4KEZ1GtzeWlfbVJMUXRTSzA")));
                }

            }
        });

        return myView;
    }
}
