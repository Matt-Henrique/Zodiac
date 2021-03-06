package com.mateus.zodiac;

import java.io.Serializable;

public class Sign implements Serializable {

    private int FirstDay;
    private int LastDay;
    private int FirstMonth;
    private int LastMonth;
    private String Name;
    private String Description;
    private String Image;

    public Sign(int firstDay, int lastDay, int firstMonth, int lastMonth, String name, String description, String image) {
        FirstDay = firstDay;
        LastDay = lastDay;
        FirstMonth = firstMonth;
        LastMonth = lastMonth;
        Name = name;
        Description = description;
        Image = image;
    }

    public int getFirstDay() {
        return FirstDay;
    }

    public int getLastDay() {
        return LastDay;
    }

    public int getFirstMonth() {
        return FirstMonth;
    }

    public int getLastMonth() {
        return LastMonth;
    }

    public String getName() {
        return Name;
    }

    public String getDescription() {
        return Description;
    }

    public String getImage() {
        return Image;
    }
}
