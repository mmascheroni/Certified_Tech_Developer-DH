package clase_10;

public class Nave extends ObjetoEspacial{

    private double velocidad;
    private int vida;

    public Nave(int posx, int posy, char direccion, double velocidad) {
        super(posx, posy, direccion);
        this.velocidad = velocidad;
    }

    // Método sobrescrito (está en la superclase)
    @Override
    public void irA(int posicionX, int posicionY, char direccion) {
        // Redefine la lógica
    }

    public void girar(char direccion) {
        System.out.println("Giro en direccion al " + direccion);
    }

    public void restarVida() {
        this.vida -= 1;
        System.out.println("Resto una vida");
    }


    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
}
