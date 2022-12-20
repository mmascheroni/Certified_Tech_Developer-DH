package clase_22_pre_examen.unidades;

public abstract class UnidadDeTrabajo {

    private String nombre;
    private String descripcion;

    public abstract double calcularMonto();

    public abstract String mostrarComponentes();

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

