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

    TextView t,t2;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.third_layout, container, false);

        t = (TextView)myView.findViewById(R.id.address_sea);
        //description_sea
        t2 = (TextView)myView.findViewById(R.id.description_sea);

        t.setText("40 شارع الدقي - اعلي سوبر ماركت اسواق الحبايب - الدور الثاني - دقيقة واحده من محطة مترو الدقي");

        t2.setText("احنا تيم Street English Academy هدفنا انك توصل للاحتراف في تعلم اللغة الإنجليزية و وعشان كده عملنا ورش عمل (كورسات) من البداية للاحتراف ( ما تخفاش من البداية فعلا). انجليزي عام و محادثات و كلمات حياتية و استماع و مشاهدة افلام و برامج تلفزيونية و مسلسلات بالانجليزي و بنحطك في بيئة اللغة عشان تعرف تسمع و تتكلم و تقرأ و تكتب");

        return myView;
    }
}
