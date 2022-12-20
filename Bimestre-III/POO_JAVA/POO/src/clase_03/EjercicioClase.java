package clase_03;

import java.util.Scanner;

public class EjercicioClase {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese nombre del perro: ");
        String nombrePerro = scanner.nextLine();

        System.out.println("Ingrese la cantidad de aliemento en Kg que come tu perro diario: ");
        double cantidadAlimento = scanner.nextDouble();

        cantidadPaquetes(nombrePerro, cantidadAlimento, scanner);

      /*  int contadorPaquete = 0;

        double acumulado = 0.0;

        while(acumulado <= cantidadAlimento) {
            System.out.println("Ingrese el kilo del paquete: ");
            acumulado += scanner.nextDouble();
            contadorPaquete++;
        }

        System.out.println("Resultado: " + nombrePerro + " precisa " + contadorPaquete + " paquetes" );*/

    }


    public static void cantidadPaquetes(String nombrePerro, double cantidadAlimento, Scanner scanner) {
        int contadorDePaquete = 0;
        double acumulado = 0.0;
        while(acumulado <= cantidadAlimento) {
            System.out.println("Ingrese el kilo del paquete: ");
            acumulado += scanner.nextDouble();
            contadorDePaquete++;
        }

        System.out.println("Resultado: " + nombrePerro + " precisa " + contadorDePaquete + " paquetes" );
    }

}
