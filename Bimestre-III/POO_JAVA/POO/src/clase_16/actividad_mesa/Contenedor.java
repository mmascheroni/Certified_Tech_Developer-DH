package clase_16.actividad_mesa;

import java.util.Comparator;

public class Contenedor implements Comparable<Contenedor> {

    private int id;
    private String pais;
    private boolean peligroso;

    public Contenedor(int id, String pais, boolean peligroso) {
        this.id = id;
        this.pais = pais;
        this.peligroso = peligroso;
    }

    // getters
    public int getId() {
        return id;
    }

    public String getPais() {
        return pais;
    }

    public boolean getPeligroso() {
        return peligroso;
    }

    // Setters


    public void setId(int id) {
        this.id = id;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setPeligroso(boolean peligroso) {
        this.peligroso = peligroso;
    }

    // Metodos de comparacion necesarios para ordenar una coleccion
    @Override
    public int compareTo(Contenedor contenedor) {
        if(this.getId() > contenedor.getId()) {
            return 1;
        } else if (this.getId() < contenedor.getId()) {
            return -1;
        }

        return 0;
    }

    @Override
    public String toString() {
        return "Contenedor = id: " + id + ", pais: " + pais + ", es material peligroso: " + peligroso;
    }


}
