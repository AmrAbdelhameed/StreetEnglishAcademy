package com.example.amr.streetenglishacademy;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class FirstFragment extends Fragment {

    View view;
    RecyclerView recycler_view;
    ArrayList<HomeItem> data;
    HomeItem homeItem;
    FirstLayoutAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.first_layout, container, false);

        recycler_view = view.findViewById(R.id.recycler_view);

        data = new ArrayList<HomeItem>();

        homeItem = new HomeItem();
        homeItem.setNameH("Kids");
        homeItem.setShortDesc("Short Description");
        homeItem.setImageH(R.mipmap.el2ola);
        data.add(homeItem);

        homeItem = new HomeItem();
        homeItem.setNameH("Adults");
        homeItem.setShortDesc("Short Description");
        homeItem.setImageH(R.mipmap.eltania);
        data.add(homeItem);

        homeItem = new HomeItem();
        homeItem.setNameH("Teachers");
        homeItem.setShortDesc("Short Description");
        homeItem.setImageH(R.mipmap.eltalta);
        data.add(homeItem);

        homeItem = new HomeItem();
        homeItem.setNameH("Online");
        homeItem.setShortDesc("Short Description");
        homeItem.setImageH(R.mipmap.elrab3a);
        data.add(homeItem);

        adapter = new FirstLayoutAdapter(getActivity(), data);
        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(getActivity(), 2);
        recycler_view.setLayoutManager(mLayoutManager);
        recycler_view.setItemAnimator(new DefaultItemAnimator());
        recycler_view.setAdapter(adapter);

        return view;
    }
}
