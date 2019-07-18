package com.example.et.tourguide;

import android.content.Context;

import java.util.ArrayList;

/**
 * Created by 500052376 on 11/7/2018.
 */

public class RestaurantVal {

    public static void initilize(ArrayList<Location> rlist, Context context) {

        rlist.add(new Location(
                context.getString(R.string.res_piccolo),
                context.getString(R.string.res_piccolo_des),
                context.getString(R.string.res_piccolo_addr),
                context.getString(R.string.res_piccolo_time),
                R.drawable.picco
        ));
        rlist.add(new Location(
                context.getString(R.string.res_bbqnation),
                context.getString(R.string.res_bbq_des),
                context.getString(R.string.res_bbq_addr),
                context.getString(R.string.res_bbq_time),
                R.drawable.bbq
        ));
        rlist.add(new Location(
                context.getString(R.string.res_mira),
                context.getString(R.string.res_mira_des),
                context.getString(R.string.res_mira_addr),
                context.getString(R.string.res_mira_time),
                R.drawable.mirabilia
        ));
        rlist.add(new Location(
                context.getString(R.string.res_towntable),
                context.getString(R.string.res_towntable_des),
                context.getString(R.string.res_towntable_addr),
                context.getString(R.string.res_towntable_time),
                R.drawable.towntable
        ));


    }
}
