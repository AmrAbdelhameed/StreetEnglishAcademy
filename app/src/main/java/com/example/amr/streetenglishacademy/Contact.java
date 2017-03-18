package com.example.amr.streetenglishacademy;

import com.google.firebase.database.IgnoreExtraProperties;

@IgnoreExtraProperties
public class Contact {

    String name;
    String positive;

    public Contact() {
    }

    public String getName() {
        return name;
    }

    public String getPositive() {
        return positive;
    }



    public Contact(String name, String positive) {
        this.name = name;
        this.positive = positive;
    }

}
