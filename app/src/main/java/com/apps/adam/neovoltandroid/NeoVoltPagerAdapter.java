package com.apps.adam.neovoltandroid;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class NeoVoltPagerAdapter extends FragmentPagerAdapter {
    private Context mContext;

    //Class constructor
    public NeoVoltPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new VoltFragment();
            case 1:
                return new OhmFragment();
            case 2:
                return new AmpFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }


    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return mContext.getString(R.string.volt_title);
            case 1:
                return mContext.getString(R.string.ohm_title);
            case 2:
                return mContext.getString(R.string.amp_title);
            default:
                return null;
        }

    }
}
