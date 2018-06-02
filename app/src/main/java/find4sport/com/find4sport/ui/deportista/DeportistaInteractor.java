package find4sport.com.find4sport.ui.deportista;

import java.io.IOException;
import java.text.ParseException;

import find4sport.com.find4sport.data.model.Deportista;

public interface DeportistaInteractor {
    void getProfile() throws IOException, ParseException;
    void updateProfile();

    interface onLoadListener{
        void onDatabaseError();
        void onProfileError(String error);
        void onSucess(Deportista deportista);
    }
}
