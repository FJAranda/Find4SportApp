package find4sport.com.find4sport.POJO;

import java.util.Date;
import java.util.List;

/**
 * Created by Javi on 18/11/17.
 */

public class Quedada {
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


    public Quedada(String idQuedada, String idPista, Date fecha, String nombre, String horaInicio, String horaFin){
        this.idQuedada = idQuedada;
        this.idPista = idPista;
        this.fecha = fecha;
        this.nombre = nombre;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
    }

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
}
