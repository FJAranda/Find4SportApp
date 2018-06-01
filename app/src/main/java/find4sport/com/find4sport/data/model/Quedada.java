package find4sport.com.find4sport.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.NonNull;

import java.util.Comparator;
import java.util.Date;
import java.util.List;

/**
 * Created by Javi on 18/11/17.
 */

public class Quedada implements Comparable, Parcelable{
    private String idQuedada;
    private String idPista;
    private Date fecha;
    private String nombre;
    private String horaInicio;
    private String horaFin;
    private String deporte;
    private int numeroParticipantes;
    private int numeroEquipos;
    private List<Deportista> participantes;
    private List<Comentario> comentarios;

    public Quedada(String idQuedada, String idPista, Date fecha, String nombre, String horaInicio, String horaFin, String deporte, int numeroParticipantes, int numeroEquipos, List<Deportista> participantes, List<Comentario> comentarios) {
        this.idQuedada = idQuedada;
        this.idPista = idPista;
        this.fecha = fecha;
        this.nombre = nombre;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.deporte = deporte;
        this.numeroParticipantes = numeroParticipantes;
        this.numeroEquipos = numeroEquipos;
        this.participantes = participantes;
        this.comentarios = comentarios;
    }


    public Quedada(String idQuedada, String idPista, Date fecha, String nombre, String horaInicio, String horaFin, int numeroParticipantes){
        this.idQuedada = idQuedada;
        this.idPista = idPista;
        this.fecha = fecha;
        this.nombre = nombre;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.numeroParticipantes = numeroParticipantes;
    }

    protected Quedada(Parcel in) {
        idQuedada = in.readString();
        idPista = in.readString();
        nombre = in.readString();
        horaInicio = in.readString();
        horaFin = in.readString();
        deporte = in.readString();
        numeroParticipantes = in.readInt();
        numeroEquipos = in.readInt();
    }

    public static final Creator<Quedada> CREATOR = new Creator<Quedada>() {
        @Override
        public Quedada createFromParcel(Parcel in) {
            return new Quedada(in);
        }

        @Override
        public Quedada[] newArray(int size) {
            return new Quedada[size];
        }
    };

    public String getIdQuedada() {
        return idQuedada;
    }

    public void setIdQuedada(String idQuedada) {
        this.idQuedada = idQuedada;
    }

    public String getIdPista() {
        return idPista;
    }

    public void setIdPista(String idPista) {
        this.idPista = idPista;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(String horaFin) {
        this.horaFin = horaFin;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public int getNumeroParticipantes() {
        return numeroParticipantes;
    }

    public void setNumeroParticipantes(int numeroParticipantes) {
        this.numeroParticipantes = numeroParticipantes;
    }

    public int getNumeroEquipos() {
        return numeroEquipos;
    }

    public void setNumeroEquipos(int numeroEquipos) {
        this.numeroEquipos = numeroEquipos;
    }

    public List<Deportista> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(List<Deportista> participantes) {
        this.participantes = participantes;
    }

    public List<Comentario> getComentarios() {
        return comentarios;
    }

    public void setComentarios(List<Comentario> comentarios) {
        this.comentarios = comentarios;
    }



    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(idQuedada);
        parcel.writeString(idPista);
        parcel.writeString(nombre);
        parcel.writeString(horaInicio);
        parcel.writeString(horaFin);
        parcel.writeString(deporte);
        parcel.writeInt(numeroParticipantes);
        parcel.writeInt(numeroEquipos);
    }

    //Comparable

    public static final Comparator<Quedada> COMPARATOR_NAME = new Comparator<Quedada>() {
        @Override
        public int compare(Quedada o1, Quedada o2) {
            return o1.getNombre().compareToIgnoreCase(o2.getNombre());
        }
    };

    @Override
    public int compareTo(@NonNull Object o) {
        return 0;
    }
}
