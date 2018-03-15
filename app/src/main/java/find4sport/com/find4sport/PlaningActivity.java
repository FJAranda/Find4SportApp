package find4sport.com.find4sport;

import android.net.Uri;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.widget.Toast;

import java.util.ArrayList;

import find4sport.com.find4sport.adapter.PlaningPagerAdapter;
import find4sport.com.find4sport.ui.QuedadasFragment;
import find4sport.com.find4sport.ui.TimelineFragment;

public class PlaningActivity extends AppCompatActivity implements QuedadasFragment.OnFragmentInteractionListener, TimelineFragment.OnFragmentInteractionListener {

    private Toolbar tbPlaning;
    private ViewPager vpPlaning;
    private TabLayout tlPlaning;
    private PlaningPagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planing);

        tbPlaning = (Toolbar)findViewById(R.id.tbPlaning);
        if (tbPlaning != null) {
            setSupportActionBar(tbPlaning);
        }

        vpPlaning = (ViewPager)findViewById(R.id.vpPlaning);
        setUpViewPager();

        tlPlaning = (TabLayout)findViewById(R.id.tlPlaning);
        tlPlaning.setupWithViewPager(vpPlaning);


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

    private void setUpViewPager(){
        adapter = new PlaningPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new QuedadasFragment(), "Quedadas");
        adapter.addFragment(new TimelineFragment(), "Entorno");
        vpPlaning.setAdapter(adapter);
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d("Current Item", String.valueOf(vpPlaning.getCurrentItem()));
        outState.putInt("SelectedTab", vpPlaning.getCurrentItem());
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        vpPlaning.setCurrentItem(savedInstanceState.getInt("SelectedTab"));
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }


}
