import java.time.LocalDateTime;

public class Perro {

    private String nombre;
    private String raza;
    private double peso;
    private int anioNacimiento;
    private boolean enAdopcion;
    private boolean tieneChip;
    private boolean estaLastimado;

    // Constructor 1

    public Perro(String nombre) {
        this.nombre = nombre;
    }

    // Constructor 2
    public Perro(String nombre, String raza, double peso, int anioNacimiento) {
        this.nombre = nombre;
        this.raza = raza;
        this.peso = peso;
        this.anioNacimiento = anioNacimiento;
        enAdopcion = false;
        tieneChip = false;
        estaLastimado = false;
    }

    // Getters

//    public int getEdad() {
//        int year= cal.get(Calendar.YEAR);
//        return anioNacimiento -= year;
//    }

    public String getNombre() {
        return nombre;
    }

    public String getRaza(){
        return raza;
    }

    public double getPeso() {
        return peso;
    }

    public boolean getEnAdopcion() {
        return enAdopcion;
    }

    public boolean getEstaLastimado() {
        return estaLastimado;
    }

    public boolean getTieneChip() {
        return tieneChip;
    }


    // Setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setRaza(double peso) {
        this.peso = peso;
    }

    public void setAnioDeNacimiento(int anioDeNacimiento) {
        this.anioNacimiento = anioDeNacimiento;
    }

    public void setEnAdopcion(boolean enAdopcion) {
        this.enAdopcion = enAdopcion;
    }

    public void setEstaLastimado(boolean estaLastimado) {
        this.estaLastimado = estaLastimado;
    }

    public void setTieneChip(boolean tieneChip) {
        this.tieneChip = tieneChip;
    }

    // Metodos

    public int obtenerEdad(int anioNacimiento) {
        return LocalDateTime.now().getYear() - anioNacimiento;
    }

    public boolean comprobarSiSePuedePerder() {
        return !this.tieneChip;
    }

    public void enviarAdopcion(){
        if(!this.estaLastimado && this.peso >= 5.0) {
            this.enAdopcion = true;
        }
    }



}
