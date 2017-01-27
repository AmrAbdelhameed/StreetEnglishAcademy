package com.example.amr.streetenglishacademy;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

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
        mCItemList.add(new Content_Item(1, "Conversation", "116 items"));
        mCItemList.add(new Content_Item(2, "Idioms", "40 items"));
        mCItemList.add(new Content_Item(3, "Phrasal Verbs", "30 items"));
        mCItemList.add(new Content_Item(4, "Videos", "60 items"));
        mCItemList.add(new Content_Item(5, "Vocabulary", "25 items"));
        mCItemList.add(new Content_Item(6, "Exercises", "80 items"));

        //Init adapter
        adapter = new Content_Adapter(getActivity(), mCItemList);
        lvProduct.setAdapter(adapter);

        lvProduct.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(getActivity(), mCItemList.get(position).getNamecontent() + " and id = " + view.getTag().toString(), Toast.LENGTH_SHORT).show();
            }
        });

        return myView;
    }
}
