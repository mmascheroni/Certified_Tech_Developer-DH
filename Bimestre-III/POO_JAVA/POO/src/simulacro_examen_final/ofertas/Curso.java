package simulacro_examen_final.ofertas;

import simulacro_examen_final.ofertas.OfertaAcademica;

public class Curso extends OfertaAcademica {

    private double cargaHorariaMensual;
    private double duracionMensual;
    private double valorHora;

    @Override
    public double calcularPrecio() {
        return this.cargaHorariaMensual * this.duracionMensual * this.valorHora;
    }

    // Getters
    public double getCargaHorariaMensual() {
        return cargaHorariaMensual;
    }

    public double getDuracionMensual() {
        return duracionMensual;
    }

    public double getValorHora() {
        return valorHora;
    }

    // Setters
    public void setCargaHorariaMensual(double cargaHorariaMensual) {
        this.cargaHorariaMensual = cargaHorariaMensual;
    }

    public void setDuracionMensual(double duracionMensual) {
        this.duracionMensual = duracionMensual;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
}
