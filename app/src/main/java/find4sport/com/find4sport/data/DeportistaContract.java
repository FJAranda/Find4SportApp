package find4sport.com.find4sport.data;

import android.provider.BaseColumns;

public class DeportistaContract {
    private DeportistaContract(){

    }

    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "deportista.db";

    public static class DeportistaEntry implements BaseColumns{
        public static final String TABLE_NAME = "deportista";

        public static final String COLUMN_ALIAS = "alias";
        public static final String COLUMN_NOMBRE = "nombre";
        public static final String COLUMN_FECHANAC = "fechanac";
        public static final String COLUMN_PASS = "pass";
        public static final String COLUMN_IMAGEN = "imagen";
        public static final String COLUMN_CIUDAD = "ciudad";
        public static final String COLUMN_MAIL = "mail";
        public static final String COLUMN_TELEFONO = "telefono";
        public static final String COLUMN_DEPORTES = "deportes";

        public static final String[] ALL_COLUMNS = {BaseColumns._ID, COLUMN_ALIAS, COLUMN_NOMBRE,
                COLUMN_FECHANAC, COLUMN_PASS, COLUMN_IMAGEN, COLUMN_CIUDAD, COLUMN_MAIL,
                COLUMN_TELEFONO, COLUMN_DEPORTES};

        public static final String SQL_CREATE_ENTRIES = String.format("CREATE TABLE %s (%s INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "%s TEXT UNIQUE, %s TEXT, %s TEXT, %s TEXT, %s TEXT, %s TEXT, %s TEXT, %s TEXT, %s TEXT)", TABLE_NAME, BaseColumns._ID,
        COLUMN_ALIAS, COLUMN_NOMBRE, COLUMN_FECHANAC, COLUMN_PASS, COLUMN_IMAGEN, COLUMN_CIUDAD, COLUMN_MAIL, COLUMN_TELEFONO, COLUMN_DEPORTES);

        public static final String SQL_INSERT_ENTRIES = String.format("INSERT INTO %s VALUES(1, 'fjaranda', 'Francisco Javier Aranda Caro','1992-07-10'" +
                ",'123456','https://secure.gravatar.com/avatar/7c2ae675b4a5df7bb395e8bb42936da4','Benalmadena','miemail@gmail.com','123456789'," +
                "'Futbol-Baloncesto-Tenis')",TABLE_NAME);

        public static final String SQL_DELETE_ENTRIES = String.format("DROP TABLE IF EXISTS %s", TABLE_NAME);
    }
}
