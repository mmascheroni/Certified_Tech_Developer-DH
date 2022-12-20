package clase_20.actividad_mesa_22;

import clase_20.actividad_mesa_22.figuras.Circulo;
import clase_20.actividad_mesa_22.figuras.Rectangulo;
import clase_20.actividad_mesa_22.figuras.Triangulo;

public class Demo {
    public static void main(String[] args) {

//        Triangulo triangulo1 = new Triangulo();
//        triangulo1.setBase(7);
//        triangulo1.setAltura(5);
//        System.out.println(triangulo1.calcularArea());

        // Vagon

        Rectangulo rectanguloVagon = new Rectangulo();
        rectanguloVagon.setAlto(5);
        rectanguloVagon.setLargo(4);

        Circulo circuloVagon1 = new Circulo();
        circuloVagon1.setRadio(1);

        Circulo circuloVagon2 = new Circulo();
        circuloVagon2.setRadio(1);

        Circulo circuloVagon3 = new Circulo();
        circuloVagon3.setRadio(1);

        FiguraComplejaComposite vagon = new FiguraComplejaComposite();
        vagon.agregarFigura(rectanguloVagon);
        vagon.agregarFigura(circuloVagon1);
        vagon.agregarFigura(circuloVagon2);
        vagon.agregarFigura(circuloVagon3);
        System.out.println(vagon.calcularArea());
    }
}
