package find4sport.com.find4sport.ui.deportista;

import java.io.IOException;
import java.text.ParseException;

import find4sport.com.find4sport.data.model.Deportista;
import find4sport.com.find4sport.data.repository.DeportistaRepository;

public class DeportistaInteractorImpl implements DeportistaInteractor {
    private DeportistaInteractor.onLoadListener listener;

    public DeportistaInteractorImpl(DeportistaInteractor.onLoadListener loadListener){
        this.listener = loadListener;
    }

    @Override
    public void getProfile(){
        try {
            Deportista deportista = DeportistaRepository.getInstance().getProfile();
            listener.onSucess(deportista);
        } catch (Exception e) {
            listener.onProfileError(e.getMessage());
        }
    }

    @Override
    public void updateProfile() {

    }
}
