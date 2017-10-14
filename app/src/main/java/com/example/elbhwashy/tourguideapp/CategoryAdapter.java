package com.example.elbhwashy.tourguideapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by elbhwashy on 9/29/2017.
 */

public class CategoryAdapter extends FragmentPagerAdapter {
   private Context mContext;

    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new RestaurantsFragment();
        } else if (position == 1) {
            return new PublicPlacesFragment();
        } else if (position == 2) {
            return new HotelsFragment();
        } else if (position == 3){
            return new MosquesFragment();
        }else {
            return new MuseumsFrgment();
        }
    }

    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.resturants_category);
        } else if (position == 1) {
            return mContext.getString(R.string.mosques);
        } else if (position == 2) {
            return mContext.getString(R.string.events);
        } else if (position == 3) {
            return mContext.getString(R.string.publicplaces_ctegory);
        } else {
            return mContext.getString(R.string.museums);
        }
    }
}
