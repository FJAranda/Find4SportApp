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
}
