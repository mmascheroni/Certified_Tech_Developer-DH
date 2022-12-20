package clase_20.actividad_mesa_22;

import clase_20.actividad_mesa_22.figuras.Figura;

import java.util.ArrayList;

public class Tren {

    private ArrayList<Figura> figuras = new ArrayList<>();

    public void agregarFigura(Figura figura) {
        this.figuras.add(figura);
    }

    public void quitarFigura(Figura figura) {
        this.figuras.remove(figura);
    }

    // Getter


    public ArrayList<Figura> getFiguras() {
        return figuras;
    }
}
