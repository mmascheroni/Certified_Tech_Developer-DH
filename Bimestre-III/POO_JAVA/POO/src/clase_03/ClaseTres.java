package clase_03;

public class ClaseTres {


    public static void main(String[] args) {

        int[] numeros = {1, 2, 3, 4, 5}; //Asi creamos un arreglo cuando conocemos la cantidad(length)

        // Cuando nos conocemos la cantidad de nuestro array

        int[] numerosSinConocer = new int[5];
        numerosSinConocer[0] = 1;
        numerosSinConocer[1] = 2;
        numerosSinConocer[2] = 3;
        numerosSinConocer[3] = 4;
        numerosSinConocer[4] = 5;


        for (int i : numerosSinConocer) {
            System.out.print("Esta opcion es: " + i + "\n");

        }




    }



}
