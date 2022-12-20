package clase_11.activadad_mesa;

public class Cliente {

    // Atributos privados
    private int numeroCliente;
    private String apellido;
    private int dni;
    private String cuit;

    private Cuenta[] cuentasBancarias;

    // Constructores
    public Cliente() {}

    public Cliente(int numeroCliente, String apellido, int dni, String cuit) {
        this.numeroCliente = numeroCliente;
        this.apellido = apellido;
        this.dni = dni;
        this.cuit = cuit;
    }

    public Cliente(int numeroCliente, String apellido, int dni) {
        this.numeroCliente = numeroCliente;
        this.apellido = apellido;
        this.dni = dni;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public int getNumeroCliente() {
        return numeroCliente;
    }

    public String getApellido() {
        return apellido;
    }

    public int getDni() {
        return dni;
    }

    public String getCuit() {
        return cuit;
    }
    public void setCuentasBancarias(Cuenta[] cuentasBancarias) {
        this.cuentasBancarias = cuentasBancarias;
    }

}
