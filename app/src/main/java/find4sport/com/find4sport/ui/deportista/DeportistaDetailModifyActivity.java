package find4sport.com.find4sport.ui.deportista;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.io.IOException;
import java.text.ParseException;

import find4sport.com.find4sport.R;
import find4sport.com.find4sport.data.model.Deportista;
import find4sport.com.find4sport.data.repository.DeportistaRepository;

public class DeportistaDetailModifyActivity extends AppCompatActivity {

    private EditText etAlias;
    private EditText etNombre;
    private EditText etApellidos;
    private EditText etFechaNacimiento;
    private Button btnCambiarPass;
    private ImageView ivImagenPerfil;
    private EditText etCiudad;
    private EditText etMail;
    private EditText etTelefono;
    private CheckBox cbFutbol7;
    private CheckBox cbFutbolSala;
    private CheckBox cbBaloncesto;
    private CheckBox cbTenis;
    private Toolbar toolbar;


    private Deportista deportista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deportista_detail_modify);

        toolbar = findViewById(R.id.tbModifyDeportista);
        setSupportActionBar(toolbar);

        etAlias = findViewById(R.id.etAlias);
        etNombre = findViewById(R.id.etNombre);
        etApellidos = findViewById(R.id.etApellidos);
        etFechaNacimiento = findViewById(R.id.etFNac);
        // TODO: 6/6/18 BOTON CAMBIAR CONTRASENA
        ivImagenPerfil = findViewById(R.id.ivPerfilImage);
        etCiudad = findViewById(R.id.etCiudad);
        etMail = findViewById(R.id.etMail);
        etTelefono = findViewById(R.id.etTelefono);
        cbFutbol7 = findViewById(R.id.cbFSiete);
        cbFutbolSala = findViewById(R.id.cbFSala);
        cbBaloncesto = findViewById(R.id.cbBaloncesto);
        cbTenis = findViewById(R.id.cbTenis);

        /*
        try {
            deportista = DeportistaRepository.getInstance().getProfile();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }

        if (deportista != null){
            etAlias.setText(deportista.getAlias());
            etNombre.setText(deportista.getNombre());
            etApellidos.setText(deportista.getApellidos());
            // TODO: 6/6/18 Dar formato a la fecha
            etFechaNacimiento.setText(deportista.getFechaNacimiento().toString());
            ivImagenPerfil.setImageBitmap(deportista.getImagen());
            etCiudad.setText(deportista.getCiudad());
            etMail.setText(deportista.getMail());
            etTelefono.setText(deportista.getTelefono());
            for (String deporte:deportista.getDeportes()) {
                switch (deporte){
                    case "futbol7":
                        cbFutbol7.setChecked(true);
                        break;
                    case "futbolsala":
                        cbFutbolSala.setChecked(true);
                        break;
                    case "tenis":
                        cbTenis.setChecked(true);
                        break;
                    case "baloncesto":
                        cbBaloncesto.setChecked(true);
                        break;
                }
            }
        }*/
    }
}
