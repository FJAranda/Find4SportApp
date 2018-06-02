package find4sport.com.find4sport.data.repository;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;

import find4sport.com.find4sport.data.dao.DeportistaDao;
import find4sport.com.find4sport.data.model.Deportista;

public class DeportistaRepository {
    private static DeportistaRepository deportistaRepository;
    private DeportistaDao deportistaDao;

    private DeportistaRepository(){
        this.deportistaDao = new DeportistaDao();
    }

    public static DeportistaRepository getInstance(){
        if (deportistaRepository == null){
            deportistaRepository = new DeportistaRepository();
        }
        return deportistaRepository;
    }

    public Deportista getProfile() throws IOException, ParseException {
        return deportistaDao.getProfile();
    }

    public long addProfile(Deportista deportista){
        return deportistaDao.addProfile(deportista);
    }

    public boolean updateProfile(Deportista deportista){
        return deportistaDao.updateProfile(deportista);
    }
}
