package clase_22_pre_examen.unidades;

import java.util.ArrayList;

public class UnidadDeTrabajoCombinadaComposite extends UnidadDeTrabajo{

    private ArrayList<UnidadDeTrabajo> unidadesDeTrabajo = new ArrayList<>();

    private double coeficienteGlobal;
    private double montoMaterial;

    @Override
    public double calcularMonto() {
        double monto = 0.0;

        for(UnidadDeTrabajo unidad : this.unidadesDeTrabajo) {
            monto += unidad.calcularMonto();
        }

        return monto * this.coeficienteGlobal;
    }

    @Override
    public String mostrarComponentes() {
        String componente = "";

        for (UnidadDeTrabajo unidad : this.unidadesDeTrabajo) {
            componente += "\nNombre: " + unidad.getNombre() + " Monto: $" + unidad.calcularMonto();
        }

        return componente;
    }

    public void agregarUnidadDeTrabajo(UnidadDeTrabajo unidad) {
        this.unidadesDeTrabajo.add(unidad);
    }

    public void quitarUnidadDeTrabajo(UnidadDeTrabajo unidad) {
        this.unidadesDeTrabajo.remove(unidad);
    }

    //Getters
    public ArrayList<UnidadDeTrabajo> getUnidadesDeTrabajo() {
        return unidadesDeTrabajo;
    }

    public double getCoeficienteGlobal() {
        return coeficienteGlobal;
    }

    public double getMontoMaterial() {
        return montoMaterial;
    }

    //Setters
    public void setUnidadesDeTrabajo(ArrayList<UnidadDeTrabajo> unidadesDeTrabajo) {
        this.unidadesDeTrabajo = unidadesDeTrabajo;
    }

    public void setCoeficienteGlobal(double coeficienteGlobal) {
        this.coeficienteGlobal = coeficienteGlobal;
    }

    public void setMontoMaterial(double montoMaterial) {
        this.montoMaterial = montoMaterial;
    }
}
