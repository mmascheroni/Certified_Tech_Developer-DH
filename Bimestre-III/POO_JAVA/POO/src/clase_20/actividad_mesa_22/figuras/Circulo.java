package clase_20.actividad_mesa_22.figuras;

public class Circulo extends Figura{

    private double radio;
    private final double PI = 3.14;

    @Override
    public double calcularArea() {
        return this.getRadio() * this.getRadio() * this.getPI();
    }

    //Getters
    public double getRadio() {
        return radio;
    }

    public double getPI() {
        return PI;
    }

    // Setters
    public void setRadio(double radio) {
        this.radio = radio;
    }
}
