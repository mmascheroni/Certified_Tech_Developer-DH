package simulacro_examen_final.ofertas;

public abstract class OfertaAcademica {

    private String nombre;
    private String descripcion;

    public abstract double calcularPrecio();

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
