package clase_25.clase_en_vivo;

public class Seguidor implements Observer{

    private String nombre;
    private String apellido;
    private int cantidadDeNotificaciones = 0;

    // Constructor
    public Seguidor(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    // Metodo de la Interface Observer
    @Override
    public void actualizar() {
        System.out.println(this.nombre + ", tenemos el agrado de notificarte que se ha subido una nueva foto");
        this.cantidadDeNotificaciones++;
    }

    //Getters
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getCantidadDeNotificaciones() {
        return cantidadDeNotificaciones;
    }

    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCantidadDeNotificaciones(int cantidadDeNotificaciones) {
        this.cantidadDeNotificaciones = cantidadDeNotificaciones;
    }

}
