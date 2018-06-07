package com.example.amr.streetenglishacademy;

public class ContentItem {
    private int id;
    private String nameContent, openDriveMsg;

    public ContentItem(int id, String nameContent, String openDriveMsg) {
        this.id = id;
        this.nameContent = nameContent;
        this.openDriveMsg = openDriveMsg;
    }

    public int getId() {
        return id;
    }

    public String getNameContent() {
        return nameContent;
    }

    public String getOpenDriveMsg() {
        return openDriveMsg;
    }
}
