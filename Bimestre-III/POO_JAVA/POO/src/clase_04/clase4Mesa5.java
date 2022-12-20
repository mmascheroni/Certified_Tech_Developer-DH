package clase_04;

public class clase4Mesa5 {

    public class CajaDeAhorros{
        public String titular = "";
        public double saldo = 0.0;
        public int cbu = 0;
        public String alias = "";

        CajaDeAhorros(String titular, double saldo, int cbu, String alias){
            this.titular = titular;
            this.saldo = saldo;
            this.cbu = cbu;
            this.alias = alias;
        }

        public void retirar(double importe){
            //logica
        }

        public void depositar(double importe){
            //logica
        }

        public void recibirTransferencia(double importe, int cbu){
            //logica
        }

    }

    public class Cheque{
        public String titular= "";
        public  int cbu = 0;
        public String tipo = "";
        public String fechaDeEmision = "";
        public String fechaDeVencimiento="";



        Cheque(String titular,int cbu, String tipo,  String fechaDeEmision, String fechaDeVencimiento){
            this.titular = titular;
            this.cbu = cbu;
            this.tipo = tipo;
            this.fechaDeEmision = fechaDeEmision;
            this.fechaDeVencimiento = fechaDeVencimiento;
        }

        public void endosar(String titular,int cbu){
            //logica
        }


    }
    public static void main(String[] args) {

    }
}
