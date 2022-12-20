import java.util.Scanner;

public class Jugando {

    public static void main(String[] args) {

        /* Ejercicio: Usuario de juego
        Para desarrollar un juego necesitamos implementar la clase UsuarioJuego. Los usuarios
        tienen nombre y clave, estos datos se deben suministrar cuando se crea un nuevo usuario.
        Inicialmente, tienen puntaje y nivel en cero. Sin embargo, pueden aumentar tanto el puntaje
        como el nivel en 1, debemos suministrar un método para poder hacerlo. El usuario también
        puede recibir un bonus, esto quiere decir que recibe un valor extra que se suma a su puntaje.
        Crear la clase del diagrama en Java. Al finalizar, crear un objeto y probar el
        funcionamiento de los métodos.
        */


        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del jugador: ");
        String nombre = scanner.nextLine();

        System.out.println("Ingresa la clave: ");
        String clave = scanner.nextLine();

        UsuarioJuego usuario = new UsuarioJuego(nombre, clave);

        System.out.println("\n Puntaje inicial: " + usuario.getPuntaje());
        System.out.println("Nivel inicial: " + usuario.getNivel());


        usuario.aumentarNivel();
        usuario.aumentarPuntaje();
        usuario.recibirBounus(5);

        System.out.println("\n Puntaje final: " + usuario.getPuntaje());
        System.out.println("nivel final: " + usuario.getNivel());

    }

}
