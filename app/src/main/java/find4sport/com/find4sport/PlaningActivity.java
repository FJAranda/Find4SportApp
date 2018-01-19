package find4sport.com.find4sport;

import android.net.Uri;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;

import java.util.ArrayList;

import find4sport.com.find4sport.adapter.PlaningPagerAdapter;
import find4sport.com.find4sport.ui.QuedadasFragment;
import find4sport.com.find4sport.ui.TimelineFragment;

public class PlaningActivity extends AppCompatActivity implements QuedadasFragment.OnFragmentInteractionListener, TimelineFragment.OnFragmentInteractionListener {

    private Toolbar tbPlaning;
    private TabLayout tlPlaning;
    private ViewPager vpPlaning;
    private PlaningPagerAdapter adapter;
    private int selectedTab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planing);

        tbPlaning = (Toolbar)findViewById(R.id.tbPlaning);
        if (tbPlaning != null) {
            setSupportActionBar(tbPlaning);
        }

        tlPlaning = (TabLayout)findViewById(R.id.tlPlaning);
        tlPlaning.setTabGravity(TabLayout.GRAVITY_FILL);

        vpPlaning = (ViewPager)findViewById(R.id.vpPlaning);
        setUpViewPager();

        vpPlaning.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                vpPlaning.setCurrentItem(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    private ArrayList<Fragment> agregarFragments(){
        ArrayList<Fragment> fragments = new ArrayList<>();
        fragments.add(new QuedadasFragment());
        fragments.add(new TimelineFragment());

        return fragments;
    }

    private void setUpViewPager(){
        vpPlaning.setAdapter(new PlaningPagerAdapter(getSupportFragmentManager(), agregarFragments()));
        tlPlaning.setupWithViewPager(vpPlaning);
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d("Current Item", String.valueOf(vpPlaning.getCurrentItem()));
        outState.putInt("SelectedTab", tlPlaning.getSelectedTabPosition());
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        tlPlaning.getTabAt(savedInstanceState.getInt("SelectedTab")).select();
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }


}
