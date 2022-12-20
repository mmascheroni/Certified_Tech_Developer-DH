package clase_20.actividad_mesa_22;

import clase_20.actividad_mesa_22.figuras.Figura;

import java.util.ArrayList;

public class FiguraComplejaComposite extends Figura {

    private ArrayList<Figura> figuras = new ArrayList<>();

    public void agregarFigura(Figura figura) {
        this.figuras.add(figura);
    }

    @Override
    public double calcularArea() {
        double areaTotal = 0;

        for (Figura figura : figuras) {
            areaTotal += figura.calcularArea();
        }

        return areaTotal;
    }

    // Getter
    public ArrayList<Figura> getFiguras() {
        return figuras;
    }
}
