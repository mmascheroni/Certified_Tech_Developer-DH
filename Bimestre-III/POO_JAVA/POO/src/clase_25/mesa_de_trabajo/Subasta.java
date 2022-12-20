package clase_25.mesa_de_trabajo;

import java.util.ArrayList;

public class Subasta implements Observable{

    private double monto;
    private String descripcion;
    private ArrayList<Observer> oferentes = new ArrayList<>();

    public Subasta(double monto) {
        this.monto = monto;
    }

    @Override
    public void agregar(Observer observer) {
        this.oferentes.add(observer);
    }

    @Override
    public void quitar(Observer observer) {
        this.oferentes.remove(observer);
    }

    @Override
    public void notificar() {
        for (Observer ofertente : oferentes) {
            ofertente.actualizar();
        }
    }

    // Getters
    public double getMonto() {
        return monto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public ArrayList<Observer> getOferentes() {
        return oferentes;
    }

    // Setters
    public void setMonto(double monto) {
        this.monto = monto;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setOferentes(ArrayList<Observer> oferentes) {
        this.oferentes = oferentes;
    }
}
