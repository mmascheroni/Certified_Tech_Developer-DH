package practica_examen_final_viejo.servicios;

public abstract class Servicio {

    private String nombre;
    private String descripcion;

    public abstract double calcularPrecio();

    // Getter and Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
