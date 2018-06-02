package find4sport.com.find4sport.ui.planing;

import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;

import find4sport.com.find4sport.ui.deportista.DeportistaDetailModifyActivity;
import find4sport.com.find4sport.R;
import find4sport.com.find4sport.adapter.PlaningPagerAdapter;

public class PlaningActivity extends AppCompatActivity implements QuedadasFragment.OnFragmentInteractionListener, TimelineFragment.OnFragmentInteractionListener, ZonasDeportivasFragment.OnFragmentInteractionListener {

    private Toolbar tbPlaning;
    private DrawerLayout drawerLayout;
    private NavigationView navigationView;
    private ViewPager vpPlaning;
    private TabLayout tlPlaning;
    private PlaningPagerAdapter adapter;
    private FloatingActionButton fabCreateQuedada;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planing);

        tbPlaning = (Toolbar)findViewById(R.id.tbPlaning);
        if (tbPlaning != null) {
            setSupportActionBar(tbPlaning);
        }

        getSupportActionBar().setHomeAsUpIndicator(R.drawable.baseline_menu_24);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        drawerLayout = (DrawerLayout)findViewById(R.id.dlPlaningActivity);
        navigationView = (NavigationView)findViewById(R.id.navview);

        navigationView.setNavigationItemSelectedListener(
                new NavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(MenuItem menuItem) {
                        switch (menuItem.getItemId()){
                            case R.id.menu_seccion_perfil:
                                Intent intent = new Intent(PlaningActivity.this, DeportistaDetailModifyActivity.class);
                                startActivity(intent);
                                break;
                        }
                        drawerLayout.closeDrawers();

                        return true;
                    }
                });

        vpPlaning = (ViewPager)findViewById(R.id.vpPlaning);
        setUpViewPager();

        fabCreateQuedada = (FloatingActionButton)findViewById(R.id.fabCreateQuedada);

        tlPlaning = (TabLayout)findViewById(R.id.tlPlaning);
        tlPlaning.setupWithViewPager(vpPlaning);


        vpPlaning.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                if (position != 0){
                    fabCreateQuedada.hide();
                }

                if (position == 0){
                    fabCreateQuedada.show();
                }
                vpPlaning.setCurrentItem(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                drawerLayout.openDrawer(GravityCompat.START);
                break;
        }

        return super.onOptionsItemSelected(item);
    }

    private void setUpViewPager(){
        adapter = new PlaningPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new QuedadasFragment(), "Quedadas");
        adapter.addFragment(new TimelineFragment(), "Entorno");
        adapter.addFragment(new ZonasDeportivasFragment(), "Pistas");

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
