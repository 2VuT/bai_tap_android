package com.example.myapplication;

import java.io.Serializable;

public class Location implements Serializable {
    private String name;
    private int image;
    private String desc;

    public Location() {
    }

    public Location(String name, int image, String desc) {
        this.name = name;
        this.image = image;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
