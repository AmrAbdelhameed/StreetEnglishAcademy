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

        lvProduct = (ListView)view.findViewById(R.id.listview_product);

        mTeamItemList = new ArrayList<>();
        //Add sample data for list
        //We can get data from DB, webservice here
        mTeamItemList.add(new Team_Item(1, "Amr","01063593802", "kalaaaaaaaaaaaaaaaaaaaam Ktiiiiir"));
        mTeamItemList.add(new Team_Item(2, "Ahmed", "01063593802", "kalaaaaaaaaaaaaaaaaaaaam Ktiiiiir"));
        mTeamItemList.add(new Team_Item(3, "Sayed", "01063593802", "kalaaaaaaaaaaaaaaaaaaaam Ktiiiiir"));
        mTeamItemList.add(new Team_Item(4, "Ibrahim", "01063593802", "kalaaaaaaaaaaaaaaaaaaaam Ktiiiiir"));
        mTeamItemList.add(new Team_Item(5, "Dalia", "01063593802", "kalaaaaaaaaaaaaaaaaaaaam Ktiiiiir"));
        mTeamItemList.add(new Team_Item(6, "Heba", "01063593802", "kalaaaaaaaaaaaaaaaaaaaam Ktiiiiir"));
        mTeamItemList.add(new Team_Item(7, "Moahmmed", "01063593802", "kalaaaaaaaaaaaaaaaaaaaam Ktiiiiir"));
        mTeamItemList.add(new Team_Item(8, "Ziad", "01063593802", "kalaaaaaaaaaaaaaaaaaaaam Ktiiiiir"));
        mTeamItemList.add(new Team_Item(9, "Gehan", "01063593802", "kalaaaaaaaaaaaaaaaaaaaam Ktiiiiir"));
        mTeamItemList.add(new Team_Item(10, "Mariam", "01063593802", "kalaaaaaaaaaaaaaaaaaaaam Ktiiiiir"));
        mTeamItemList.add(new Team_Item(11, "Karim", "01063593802", "kalaaaaaaaaaaaaaaaaaaaam Ktiiiiir"));

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
                i.putExtras(b);
                startActivity(i);
                //Toast.makeText(getApplicationContext(), mTeamItemList.get(position).getName()+" and id = "+view.getTag().toString(), Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }
}
