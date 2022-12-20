
public class UsuarioJuego {

    private String nombre;
    private String clave;
    private Double puntaje;
    private int nivel;


    public UsuarioJuego(String nombre, String clave) {
        this.nombre = nombre;
        this.clave = clave;
        this.puntaje = 0.0;
        this.nivel = 0;
    }

    // Getters

    public String getNombre() {
        return nombre;
    }

    public String getClave() {
        return clave;
    }

    public double getPuntaje() {
        return puntaje;
    }

    public int getNivel() {
        return nivel;
    }

    // Setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    // Metodos

    public void aumentarPuntaje() {
        this.puntaje++;
    }

    public void aumentarNivel() {
        this.nivel++;
    }

    public void recibirBounus(int valor) {
        this.puntaje += valor;
    }


}
