package com.example.amr.streetenglishacademy;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;

public class AboutTeamFragment extends Fragment {

    View view;
    MyListAdaper adaper;
    private ArrayList<String> data,datades, datapos;
    private ArrayList<Integer> datapic;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.about_team_layout, container, false);

        ListView lv = (ListView) view.findViewById(R.id.listview_product);

        data = new ArrayList<String>();
        datapos = new ArrayList<String>();
        datades = new ArrayList<String>();
        datapic = new ArrayList<Integer>();

        data.add("Ismail Arafa");
        datapos.add("President");
        datades.add("Faculty of arts at ain shams university");
        datapic.add(R.mipmap.i1);

        data.add("Ahmed Atef");
        datapos.add("Vice president");
        datades.add("Faculty of commerce english section at ain shams university");
        datapic.add(R.mipmap.i2);

        data.add("Yasmin Abdelrazik");
        datapos.add("Evaluator");
        datades.add("Faculty of commerce at al-azher university");
        datapic.add(R.mipmap.i16);

        data.add("Mohammed Abdeltwab");
        datapos.add("Instructor");
        datades.add("Faculty of commerce at ain shams university");
        datapic.add(R.mipmap.i21);

        data.add("Amr Abdelhameed");
        datapos.add("Android Developer");
        datades.add("Faculty of computer and information science at ain shams university");
        datapic.add(R.mipmap.amr);

        adaper = new MyListAdaper(getActivity(), data, datapos, datades, datapic);
        lv.setAdapter(adaper);

        return view;
    }
}