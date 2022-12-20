package clase_16.desafio;

import java.util.ArrayList;

public class Persona {

    private String nombre;
    private String apellido;
    private int edad;
//    private Cuenta cuentas[];
    private ArrayList<Cuenta> cuenta = new ArrayList();

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getNombreCompleto(){
        return nombre + " " + apellido;
    }

    public boolean esMayorEdad() {
        if(this.edad >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public ArrayList<Cuenta> getCuenta() {
        return cuenta;
    }

    public void setCuenta(ArrayList<Cuenta> cuenta) {
        this.cuenta = cuenta;
    }
}
