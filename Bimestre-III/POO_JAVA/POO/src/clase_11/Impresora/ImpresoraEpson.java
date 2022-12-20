package clase_11.Impresora;

public class ImpresoraEpson extends Impresora {

    public String imprimir() {
        if(this.tienePapel() && !this.necesitaTinta()) {
            return "Imprimiendo desde Cannon...";
        } else {
            return "No se puede imprimir desde Cannon...";
        }
    }


}
