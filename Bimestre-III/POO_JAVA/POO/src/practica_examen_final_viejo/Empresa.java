package practica_examen_final_viejo;

import practica_examen_final_viejo.servicios.Servicio;

import java.util.ArrayList;

public class Empresa {

    private int razonSocial;
    private ArrayList<Servicio> servicios = new ArrayList<>();

    public void agregarServicio(Servicio servicio) {
        this.servicios.add(servicio);
    }

    public void quitarServicio(Servicio servicio) {
        this.servicios.remove(servicio);
    }

    public void mostrarServicios() {
        for (Servicio servicio : this.servicios) {
            System.out.println("Servicio: " + servicio.getNombre() );
        }
    }

    // Getter and Setter
    public int getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(int razonSocial) {
        this.razonSocial = razonSocial;
    }

    public ArrayList<Servicio> getServicios() {
        return servicios;
    }

    public void setServicios(ArrayList<Servicio> servicios) {
        this.servicios = servicios;
    }
}
