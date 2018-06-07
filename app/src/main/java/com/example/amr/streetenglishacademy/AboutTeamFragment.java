package com.example.amr.streetenglishacademy;

import android.app.AlertDialog;
import android.app.Fragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class AboutTeamFragment extends Fragment {

    View view;
    MyListAdaper adaper;
    ArrayList<UserItem> data;
    UserItem userItem;
    ListView lv;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.about_team_layout, container, false);

        lv = (ListView) view.findViewById(R.id.listview_product);

        data = new ArrayList<UserItem>();

        userItem = new UserItem();
        userItem.setUserName("Ismail Arafa");
        userItem.setUserPos("President");
        userItem.setUserDescription("Faculty of arts at ain shams university");
        userItem.setUserPicture(R.mipmap.i1);
        data.add(userItem);

        userItem = new UserItem();
        userItem.setUserName("Ahmed Atef");
        userItem.setUserPos("Vice president");
        userItem.setUserDescription("Faculty of commerce english section at ain shams university");
        userItem.setUserPicture(R.mipmap.i2);
        data.add(userItem);

        userItem = new UserItem();
        userItem.setUserName("Yasmin Abdelrazik");
        userItem.setUserPos("Evaluator");
        userItem.setUserDescription("Faculty of commerce at al-azher university");
        userItem.setUserPicture(R.mipmap.i16);
        data.add(userItem);

        userItem = new UserItem();
        userItem.setUserName("Mohammed Abdeltwab");
        userItem.setUserPos("Instructor");
        userItem.setUserDescription("Faculty of commerce at ain shams university");
        userItem.setUserPicture(R.mipmap.i21);
        data.add(userItem);

        userItem = new UserItem();
        userItem.setUserName("Amr Abdelhameed");
        userItem.setUserPos("Android Developer");
        userItem.setUserDescription("Faculty of computer and information science at ain shams university");
        userItem.setUserPicture(R.mipmap.amr);
        data.add(userItem);

        adaper = new MyListAdaper(getActivity(), data);
        lv.setAdapter(adaper);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {

                // TODO Auto-generated method stub
                AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                builder.setMessage(data.get(arg2).getUserDescription())
                        .setPositiveButton(R.string.cancel, new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {

                            }
                        });
                AlertDialog d = builder.create();
                d.setTitle(data.get(arg2).getUserName());
                d.show();
            }
        });

        return view;
    }
}