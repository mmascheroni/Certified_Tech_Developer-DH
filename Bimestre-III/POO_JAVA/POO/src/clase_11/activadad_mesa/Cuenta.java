package clase_11.activadad_mesa;

public abstract class Cuenta {

    // Atributos Protegidos
    protected double saldo;
    protected Cliente cliente;

    public Cuenta(double saldo) {
        this.cliente = new Cliente();
        this.saldo = saldo;
    }

    // Metodos Abstractos
    public abstract void depositarEfectivo(double monto);
    public abstract void extraerEfectivo(double monto);


    // Metodos publicos
    public double informarSaldo() {
        return this.saldo;
    }

    @Override
    public String toString() {
        return "Cliente = " + cliente + " , saldo = " + saldo;
    }

    // Getters
    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    // Setters
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
