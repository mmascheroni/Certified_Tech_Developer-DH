package clase_20.actividad_en_vivo.productos;

public abstract class Producto {

    private String nombre;
    private double costo;
    private final double PORCENTAJE_DE_GANANCIA = 30.0;

    public Producto(String nombre, double costo) {
        this.nombre = nombre;
        this.costo = costo;
    }

    // Metodo Abstracto
    public abstract double calcularPrecio();


    // Getters
    public String getNombre() {
        return nombre;
    }

    public double getCosto() {
        return costo;
    }

    public double getPORCENTAJE_DE_GANANCIA() {
        return PORCENTAJE_DE_GANANCIA;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
}
