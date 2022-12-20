public class ExamenParcial extends Examen {
    private int numeroUnidad;
    private int numeroReintentos;

    public ExamenParcial(String titulo, String enunciado) {
        super(titulo, enunciado);
    }

    @Override
    public boolean consultarEstadoAprobacion() {
        if (this.getNotaEscrita() >= 4) {
            return true;
        }
        return false;
    }

    public boolean determinarPosibilidadRecuperar() {
        if (this.getNumeroUnidad() <= 3 && this.getNumeroReintentos() <= 3) {
            return true;
        } else if (this.getNumeroUnidad() > 3 && this.getNumeroReintentos() <= 2) {
            return true;
        }
        return false;
    }

    public int getNumeroUnidad() {
        return numeroUnidad;
    }

    public void setNumeroUnidad(int numeroUnidad) {
        this.numeroUnidad = numeroUnidad;
    }

    public int getNumeroReintentos() {
        return numeroReintentos;
    }

    public void setNumeroReintentos(int numeroReintentos) {
        this.numeroReintentos = numeroReintentos;
    }

}