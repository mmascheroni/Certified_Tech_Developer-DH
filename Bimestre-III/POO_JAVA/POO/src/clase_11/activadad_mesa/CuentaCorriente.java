package clase_11.activadad_mesa;

import java.util.Objects;

public class CuentaCorriente extends Cuenta{

    private double montoAutorizadoParaGirar;

    // Constructor
    public CuentaCorriente(double saldo, double montoAutorizadoParaGirar) {
        super(saldo);
        this.montoAutorizadoParaGirar = montoAutorizadoParaGirar;
    }

    // Definiciones de los metodos abstractos
    public void depositarEfectivo(double monto) {
        this.saldo += monto;
        System.out.println("En tu cuenta corriente has depositado $" + monto);
    }

    public void extraerEfectivo(double monto) {
        if((this.getSaldo() + this.montoAutorizadoParaGirar) >= monto) {
            this.setSaldo((this.getSaldo() - monto));
            System.out.println("Has extraido $" + monto);
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

//    @Override
//    public boolean equals(Object obj) {
//        if (obj == null || this.getClass() != obj.getClass()) {
//            return false;
//        }
//
//        CajaDeAhorro cajaDeAhorro = (CajaDeAhorro) obj;
//        return this.getCliente().getNumero() == cajaDeAhorro.getCliente().getNumero();
//    }

    @Override
    public int hashCode() {
        return Objects.hash(montoAutorizadoParaGirar);
    }

    @Override
    public String toString() {
        return "Caja de Ahorro: " + super.toString() + ", monto autorizado de giro=" + montoAutorizadoParaGirar;
    }

    // Getter
    public double getMontoAutorizadoParaGirar() {
        return montoAutorizadoParaGirar;
    }

    // Setter
    public void setMontoAutorizadoParaGirar(double montoAutorizadoParaGirar) {
        this.montoAutorizadoParaGirar = montoAutorizadoParaGirar;
    }
}
