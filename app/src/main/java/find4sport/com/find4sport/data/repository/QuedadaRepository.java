package find4sport.com.find4sport.data.repository;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import find4sport.com.find4sport.data.model.Quedada;

/**
 * Created by Javi on 21/3/18.
 */

public class QuedadaRepository {
    private ArrayList<Quedada> mQuedadas;
    private static QuedadaRepository mRepository;

    private QuedadaRepository() {
        this.mQuedadas = new ArrayList<>();
        initialize();
    }


    public static QuedadaRepository getInstance() {
        if (mRepository == null)
            mRepository = new QuedadaRepository();

        return mRepository;
    }

    private void initialize() {
        Calendar calendar = Calendar.getInstance();
        Date fecha =calendar.getTime();
        mQuedadas = new ArrayList<>();
        mQuedadas.add(new Quedada("0", "0", fecha, "Quedada 1", "10:00", "11:00", 5));
        mQuedadas.add(new Quedada("1", "0", fecha, "Quedada 2", "10:00", "11:00", 6));
        mQuedadas.add(new Quedada("2", "0", fecha, "Quedada 3", "10:00", "11:00", 10));
        mQuedadas.add(new Quedada("3", "0", fecha, "Quedada 4", "10:00", "11:00", 15));
        mQuedadas.add(new Quedada("4", "0", fecha, "Quedada 5", "10:00", "11:00", 1));
        mQuedadas.add(new Quedada("5", "0", fecha, "Quedada 6", "10:00", "11:00", 8));
    }

    public void addQuedada(Quedada quedada) {
        mQuedadas.add(quedada);
    }

    public ArrayList<Quedada> getQuedadas() {
        return mQuedadas;
    }

    public ArrayList<Quedada> getQuedadasOrderBy() {
        Collections.sort(mQuedadas, Quedada.COMPARATOR_NAME);
        return mQuedadas;
    }

    public int getLastId() {
        return Integer.parseInt(mQuedadas.get(mQuedadas.size() - 1).getIdQuedada());
    }


    public boolean validateQuedada(String nombre, Date fecha, Date horaInicio, Date horaFin, int numeroParticipantes) {
        boolean result = true;
        int index = 0;

        // TODO: 21/3/18 Pensar limitaciones

        return result;
    }


    public void editQuedada(Quedada quedada) {
        int index = 0;

        while (index < mQuedadas.size()) {
            if (quedada.getIdQuedada() == mQuedadas.get(index).getIdQuedada()) {
                mQuedadas.set(index, quedada);
                index = mQuedadas.size();
            } else
                index++;
        }
    }


    public void deleteQuedada(Quedada quedada) {
        Iterator<Quedada> iterator = mQuedadas.iterator();
        Quedada tmpQuedada;

        while (iterator.hasNext()) {
            tmpQuedada = iterator.next();

            if (quedada.getIdQuedada() == tmpQuedada.getIdQuedada()) {
                iterator.remove();
                break;
            }
        }
    }


    public Quedada getQuedadaAtPosition(int position){
        return mQuedadas.get(position);
    }

    public List<Quedada> getQuedadasOrderByDate() {
        // TODO: 26/3/18 Ordenar por fecha y devolver
        Collections.sort(mQuedadas, Quedada.COMPARATOR_NAME);
        return mQuedadas;
    }
}
