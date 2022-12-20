package clase_21.actividad_mesa.productos;

public class Caja extends Producto{

    private double longitud;
    private double ancho;
    private double altura;

    // Constructor
    public Caja(double longitud, double ancho, double altura) {
        this.longitud = longitud;
        this.ancho = ancho;
        this.altura = altura;
    }

    @Override
    public double calcularEspacio() {
        return 0;
    }

    // Getters
    public double getLongitud() {
        return longitud;
    }

    public double getAncho() {
        return ancho;
    }

    public double getAltura() {
        return altura;
    }

    // Setters
    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
