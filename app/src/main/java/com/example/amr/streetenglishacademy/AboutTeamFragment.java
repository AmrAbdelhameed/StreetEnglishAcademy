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
        datades.add("Faculty of arts ain shams university");
        datapic.add(R.mipmap.i1);

        data.add("Ahmed Atef");
        datapos.add("Vice president");
        datades.add("Faculty of commerce english section ain shams university");
        datapic.add(R.mipmap.i2);

        data.add("Maged Moustafa");
        datapos.add("Vice president");
        datades.add("Faculty of commerce english section helwan university -Business adminstration");
        datapic.add(R.mipmap.i3);

        data.add("Mohammed aymn");
        datapos.add("Vice president)");
        datades.add("Faculty of commerce english section helwan university");
        datapic.add(R.mipmap.i4);

        data.add("Omnia Youssef");
        datapos.add("Team leader");
        datades.add("Faculty of science ain shams university");
        datapic.add(R.mipmap.i5);

        data.add("Alshimaa Mamdoah");
        datapos.add("Team leader");
        datades.add("Al–Azhar University Faculty of Humanities _Persian Department");
        datapic.add(R.mipmap.i6);

        data.add("Sara Khiry");
        datapos.add("Team leader");
        datades.add("Faculty of physical education");
        datapic.add(R.mipmap.i7);

        data.add("Aya Mohammed");
        datapos.add("Team leader");
        datades.add("Faculty of commerce and business administration");
        datapic.add(R.mipmap.i8);

        data.add("Eslam Abdelshafy");
        datapos.add("Team leader");
        datades.add("Faculty of engineering helwan university");
        datapic.add(R.mipmap.i9);

        data.add("Mohammed Arafa");
        datapos.add("Evaluator");
        datades.add("Faculty of business administration helwan university");
        datapic.add(R.mipmap.i10);

        data.add("Fatma Ali");
        datapos.add("Evaluator");
        datades.add("Faculty of arts zagazig university philosophy department");
        datapic.add(R.mipmap.i11);

        data.add("Rehab Mohammed");
        datapos.add("Evaluator");
        datades.add("Faculty of commerce and business adminsistration");
        datapic.add(R.mipmap.i12);

        data.add("Samir Sabry");
        datapos.add("Evaluator");
        datades.add("Faculty of commerce english section helwan university");
        datapic.add(R.mipmap.i13);

        data.add("Amira Maghwery");
        datapos.add("Evaluator");
        datades.add("Faculty of commerce ain shams university");
        datapic.add(R.mipmap.i14);

        data.add("Amany Adel");
        datapos.add("Evaluator");
        datades.add("Faculty of art ain shams university philosophy department");
        datapic.add(R.mipmap.i15);

        data.add("Yasmin Abdelrazik");
        datapos.add("Evaluator");
        datades.add("Faculty of commerce al azher university");
        datapic.add(R.mipmap.i16);

        data.add("Norhan Khaled");
        datapos.add("Instructor");
        datades.add("Faculty of commerce cairo university");
        datapic.add(R.mipmap.i17);

        data.add("Amira Saad");
        datapos.add("Instructor");
        datades.add("Faculty of arts ain shams univrrsity media department");
        datapic.add(R.mipmap.i18);

        data.add("Mohammed Alsisi");
        datapos.add("Instructor");
        datades.add("Faculty of language and translation");
        datapic.add(R.mipmap.i19);

        data.add("Asmaa Ezzat");
        datapos.add("Instructor");
        datades.add("Faculty of arts cairo university");
        datapic.add(R.mipmap.i20);

        data.add("Mohammed Abdeltwab");
        datapos.add("Instructor");
        datades.add("Faculty of commerce ain shams university");
        datapic.add(R.mipmap.i21);

        data.add("Maha Hamdy");
        datapos.add("Instructor");
        datades.add("Faculty of commerce cairo university");
        datapic.add(R.mipmap.i22);

        data.add("Amr Abdelhameed");
        datapos.add("Android Developer");
        datades.add("Faculty of computer and information science ain shams university");
        datapic.add(R.mipmap.amr);

        adaper = new MyListAdaper(getActivity(), data, datapos, datades, datapic);
        lv.setAdapter(adaper);

        return view;
    }
}