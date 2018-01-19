package find4sport.com.find4sport.pojo;

import java.util.List;

/**
 * Created by Javi on 18/11/17.
 */

public class Pista {
    private String idPista;
    private String aliasZona;
    private List<String> deportes;
    private String horaApertura;
    private String horaCierre;
    private float precioFraccion;

    public String getIdPista() {
        return idPista;
    }

    public void setIdPista(String idPista) {
        this.idPista = idPista;
    }

    public String getAliasZona() {
        return aliasZona;
    }

    public void setAliasZona(String aliasZona) {
        this.aliasZona = aliasZona;
    }

    public List<String> getDeportes() {
        return deportes;
    }

    public void setDeportes(List<String> deportes) {
        this.deportes = deportes;
    }

    public String getHoraApertura() {
        return horaApertura;
    }

    public void setHoraApertura(String horaApertura) {
        this.horaApertura = horaApertura;
    }

    public String getHoraCierre() {
        return horaCierre;
    }

    public void setHoraCierre(String horaCierre) {
        this.horaCierre = horaCierre;
    }

    public float getPrecioFraccion() {
        return precioFraccion;
    }

    public void setPrecioFraccion(float precioFraccion) {
        this.precioFraccion = precioFraccion;
    }
}
