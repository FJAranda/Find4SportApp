package find4sport.com.find4sport;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ScrollView;
import android.widget.Switch;

public class SignUpActivity extends AppCompatActivity {

    private Switch swUserType;
    private ScrollView svPerson;
    private ScrollView svSportCentre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        swUserType = (Switch)findViewById(R.id.swUserTypeSignUp);
        svPerson = (ScrollView)findViewById(R.id.svPersonSignUp);
        svSportCentre = (ScrollView)findViewById(R.id.svSportcentreSignUp);

        swUserType.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    svSportCentre.setVisibility(View.VISIBLE);
                    svPerson.setVisibility(View.GONE);
                }else{
                    svSportCentre.setVisibility(View.GONE);
                    svPerson.setVisibility(View.VISIBLE);
                }
            }
        });

    }
}
