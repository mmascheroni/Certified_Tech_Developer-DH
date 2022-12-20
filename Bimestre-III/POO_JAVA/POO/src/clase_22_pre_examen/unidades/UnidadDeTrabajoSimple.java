package clase_22_pre_examen.unidades;

public class UnidadDeTrabajoSimple extends UnidadDeTrabajo{

    private double montoPorPersona;
    private int cantidadPersonas;

    private final double PORCENTAJE_DE_INCREMENTO = 20.0;

    @Override
    public double calcularMonto() {
        double monto = 0;

        monto += this.cantidadPersonas * this.montoPorPersona;

        if(this.cantidadPersonas > 10) {
            monto += (monto / 100) * this.PORCENTAJE_DE_INCREMENTO;
        }

        return monto;
    }

    @Override
    public String mostrarComponentes() {
        return "Nombre: " + this.getNombre() + " Monto: $" + this.calcularMonto();
    }

    // Getters
    public double getMontoPorPersona() {
        return montoPorPersona;
    }

    public int getCantidadPersonas() {
        return cantidadPersonas;
    }

    public double getPORCENTAJE_DE_INCREMENTO() {
        return PORCENTAJE_DE_INCREMENTO;
    }

    //Setters
    public void setMontoPorPersona(double montoPorPersona) {
        this.montoPorPersona = montoPorPersona;
    }

    public void setCantidadPersonas(int cantidadPersonas) {
        this.cantidadPersonas = cantidadPersonas;
    }
}
