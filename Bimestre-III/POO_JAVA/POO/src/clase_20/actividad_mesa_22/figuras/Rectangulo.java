package clase_20.actividad_mesa_22.figuras;

public class Rectangulo extends Figura{

    private double alto;
    private double largo;

    @Override
    public double calcularArea() {
        return this.getAlto() * this.getLargo();
    }

    //Getters
    public double getAlto() {
        return alto;
    }

    public double getLargo() {
        return largo;
    }

    //Setters
    public void setLargo(double largo) {
        this.largo = largo;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }
}
