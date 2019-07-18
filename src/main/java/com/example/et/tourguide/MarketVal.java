package com.example.et.tourguide;

import android.content.Context;
import java.util.ArrayList;

/**
 * Created by 500052376 on 11/7/2018.
 */

public class MarketVal {

      public static void initilize(ArrayList<Location> mlist, Context context) {

            mlist.add(new Location(
                    context.getString(R.string.market_crossroad),
                    context.getString(R.string.market_crossroad_des),
                    context.getString(R.string.market_crossroad_addr),
                    context.getString(R.string.market_croosroad_time),
                    R.drawable.crossroad
            ));
            mlist.add(new Location(
                    context.getString(R.string.market_pacific),
                    context.getString(R.string.market_pacific_des),
                    context.getString(R.string.market_pacific_addr),
                    context.getString(R.string.market_pacific_time),
                    R.drawable.pacific
            ));
            mlist.add(new Location(
                    context.getString(R.string.market_paltan),
                    context.getString(R.string.market_paltan_des),
                    context.getString(R.string.market_paltan_addr),
                    context.getString(R.string.market_paltan_time),
                    R.drawable.paltan
            ));




        }

    }


