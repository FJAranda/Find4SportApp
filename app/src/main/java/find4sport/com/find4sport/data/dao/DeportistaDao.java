package find4sport.com.find4sport.data.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.squareup.picasso.Picasso;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;

import find4sport.com.find4sport.data.db.DeportistaContract;
import find4sport.com.find4sport.data.db.DeportistaOpenHelper;
import find4sport.com.find4sport.data.model.Deportista;

public class DeportistaDao {
    public ArrayList<Deportista> getNearDeportistas(){
        return null;
    }

    public ArrayList<Deportista> getDeportistasByAlias(String alias){
        return null;
    }

    public Deportista getProfile() throws ParseException, IOException {
        SQLiteDatabase sqLiteDatabase = DeportistaOpenHelper.getInstance().openDatabase();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Deportista aux = new Deportista();
        Cursor cursor = sqLiteDatabase.query(DeportistaContract.DeportistaEntry.TABLE_NAME, DeportistaContract.DeportistaEntry.ALL_COLUMNS, null, null,
                null, null, null);
        if (cursor.moveToFirst()){
            aux.setAlias(cursor.getString(1));
            aux.setNombre(cursor.getString(2));
            aux.setApellidos(cursor.getString(3));
            aux.setFechaNacimiento(sdf.parse(cursor.getString(4)));
            aux.setImagen(Picasso.get().load(cursor.getString(6)).get());
            aux.setCiudad(cursor.getString(7));
            aux.setMail(cursor.getString(8));
            aux.setTelefono(cursor.getString(9));
            aux.setDeportes(Arrays.asList(cursor.getString(10).split("-")));
        }

        DeportistaOpenHelper.getInstance().closeDatabase();
        return aux;
    }

    public long addProfile(Deportista deportista) {
        return 1;
    }

    public boolean updateProfile(Deportista deportista) {
        return true;
    }
}
