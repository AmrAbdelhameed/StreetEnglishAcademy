package com.example.amr.streetenglishacademy;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ThirdFragment extends Fragment {

    View myView;

    TextView t, t2;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.third_layout, container, false);

        t = (TextView) myView.findViewById(R.id.address_sea);
        //description_sea
        t2 = (TextView) myView.findViewById(R.id.description_sea);

        t.setText(R.string.address);

        t2.setText(R.string.about);
        return myView;
    }
}
