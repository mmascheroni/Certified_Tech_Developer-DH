package practica_examen_final_viejo.servicios;

import java.util.ArrayList;

public class ServicioComboComposite extends Servicio{

    private ArrayList<Servicio> servicios = new ArrayList<>();
    private double porcentajeDeDescuento;

    public void agregarServicio(Servicio servicio) {
        this.servicios.add(servicio);
    }

    public void quitarServicio(Servicio servicio) {
        this.servicios.remove(servicio);
    }

    @Override
    public double calcularPrecio() {
        double precioTotal = 0.0;

        for (Servicio servicio : this.servicios) {
            precioTotal += servicio.calcularPrecio();
        }

        return precioTotal - (precioTotal / 100 * this.porcentajeDeDescuento);
    }

    // Getters and Setters
    public ArrayList<Servicio> getServicios() {
        return servicios;
    }

    public void setServicios(ArrayList<Servicio> servicios) {
        this.servicios = servicios;
    }

    public double getPorcentajeDeDescuento() {
        return porcentajeDeDescuento;
    }

    public void setPorcentajeDeDescuento(double porcentajeDeDescuento) {
        this.porcentajeDeDescuento = porcentajeDeDescuento;
    }
}
