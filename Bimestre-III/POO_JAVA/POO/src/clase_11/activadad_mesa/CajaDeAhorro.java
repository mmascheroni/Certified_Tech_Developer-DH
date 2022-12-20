package clase_11.activadad_mesa;

import java.util.Objects;

public class CajaDeAhorro extends Cuenta{

    private static double tasaDeInteres;


    // Constructor
    public CajaDeAhorro(double saldo, double tasaDeInteres) {
        super(saldo);
        this.tasaDeInteres = tasaDeInteres;
    }

    public CajaDeAhorro(double saldo) {
        super(saldo);
    }

    // Definiciones de los metodos abstractos
    public void depositarEfectivo(double monto) {
        this.saldo += monto;
        System.out.println("En tu Caja de Ahorro has depositado $" + monto);
    }

    // Método definido
    public void cobrarIntereses() {
        this.saldo += this.saldo / 100 * CajaDeAhorro.tasaDeInteres;
        System.out.println("Has cobrado tus intereses. Saldo actual: $" + this.saldo);
    }

    public void extraerEfectivo(double monto) {
        if((this.getSaldo() + this.tasaDeInteres ) >= monto) {
            this.setSaldo(this.getSaldo() - monto);
            System.out.println("Has extraido de tu Caja de Ahorro $" + monto);
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }

        CajaDeAhorro cajaDeAhorro = (CajaDeAhorro) obj;
        return this.getCliente().getNumeroCliente() == cajaDeAhorro.getCliente().getNumeroCliente();
    }

    @Override
    public int hashCode() {
        return Objects.hash(tasaDeInteres);
    }

    @Override
    public String toString() {
        return "Caja de Ahorro: " + super.toString() + ", tasa de interés=" + tasaDeInteres;
    }



    // Getter
    public double getTasaDeInteres() {
        return tasaDeInteres;
    }

    // Setter
    public void setTasaDeInteres(double tasaDeInteres) {
        this.tasaDeInteres += tasaDeInteres;
    }
}
