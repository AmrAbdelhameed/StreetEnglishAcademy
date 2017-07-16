package com.example.amr.streetenglishacademy;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class FirstFragment extends Fragment {

    View view;
    ListView listView;
    ArrayList<Integer> arr;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.first_layout, container, false);

        listView = (ListView) view.findViewById(R.id.listView);

        arr = new ArrayList<Integer>();

        arr.add(R.mipmap.el2ola);
        arr.add(R.mipmap.eltania);
        arr.add(R.mipmap.eltalta);
        arr.add(R.mipmap.elrab3a);

        CustomFirstList cl = new CustomFirstList(getActivity(), arr);
        listView.setAdapter(cl);

        return view;
    }
}
