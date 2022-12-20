package clase_11.Impresora;

import java.util.Date;

public abstract class Impresora {
    
    private String modelo;
    private String tipoConexion;
    private Date fechaFabricacion;
    private int hojasDisponibles;
    private double porcentajeTinta;

    public boolean tienePapel() {
        if(this.hojasDisponibles > 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean necesitaTinta() {
        if(this.porcentajeTinta < 10.0) {
            return true;
        } else {
            return false;
        }
    }

    public abstract String imprimir() ;


    // Getters
    public String getModelo() {
        return modelo;
    }

    public String getTipoConexion() {
        return tipoConexion;
    }

    public Date getFechaFabricacion() {
        return fechaFabricacion;
    }

    public int getHojasDisponibles() {
        return hojasDisponibles;
    }

    public double getPorcentajeTinta() {
        return porcentajeTinta;
    }

    // Setters

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setTipoConexion(String tipoConexion) {
        this.tipoConexion = tipoConexion;
    }

    public void setFechaFabricacion(Date fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }

    public void setHojasDisponibles(int hojasDisponibles) {
        this.hojasDisponibles = hojasDisponibles;
    }

    public void setPorcentajeTinta(double porcentajeTinta) {
        this.porcentajeTinta = porcentajeTinta;
    }
}
