package com.kenjoel.myrestaurante;

import android.content.Context;
import android.widget.ArrayAdapter;

public class MyRestaurantsArrayAdapter extends ArrayAdapter {

    private Context mContext;
    private String[] mrestaurants;
    private String[] mcuisines;

    public MyRestaurantsArrayAdapter(Context mContext, int resource, String[] mrestaurants, String[] mcusines ){
        super(mContext, resource);
        this.mContext = mContext;
        this.mrestaurants = mrestaurants;
        this.mcuisines = mcusines;
    }

    @Override
    public Object getItem(int position){
        String restaurants = mrestaurants[position];
        String cuisines = mcuisines[position];
        return String.format("%s \nServes great: %s", restaurants, cuisines);
    }

    @Override
    public int getCount(){
        return mrestaurants.length;
    }
}
