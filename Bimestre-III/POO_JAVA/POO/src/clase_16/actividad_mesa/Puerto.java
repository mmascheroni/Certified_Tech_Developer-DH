package clase_16.actividad_mesa;

import java.util.ArrayList;

public class Puerto {
    private String nombre;
    private ArrayList<Contenedor> contenedores = new ArrayList<>();

    public Puerto(String nombre) {
        this.nombre = nombre;
    }

    // Metodos
    public void permitirEntradaContenedor(Contenedor contenedor) {
        this.contenedores.add(contenedor);
    }

    public void mostrarContenedores() {
        for (Contenedor contenedor : contenedores) {
            System.out.println(contenedor.toString());
        }
    }

    public int obtenerContenedoresPeligrosos() {
        int cantidadContenedoresPeligrosos = 0;

        for (Contenedor contenedor : contenedores) {
            if(contenedor.getPeligroso() && contenedor.getPais().equals("Desconocida")) {
                cantidadContenedoresPeligrosos += 1;
            }
        }

        return cantidadContenedoresPeligrosos;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public ArrayList<Contenedor> getContenedores() {
        return contenedores;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setContenedores(ArrayList<Contenedor> contenedores) {
        this.contenedores = contenedores;
    }
}
