package com.kenjoel.myrestaurante.adapters;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.List;


import com.kenjoel.myrestaurante.models.Business;
import com.kenjoel.myrestaurante.ui.RestaurantDetailFragment;


public class RestaurantPagerAdapter extends FragmentPagerAdapter {

        private List<Business> mRestaurants;

        public RestaurantPagerAdapter(FragmentManager fm, int behavior, List<Business> restaurants) {
            super(fm, behavior);
            mRestaurants = restaurants;
        }

        @Override
        public Fragment getItem(int position) {
            return RestaurantDetailFragment.newInstance(mRestaurants.get(position));
        }

        @Override
        public int getCount() {
            return mRestaurants.size();
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mRestaurants.get(position).getName();
        }
    }

