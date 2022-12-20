package clase_02;

public class MayorDeTresNumeros {


    public static void main(String[] args) {

        System.out.println(mayorDeTresNumeros(1,2,3));
        System.out.println(mayorDeTresNumeros(3,5,1));
        System.out.println(mayorDeTresNumeros(9,8,1));

    }


    static int mayorDeTresNumeros(int num1, int num2, int num3) {

        if(num1 > num2 && num1 > num3) {
            return num1;
        } else if (num2 > num3) {
            return num2;
        } else {
            return num3;
        }


    }


}
