package com.example.android.tourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by SHANEEB on 17-Mar-17.
 */

public class CategoryAdapter extends FragmentPagerAdapter {
    final int PAGE_COUNT = 4;
    private String tabTitles[] = new String[]{"Introduction", "Attractions", "Restaurants", "Transport"};
    private Context context;

    public CategoryAdapter(FragmentManager i) {
        super(i);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new IntroductionFragment();

        } else if (position == 1) {
            return new AttractionFragment();
        } else if (position == 2) {
            return new RestaurantFragment();
        } else {
            return new TransportationFragment();
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }
}
