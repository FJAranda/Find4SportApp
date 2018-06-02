package find4sport.com.find4sport.ui;

import android.app.Application;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import find4sport.com.find4sport.data.db.DeportistaOpenHelper;

public class FindForSportsApplication extends Application {
    private static FindForSportsApplication application;

    @Override
    public void onCreate() {
        super.onCreate();
        DeportistaOpenHelper.getInstance().openDatabase();
    }

    public FindForSportsApplication() {
        application = this;
    }

    public static Context getContext(){
        return application;
    }
}
