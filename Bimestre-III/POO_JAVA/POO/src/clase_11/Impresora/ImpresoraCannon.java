package clase_11.Impresora;

public class ImpresoraCannon extends Impresora{

    @Override
    public boolean necesitaTinta() {
        if(this.getPorcentajeTinta() <= 5.0) {
            return true;
        } else {
            return false;
        }
    }

    public String imprimir() {
        if(this.tienePapel() && !this.necesitaTinta()) {
            return "Imprimiendo desde Cannon...";
        } else {
            return "No se puede imprimir desde Cannon...";
        }
    }

}
