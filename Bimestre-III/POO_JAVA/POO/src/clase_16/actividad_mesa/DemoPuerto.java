package clase_16.actividad_mesa;

import java.util.Collections;

public class DemoPuerto {
    public static void main(String[] args) {

        Puerto puertoBSAS = new Puerto("Buenos Aires");
        puertoBSAS.permitirEntradaContenedor(new Contenedor(3, "Desconocida", true));
        puertoBSAS.permitirEntradaContenedor(new Contenedor(1, "Argentina", false));
        puertoBSAS.permitirEntradaContenedor(new Contenedor(4, "China", true));
        puertoBSAS.permitirEntradaContenedor(new Contenedor(2, "Desconocida", false));
        puertoBSAS.permitirEntradaContenedor(new Contenedor(5, " Desconocida", true));


        System.out.println("\nContenedores");
       puertoBSAS.mostrarContenedores();

        System.out.println("\nCantidad De Contenedores Peligros");
        System.out.println(puertoBSAS.obtenerContenedoresPeligrosos());

        System.out.println("\nContenedores Ordenados");
        Collections.sort(puertoBSAS.getContenedores());
        puertoBSAS.mostrarContenedores();

        // Las collection tienen un método foreach
//        System.out.println("\nCONTENEDORES ORDENADOS (forEach + lambda function)");
//        puertoBSAS.getContenedores().forEach( (contenedor) -> System.out.println(contenedor.toString() ));

    }

}
