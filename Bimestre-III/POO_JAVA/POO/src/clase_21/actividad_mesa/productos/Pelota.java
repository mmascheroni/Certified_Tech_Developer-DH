package clase_21.actividad_mesa.productos;

public class Pelota extends Producto{

    private double radio;

    // Constructor
    public Pelota(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularEspacio() {
        return 0;
    }

    // Getter
    public double getRadio() {
        return radio;
    }

    // Setter
    public void setRadio(double radio) {
        this.radio = radio;
    }
}
