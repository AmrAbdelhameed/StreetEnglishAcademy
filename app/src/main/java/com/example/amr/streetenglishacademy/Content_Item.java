package com.example.amr.streetenglishacademy;

/**
 * Created by NgocTri on 11/15/2015.
 */
public class Content_Item {
    private int id;
    private String namecontent;
    private String n_of_items;

    //Constructor

    public Content_Item(int id, String namecontent, String n_of_items) {
        this.id = id;
        this.namecontent = namecontent;
        this.n_of_items = n_of_items;
    }

    //Setter, getter

    public int get_Id() {
        return id;
    }

    public void set_Id(int id) {
        this.id = id;
    }

    public String getNamecontent() {
        return namecontent;
    }

    public void setNamecontent(String namecontent) {
        this.namecontent = namecontent;
    }

    public String getN_of_items() {
        return n_of_items;
    }

    public void setN_of_items(String n_of_items) {
        this.n_of_items = n_of_items;
    }

}
