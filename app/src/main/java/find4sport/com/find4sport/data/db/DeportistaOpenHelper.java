package find4sport.com.find4sport.data.db;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;

import find4sport.com.find4sport.ui.FindForSportsApplication;

public class DeportistaOpenHelper extends SQLiteOpenHelper {

    private SQLiteDatabase sqLiteDatabase;
    private static DeportistaOpenHelper singleton;

    private DeportistaOpenHelper(){
        super(FindForSportsApplication.getContext(), DeportistaContract.DATABASE_NAME, null, DeportistaContract.DATABASE_VERSION);
    }

    public static DeportistaOpenHelper getInstance(){
        if (singleton == null){
            singleton = new DeportistaOpenHelper();
        }
        return singleton;
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        try {
            sqLiteDatabase.beginTransaction();
            sqLiteDatabase.execSQL(DeportistaContract.DeportistaEntry.SQL_CREATE_ENTRIES);
            sqLiteDatabase.execSQL(DeportistaContract.DeportistaEntry.SQL_INSERT_ENTRIES);
            sqLiteDatabase.setTransactionSuccessful();
        }catch (SQLiteException e){
            e.printStackTrace();
        }finally {
            sqLiteDatabase.endTransaction();
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL(DeportistaContract.DeportistaEntry.SQL_DELETE_ENTRIES);
        onCreate(sqLiteDatabase);
    }

    public SQLiteDatabase openDatabase(){
        sqLiteDatabase = getWritableDatabase();
        return sqLiteDatabase;
    }

    public void closeDatabase(){
        sqLiteDatabase.close();
    }
}
