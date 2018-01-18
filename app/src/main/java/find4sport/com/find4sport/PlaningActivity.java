package find4sport.com.find4sport;

import android.net.Uri;
import android.support.design.widget.TabLayout;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import find4sport.com.find4sport.adapter.PlaningPagerAdapter;
import find4sport.com.find4sport.ui.QuedadasFragment;
import find4sport.com.find4sport.ui.TimelineFragment;

public class PlaningActivity extends AppCompatActivity implements QuedadasFragment.OnFragmentInteractionListener, TimelineFragment.OnFragmentInteractionListener {

    private Toolbar tbPlaning;
    private TabLayout tlPlaning;
    private ViewPager vpPlaning;
    private PlaningPagerAdapter adapter;
    private final String[] tabsTitulos = {"Quedadas", "Timeline"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planing);

        tbPlaning = (Toolbar)findViewById(R.id.tbPlaning);
        setSupportActionBar(tbPlaning);

        tlPlaning = (TabLayout)findViewById(R.id.tlPlaning);
        tlPlaning.addTab(tlPlaning.newTab().setText(tabsTitulos[0]));
        tlPlaning.addTab(tlPlaning.newTab().setText(tabsTitulos[1]));
        tlPlaning.setTabGravity(TabLayout.GRAVITY_FILL);

        vpPlaning = (ViewPager)findViewById(R.id.vpPlaning);
        adapter = new PlaningPagerAdapter(getSupportFragmentManager(), tlPlaning.getTabCount());
        vpPlaning.setAdapter(adapter);

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

    @Override
    public void onFragmentInteraction(Uri uri) {
        
    }
}
