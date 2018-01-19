package find4sport.com.find4sport.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

import find4sport.com.find4sport.R;
import find4sport.com.find4sport.ui.QuedadasFragment;
import find4sport.com.find4sport.ui.TimelineFragment;

/**
 * Created by el_ja on 18/01/2018.
 */

public class PlaningPagerAdapter extends FragmentPagerAdapter {
    private ArrayList<Fragment> fragments;

    public PlaningPagerAdapter(FragmentManager fm, ArrayList<Fragment> fragments) {
        super(fm);
        this.fragments = fragments;
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }
}
