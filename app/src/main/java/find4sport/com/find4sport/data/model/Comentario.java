package find4sport.com.find4sport.data.model;

import java.util.Date;

/**
 * Created by Javi on 18/11/17.
 */

public class Comentario {
    private String aliasObjetivo;
    private String AliasComentador;
    private Date fechaComentario;
    private String titulo;
    private String comentario;

    public String getAliasObjetivo() {
        return aliasObjetivo;
    }

    public void setAliasObjetivo(String aliasObjetivo) {
        this.aliasObjetivo = aliasObjetivo;
    }

    public String getAliasComentador() {
        return AliasComentador;
    }

    public void setAliasComentador(String aliasComentador) {
        AliasComentador = aliasComentador;
    }

    public Date getFechaComentario() {
        return fechaComentario;
    }

    public void setFechaComentario(Date fechaComentario) {
        this.fechaComentario = fechaComentario;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }


}
