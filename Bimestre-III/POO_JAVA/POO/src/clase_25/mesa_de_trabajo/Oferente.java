package clase_25.mesa_de_trabajo;


public class Oferente implements Observer{

    private String nombre;
    private String apellido;
    private int dni;
    private double montoTopeAPagar;

    public Oferente(String nombre, String apellido, int dni, double montoTopeAPagar) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.montoTopeAPagar = montoTopeAPagar;
    }

    public void accionar(double oferta) {
        if(oferta < this.montoTopeAPagar) {
            System.out.println("Accionar aceptado con un monto de $" + oferta);
        } else {
            System.out.println("No es posible Accionar, ya que el monto es mayor al monto Tope");
        }
    }

    @Override
    public void actualizar() {
        System.out.println(this.nombre + " " + this.apellido + " , la subasta tiene un nuevo monto");

    }

    //Getters
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getDni() {
        return dni;
    }

    public double getMontoTopeAPagar() {
        return montoTopeAPagar;
    }

    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setMontoTopeAPagar(double montoTopeAPagar) {
        this.montoTopeAPagar = montoTopeAPagar;
    }
}
