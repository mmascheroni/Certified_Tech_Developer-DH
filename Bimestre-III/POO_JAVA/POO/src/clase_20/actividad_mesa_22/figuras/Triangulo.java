package clase_20.actividad_mesa_22.figuras;

public class Triangulo extends Figura{

    private double base;
    private double altura;

    @Override
    public double calcularArea() {
        return (this.getBase() * this.getAltura()) / 2;
    }

    //Getters
    public double getBase() {
        return base;
    }

    //Setters
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setBase(double base) {
        this.base = base;
    }
}
