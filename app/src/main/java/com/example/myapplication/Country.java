package com.example.myapplication;

public class Country {
    private String name;
    private String language;
    private int image;

    public Country() {
    }

    public Country(String name, String language, int image) {
        this.name = name;
        this.language = language;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
