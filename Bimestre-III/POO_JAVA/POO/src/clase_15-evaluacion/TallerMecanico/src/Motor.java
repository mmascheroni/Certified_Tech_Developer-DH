public abstract class Motor {

    protected int cilindrada;
    protected double potenciaCV;
    protected String marca;
    protected String estado;
    protected Mecanico mecanico;

    //Constructor
    public Motor(int cilindrada, double potenciaCV, String marca, String estado, Mecanico mecanico) {
        this.cilindrada = cilindrada;
        this.potenciaCV = potenciaCV;
        this.marca = marca;
        this.estado = estado;
        this.mecanico = mecanico;
    }

    //Metodo
    public boolean puedeSerReparado() {
        if(!getEstado().equals("GASTADO") && getPotenciaCV() > 200.0)  {
            return true;
        } else {
            return false;
        }
    }

    // Getters
    public int getCilindrada() {
        return cilindrada;
    }

    public double getPotenciaCV() {
        return potenciaCV;
    }

    public String getMarca() {
        return marca;
    }

    public String getEstado() {
        return estado;
    }

    public Mecanico getMecanico() {
        return mecanico;
    }

    // Setters
    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public void setPotenciaCV(double potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
