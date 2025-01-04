package db_Operaciones;

public class TipoTierra_Get_Set {
    private int id;
    private String nombreTierra;
    private String contenidoDeMinerales;
    private String nivelPh;
    private String humedadSuelo;
    private String salinidad;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreTierra() {
        return nombreTierra;
    }

    public void setNombreTierra(String nombreTierra) {
        this.nombreTierra = nombreTierra;
    }

    public String getContenidoDeMinerales() {
        return contenidoDeMinerales;
    }

    public void setContenidoDeMinerales(String contenidoDeMinerales) {
        this.contenidoDeMinerales = contenidoDeMinerales;
    }

    public String getNivelPh() {
        return nivelPh;
    }

    public void setNivelPh(String nivelPh) {
        this.nivelPh = nivelPh;
    }

    public String getHumedadSuelo() {
        return humedadSuelo;
    }

    public void setHumedadSuelo(String humedadSuelo) {
        this.humedadSuelo = humedadSuelo;
    }

    public String getSalinidad() {
        return salinidad;
    }

    public void setSalinidad(String salinidad) {
        this.salinidad = salinidad;
    }
}
