package find4sport.com.find4sport.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import find4sport.com.find4sport.R;
import find4sport.com.find4sport.ui.QuedadasFragment;
import find4sport.com.find4sport.ui.TimelineFragment;

/**
 * Created by el_ja on 18/01/2018.
 */

public class PlaningPagerAdapter extends FragmentPagerAdapter {
    private int numero_tabs;

    public PlaningPagerAdapter(FragmentManager fm, int numero_tabs) {
        super(fm);
        this.numero_tabs = numero_tabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                QuedadasFragment quedadasFragment = new QuedadasFragment();
                return quedadasFragment;
            case 1:
                TimelineFragment timelineFragment = new TimelineFragment();
                return timelineFragment;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return numero_tabs;
    }
}
