package clase_03;

import java.util.Scanner;

public class PiedraPapelTijera {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del primer jugador");
        String jugador1 = scanner.nextLine();

        System.out.println("Ingrese el nombre del segundo jugador");
        String jugador2 = scanner.nextLine();



        while (true) {

            System.out.println("Ingrese la jugada del primer jugador");
            String jugada1 = scanner.nextLine();

            System.out.println("Ingrese la jugada del primer jugador");
            String jugada2 = scanner.nextLine();



            if (jugada1.equals("*") || jugada2.equals("*")) {
                if(jugada1.equals("*")) {
                    System.out.println("Jugador 1 se ha retirado");
                } else if (jugada2.equals("*")) {
                    System.out.println("Jugador 2 se han reitrado");
                } else {
                    System.out.println("Los dos jugadores han decidido retirarse");
                }
                break;
            }

            comparacion(jugada1, jugada2);


        }


    }

    private static void comparacion(String jugada1, String jugada2) {
        if ( (jugada1.equals(jugada2) ) ) {
            System.out.println("Empate los dos han hecho la misma jugada");
        }
        else if ((jugada1.equals("Piedra") && jugada2.equals("Tijera"))) {
            System.out.println("Ha ganado jugador uno piedra le gana a tijera");
        }
        else if ((jugada1.equals("Papel") && jugada2.equals("Piedra"))) {
            System.out.println("Ha ganado jugador uno papel le gana a piedra");
        }
        else if ((jugada1.equals("Tijera") && jugada2.equals("Papel"))) {
            System.out.println("Ha ganado jugador uno tijera le gana a papel");
        }

        else if ((jugada2.equals("Piedra") && jugada1.equals("Tijera"))) {
            System.out.println("Ha ganado jugador dos piedra le gana a tijera");
        }
        else if ((jugada2.equals("Papel") && jugada1.equals("Piedra"))) {
            System.out.println("Ha ganado jugador dos papel le gana a piedra");
        }
        else if ((jugada2.equals("Tijera") && jugada1.equals("Papel"))) {
            System.out.println("Ha ganado jugador dos tijera le gana a papel");
        }





    }



}
