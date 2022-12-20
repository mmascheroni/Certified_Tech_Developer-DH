package clase_25.clase_en_vivo;

import java.util.ArrayList;

public class Publicador implements Subject{

    private String nombre;
    private String apellido;
    private ArrayList<Observer> seguidores = new ArrayList<>();

    // CONSTRUCTOR
    public Publicador(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    // Metodo de la clase
    public void subirFoto(String titulo) {
        System.out.println("Se ha subido una foto (" + titulo + ")");
        this.notificar();
    }

    // Metodos de Interface SUBJECT
    @Override
    public void agregar(Observer observer) {
        this.seguidores.add(observer);
    }

    @Override
    public void quitar(Observer observer) {
        this.seguidores.remove(observer);
    }

    @Override
    public void notificar() {
        for(Observer seguidor : this.seguidores) {
            seguidor.actualizar();
        }
    }

    //Getters
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public ArrayList<Observer> getSeguidores() {
        return seguidores;
    }

    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setSeguidores(ArrayList<Observer> seguidores) {
        this.seguidores = seguidores;
    }
}
