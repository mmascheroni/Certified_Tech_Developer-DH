package clase_12.actividad_mesa;

import clase_11.activadad_mesa.CajaDeAhorro;
import clase_11.activadad_mesa.Cuenta;

import java.util.Objects;

public class CuentaComitente extends Cuenta {

    private String clave;

    public CuentaComitente(double saldo, String clave) {
        super(saldo);
        this.clave = clave;
    }

    @Override
    public void depositarEfectivo(double monto) {
        this.saldo += monto;
        System.out.println("En tu Cuenta Comitente se ha depositado $" + monto);
    }

    @Override
    public void extraerEfectivo(double monto) {
        if ((this.saldo / 2) >= monto) {
            this.saldo -= monto;
            System.out.println("De tu Cuenta Comitente has extraido $" + monto);
        } else {
            System.out.println("Saldo insuficiente...");
        }
    }


    //Sobrecarga del metodo extraerEfectivo()
    public void extraerEfectivo(double monto, String clave) {
        if (this.clave.equals(clave) && this.saldo >= monto) {
            this.saldo -= monto;
            System.out.println("Has extraido de tu Cuenta Comitente (Acceso con clave) has extraido $" + monto);
        } else {
            System.out.println("Saldo insuficiente...");
        }
    }

    // Metodos heredados de la clase Object
    @Override
    public boolean equals(Object obj) {
        if(obj == null || this.getClass() != obj.getClass()) {
            return false;
        }

        CajaDeAhorro cajaDeAhorro = (CajaDeAhorro) obj;
        return this.getCliente().getNumeroCliente() == cajaDeAhorro.getCliente().getNumeroCliente();

    }

    @Override
    public int hashCode() {
        return Objects.hash(clave);
    }

    //Metodo Subreescrito
    @Override
    public String toString() {
        return "Cuenta comitente: " + super.toString() + ", clave = " + clave;
    }


    // Getters
    public String getClave() {
        return clave;
    }

    //Setters
    public void setClave(String clave) {
        this.clave = clave;
    }

}
