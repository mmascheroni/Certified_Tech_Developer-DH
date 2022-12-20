package clase_22_pre_examen;

import clase_22_pre_examen.unidades.UnidadDeTrabajo;


import java.util.ArrayList;

public class Empresa {

    private String nombre;
    private ArrayList<UnidadDeTrabajo> unidadDeTrabajos = new ArrayList<>();

    public void agregarUnidadDeTrabajo(UnidadDeTrabajo unidad) {
        this.unidadDeTrabajos.add(unidad);
    }

    public void quitarUnidadDeTrabajo(UnidadDeTrabajo unidad) {
        this.unidadDeTrabajos.remove(unidad);
    }

    //Getters
    public String getNombre() {
        return nombre;
    }

    public ArrayList<UnidadDeTrabajo> getUnidadDeTrabajos() {
        return unidadDeTrabajos;
    }


    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public void setUnidadDeTrabajos(ArrayList<UnidadDeTrabajo> unidadDeTrabajos) {
        this.unidadDeTrabajos = unidadDeTrabajos;
    }
}
