package com.example.et.tourguide;

import android.util.Log;

/**
 * Created by 500052376 on 11/6/2018.
 */

public class Location {
    private String name;
    private String description;
    private String address;
    private String timings;

    public Location(String name, String description, String address, String timings,
                   int imageResourceId) {
        this.name = name;
        this.description = description;
        this.address = address;
        this.timings = timings;
        //this.imageResourceId = imageResourceId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public String getAddress() {
        return address;
    }


    public String getSchedule() {
        return timings;
    }


  // public int getImageResourceId() {
       //return imageResourceId;
   // }



}
