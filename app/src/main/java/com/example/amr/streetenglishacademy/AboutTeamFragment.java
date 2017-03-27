package com.example.amr.streetenglishacademy;

import android.app.AlertDialog;
import android.app.Fragment;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class AboutTeamFragment extends Fragment {

    View view;
    private ArrayList<String> data = new ArrayList<String>();
    private ArrayList<String> datapos = new ArrayList<String>();
    private ArrayList<String> datades = new ArrayList<String>();
    private ArrayList<Integer> datapic = new ArrayList<Integer>();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.about_team_layout, container, false);

        ListView lv = (ListView) view.findViewById(R.id.listview_product);

        data.add("Ahmed Sharaf");
        datapos.add("President and Co-Founder");
        datades.add("Udacity was asked to work this application of MAL | Google | Udacity and took a certificate of them");
        datapic.add(R.mipmap.amr);

        data.add("Ismail Arafa");
        datapos.add("President and Co-Founder");
        datades.add("Udacity was asked to work this application of MAL | Google | Udacity and took a certificate of them");
        datapic.add(R.mipmap.amr);

        data.add("Mohammed Abdo");
        datapos.add("Operation Manger - English Instructor");
        datades.add("Udacity was asked to work this application of MAL | Google | Udacity and took a certificate of them");
        datapic.add(R.mipmap.amr);

        data.add("Doaa Mohammed");
        datapos.add("Princess");
        datades.add("Udacity was asked to work this application of MAL | Google | Udacity and took a certificate of them");
        datapic.add(R.mipmap.amr);

        data.add("Asmaa Mahmoud");
        datapos.add("Designer");
        datades.add("Udacity was asked to work this application of MAL | Google | Udacity and took a certificate of them");
        datapic.add(R.mipmap.amr);

        data.add("Amr Abdelhameed");
        datapos.add("Android Developer");
        datades.add("Udacity was asked to work this application of MAL | Google | Udacity and took a certificate of them");
        datapic.add(R.mipmap.amr);

        lv.setAdapter(new MyListAdaper(getActivity(), R.layout.list_item, data));

//        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
//                builder.setMessage(datades.get(position))
//                        .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
//                            public void onClick(DialogInterface dialog, int id) {
//                                // User cancelled the dialog
//                            }
//                        });
//                AlertDialog d = builder.create();
//                d.setTitle("About " + data.get(position));
//                d.show();
//            }
//        });

        return view;
    }

    private class MyListAdaper extends ArrayAdapter<String> {
        private int layout;
        private List<String> mObjects;

        private MyListAdaper(Context context, int resource, List<String> objects) {
            super(context, resource, objects);
            mObjects = objects;
            layout = resource;
        }

        @Override
        public View getView(final int position, View convertView, ViewGroup parent) {
            ViewHolder mainViewholder = null;
            if (convertView == null) {
                LayoutInflater inflater = LayoutInflater.from(getContext());
                convertView = inflater.inflate(layout, parent, false);
                ViewHolder viewHolder = new ViewHolder();
                viewHolder.title = (TextView) convertView.findViewById(R.id.list_item_text);
                viewHolder.des = (TextView) convertView.findViewById(R.id.destext);
                viewHolder.button = (Button) convertView.findViewById(R.id.list_item_btn);
                convertView.setTag(viewHolder);
            }
            mainViewholder = (ViewHolder) convertView.getTag();
            mainViewholder.button.setBackgroundResource(datapic.get(position));
            mainViewholder.button.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
//                    Toast.makeText(getContext(), "Button was clicked for list item " + position, Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(getContext(), ImageUser.class);
                    Bundle b = new Bundle();
                    b.putString("nname", data.get(position));
                    i.putExtras(b);
                    startActivity(i);
                }
            });

            mainViewholder.title.setText(data.get(position));
            mainViewholder.des.setText(datapos.get(position));

            mainViewholder.title.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                    builder.setMessage(datades.get(position))
                            .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {
                                    // User cancelled the dialog
                                }
                            });
                    AlertDialog d = builder.create();
                    d.setTitle("About " + data.get(position));
                    d.show();
                }
            });

            mainViewholder.des.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                    builder.setMessage(datades.get(position))
                            .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {
                                    // User cancelled the dialog
                                }
                            });
                    AlertDialog d = builder.create();
                    d.setTitle("About " + data.get(position));
                    d.show();
                }
            });

            return convertView;
        }
    }

    public class ViewHolder {

        TextView title, des;
        Button button;
    }
}