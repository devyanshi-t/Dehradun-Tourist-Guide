package com.example.et.tourguide;

import android.content.Context;

import java.util.ArrayList;

/**
 * Created by 500052376 on 11/6/2018.
 */

    public class PlacesVal {

        public static void initilize(ArrayList<Location> plist, Context context) {

            plist.add(new Location(
                    context.getString(R.string.place_buddha_temple),
                    context.getString(R.string.place_buddha_des),
                    context.getString(R.string.place_buddha_address),
                   context.getString(R.string.place_buddha_time),
                    R.drawable.buddha
            ));
            plist.add(new Location(
                    context.getString(R.string.place_fri),
                    context.getString(R.string.place_fri_des),
                    context.getString(R.string.place_fri_address),
                    context.getString(R.string.place_fri_time),
                    R.drawable.fri
            ));
            plist.add(new Location(
                    context.getString(R.string.place_shastra),
                    context.getString(R.string.place_shastra_des),
                    context.getString(R.string.place_shastra_address),
                    context.getString(R.string.place_shastra_time),
                    R.drawable.shastra
            ));
            plist.add(new Location(
                    context.getString(R.string.place_tapesk),
                    context.getString(R.string.place_tapesk_des),
                    context.getString(R.string.place_tapesk_address),
                    context.getString(R.string.place_tapeshk_time),
                    R.drawable.tapkeshwar
            ));


        }

}