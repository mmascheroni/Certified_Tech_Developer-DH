package clase_02;

public class EsPrimo {

    public static void main(String[] args) {

        System.out.println(esPrimo(7));
        System.out.println(esPrimo(8));
        System.out.println(esPrimo(17));
        System.out.println(esPrimo(18));
        System.out.println(esPrimo(19));

    }



    public static boolean esPrimo(int number) {
        int contador = 0;

        for(int i = number - 1; i > 1; i--) {
            if(number % i == 0) {
                contador += 1;
            }
        }

        if (contador > 0) {
            return false;
        }

        return true;
    }
}
