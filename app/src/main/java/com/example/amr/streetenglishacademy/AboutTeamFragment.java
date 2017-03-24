package com.example.amr.streetenglishacademy;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 12/31/15.
 */
public class AboutTeamFragment extends Fragment {

    View view;
    private ListView lvProduct;
    private Team_Adapter adapter;
    private List<Team_Item> mTeamItemList;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.about_team_layout, container, false);

        lvProduct = (ListView) view.findViewById(R.id.listview_product);

        mTeamItemList = new ArrayList<>();
        //Add sample data for list
        //We can get data from DB, webservice here
        mTeamItemList.add(new Team_Item(1, "Ahmed Sharaf", "President and Co-Founder", "kalaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaam"));
        mTeamItemList.add(new Team_Item(2, "Ismail Arafa", "President and Co-Founder", ""));
        mTeamItemList.add(new Team_Item(3, "Mohammed Abdo", "Operation Manger - English Instructor", ""));
        mTeamItemList.add(new Team_Item(4, "Doaa Mohammed", "Princess", ""));
        mTeamItemList.add(new Team_Item(5, "Asmaa Mahmoud", "Designer", ""));
        mTeamItemList.add(new Team_Item(6, "Amr Abdelhameed", "Android Developer", "kalaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaam"));

        //Init adapter
        adapter = new Team_Adapter(getActivity(), mTeamItemList);
        lvProduct.setAdapter(adapter);

        lvProduct.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent i = new Intent(getActivity(), ImageUser.class);
                Bundle b = new Bundle();
                b.putString("nid", view.getTag().toString());
                b.putString("nname", mTeamItemList.get(position).getName());
                b.putString("ndes", mTeamItemList.get(position).getDescription());
                i.putExtras(b);
                startActivity(i);

            }
        });

        return view;
    }
}