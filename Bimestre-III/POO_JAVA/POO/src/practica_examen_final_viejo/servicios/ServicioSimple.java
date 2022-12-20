package practica_examen_final_viejo.servicios;

public class ServicioSimple extends Servicio{

    private double precioBase;
    private boolean incluyeColocacion;

    @Override
    public double calcularPrecio() {
        if (this.incluyeColocacion) {
            return precioBase * 1.10;
        } else {
            return precioBase;
        }
    }

    // Getters and Setters
    public double getPrecioBase() {
        return precioBase;
    }

    public boolean getIncluyeColocacion() {
        return incluyeColocacion;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public void setIncluyeColocacion(boolean incluyeColocacion) {
        this.incluyeColocacion = incluyeColocacion;
    }
}
