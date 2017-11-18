package find4sport.com.find4sport;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class PlaningActivity extends AppCompatActivity {

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planing);

        toolbar = (Toolbar)findViewById(R.id.tbPlaning);
        setSupportActionBar(toolbar);
    }
}
