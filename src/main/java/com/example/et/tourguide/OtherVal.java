package com.example.et.tourguide;

import android.content.Context;

import java.util.ArrayList;

/**
 * Created by 500052376 on 11/7/2018.
 */

public class OtherVal {
    public static void initilize(ArrayList<Location> olist, Context context) {

        olist.add(new Location(
                context.getString(R.string.other_bookstore),
                context.getString(R.string.other_bookstore_des),
                context.getString(R.string.other_bookstore_addr),
                context.getString(R.string.other_bookstore_time),
                R.drawable.natraj
        ));
        olist.add(new Location(
                context.getString(R.string.other_Laser),
                context.getString(R.string.other_laser_des),
                context.getString(R.string.other_laser_addr),
                context.getString(R.string.other_laser_time),
                R.drawable.laser
        ));
        olist.add(new Location(
                context.getString(R.string.other_petal),
                context.getString(R.string.other_petal_des),
                context.getString(R.string.other_petal_addr),
                context.getString(R.string.other_petal_time),
                R.drawable.petal
        ));


    }
}
