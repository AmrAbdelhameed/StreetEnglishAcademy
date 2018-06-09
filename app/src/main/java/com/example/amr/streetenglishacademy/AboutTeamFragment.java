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
    AboutTeamAdapter adaper;
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
        userItem.setUserPos("Founder, CEO and English instructor");
        userItem.setUserDescription("Faculty of arts at ain shams university");
        userItem.setUserPicture(R.mipmap.ismail);
        data.add(userItem);

        userItem = new UserItem();
        userItem.setUserName("Shaimaa Youssef");
        userItem.setUserPos("Community Manager");
        userItem.setUserDescription("Education\nBachelor of Education, English major-Ain-Shams University, 2018.\n\nWork Experience\n-English Instructor at Seven Letters\n-English Instructor at 4level1\n-English Instructor at Future Makers Academy\n-Online English Instructor at MYE-Master Your English\n\nVolunteering Experience\n-Facilitator at GEC-Global Entrepreneurship Camp\n-English Instructor at IRCO- International Relations Cooperation Office, ASU\n-AIESEC Exchange Partcipant at AIESEC Trabzon, Turkey\n-English Speaking Club Teacher at Harvard language center, Trabzon, Turkey\n-English Committee Head at ACE-Al-Azhar Club for English\n-Organizer at MYE-Master Your English\n-Instructor at MYE\n-English Instructor at English Gang Team\n\nEvents\n-Event Organizer in Passion for Profession International Conferenec, CDELT- Center of Developing English Language Teaching, ASU\n- Speaker at Leapx\n- Speaker at (tzkaret Safar) event, Faculty of Education, ASU\n\nAwards\n-2nd Place in MA'AN Competition for Civic Engagment in Arab Universities, AUC, IRCO Team");
        userItem.setUserPicture(R.mipmap.shimaa);
        data.add(userItem);

        userItem = new UserItem();
        userItem.setUserName("Ahmed Nabil");
        userItem.setUserPos("Vice-President");
        userItem.setUserDescription("Studied at faculty of education English department\nFormer English instructor at spread your skills\nFormer English instructor at Harvest British college\nFormer English instructor at lingo\nFormer English instructor at e3mar\nFormer online English instructor at lingbe \nFormer English instructor at American Egyptian Academy\nVice president and English instructor at street English academy");
        userItem.setUserPicture(R.mipmap.nabil);
        data.add(userItem);

        userItem = new UserItem();
        userItem.setUserName("Ammar Sharshera");
        userItem.setUserPos("Digital marketer");
        userItem.setUserDescription("");
        userItem.setUserPicture(R.mipmap.ammar);
        data.add(userItem);

        userItem = new UserItem();
        userItem.setUserName("Safa sayed");
        userItem.setUserPos("Co-instructor");
        userItem.setUserDescription("Safa sayed ahmed ismail\n20 years old\nFaculty of language and translation. Turkish department.\nI'm a networker\nTeam leader at plan b combany\nI'm studying human recourse and I have a certification  of make yourself diploma");
        userItem.setUserPicture(R.mipmap.safaa);
        data.add(userItem);

        userItem = new UserItem();
        userItem.setUserName("Alaa Muhammad");
        userItem.setUserPos("Co-instructor");
        userItem.setUserDescription("I am an English instructor aspiring to change the way people learn English,by teaching them the correct pronunciation of words,participating in events, attending our  sessions in Street English Academy also our conversation clubs, and most importantly inspiring them to see how much important to practice the English language and to recognize its significance upon finding and offering better working chances.\n\nEducation\nStudent at faculty of Language and Simultaneous Interpretation, English department. Al_Azhar University.\n\nWork Experience\nEnglish instructor at Street English Academy. \n\nVolunteering Experience\nVolunteer at RTC.");
        userItem.setUserPicture(R.mipmap.alaa);
        data.add(userItem);

        userItem = new UserItem();
        userItem.setUserName("Abdelrahman Adel");
        userItem.setUserPos("Co-instructor");
        userItem.setUserDescription("My name is Abderrahman Adel, I graduated from  Al-azhar University. I took up Education as a career after majoring in English teaching. I completed my bachelor degree. I have been trained at some schools that gave me some experiences about teaching and dealing with students.\nAcademically, I am interested in interpretation, specifically politics and presidential speeches. I’d like my career to revolve around interpretation.\nI dedicate myself in providing help to students who are having difficulties in learning English.\nIt is my vision for students to communicate in English easily, and my mission is to help students speak fluently and truly express what they are trying to say.");
        userItem.setUserPicture(R.mipmap.abdulrhman);
        data.add(userItem);

        userItem = new UserItem();
        userItem.setUserName("Jilan Muhammad ElSisi");
        userItem.setUserPos("Instructor");
        userItem.setUserDescription("Studying at faculty of language and translation_Alazhar University(English Department).\nFormer volunteer Instructor at Spread Your Skills(SYS).\nFormer trainee on journalism translation at Middle East News Agency.");
        userItem.setUserPicture(R.mipmap.jilan);
        data.add(userItem);

        userItem = new UserItem();
        userItem.setUserName("Ahmed mustafa");
        userItem.setUserPos("Instructor");
        userItem.setUserDescription("");
        userItem.setUserPicture(R.mipmap.ahmed);
        data.add(userItem);

        userItem = new UserItem();
        userItem.setUserName("Muhammad Tosha");
        userItem.setUserPos("Coordinator");
        userItem.setUserDescription("Bachelor of arts, philosophy Department, Helwan university.\nTaught children how to live in an English speaking environment from the very first step.\nHas the passion to change the way people think about English.");
        userItem.setUserPicture(R.mipmap.muhammed);
        data.add(userItem);

        userItem = new UserItem();
        userItem.setUserName("Sahar");
        userItem.setUserPos("Kids instructor");
        userItem.setUserDescription("");
        userItem.setUserPicture(R.mipmap.sahar);
        data.add(userItem);

        userItem = new UserItem();
        userItem.setUserName("Ahmed Atef");
        userItem.setUserPos("Instructor");
        userItem.setUserDescription("Faculty of commerce english section at ain shams university");
        userItem.setUserPicture(R.mipmap.i2);
        data.add(userItem);

        userItem = new UserItem();
        userItem.setUserName("Yasmin Abdelrazik");
        userItem.setUserPos("Instructor");
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
        userItem.setUserDescription("I'm a student in faculty of computer and information science at ain shams university who loves learning new and challenging things. I've been interested in Android Development field from a young age. Currently I'm working at YACKEEN Solutions Company as junior android developer.");
        userItem.setUserPicture(R.mipmap.amr);
        data.add(userItem);

        adaper = new AboutTeamAdapter(getActivity(), data);
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