package clase_03;

public class NumerosPrimos {

    public static void main(String[] args) {

        numerosPrimos(8);

    }

    public static void numerosPrimos(int cantidad) {
        int contador = 0;
        int numeroActual = 2;

        while(contador < cantidad) {

            if(esPrimo(numeroActual).equals("Es primo")) {
                System.out.println(numeroActual);
                contador++;
                numeroActual++;
            } else {
                numeroActual++;
            }

        }

    }

    static String esPrimo(int num) {
        int contar = 0;

        for(Integer i = num-1 ; i > 1; i--){

            if (num%i == 0){
                contar += 1;
            }

        }

        if(contar > 0){
            return "No es primo";

        }
        return "Es primo";
    }


}
