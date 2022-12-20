package clase_03;

import java.util.Scanner;

public class CalculoHsExtra {

    public static void main(String[] args) {
//        Desafío 4
//        Por cuestiones laborales, se pueden trabajar hasta 40 horas semanales, si se trabajan más
//        horas las mismas se consideran horas extras cuyo valor es un 50% más que las horas de
//        trabajo normales. Crear un programa que pueda informar si el sueldo semanal de la
//        programadora Julieta. Ella trabajó en la última semana “x” cantidad de horas y el valor de la
//        hora semanal es de 875.

        double sueldoHora = 875.0;
        double sueldoSemanal = 0.0;
        int cantidadHoras = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese cantidad de Horas trabajas durante la semana: ");
        cantidadHoras = scanner.nextInt();

        if(cantidadHoras > 40) {
            sueldoSemanal = sueldoHora * 40;
            sueldoSemanal += (sueldoHora * 1.5) * (cantidadHoras - 40);
        } else {
            sueldoSemanal = sueldoHora * 40;
        }

        System.out.println("El sueldo semanal total es de: " + sueldoSemanal + " con un total de hs: " + cantidadHoras);

    }

}
