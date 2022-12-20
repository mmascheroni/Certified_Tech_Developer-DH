public class Diesel extends Motor{

    private String esTurbo;

    //Constructor
    public Diesel(int cilindrada, double potenciaCV, String marca, String estado, Mecanico mecanico){
        super(cilindrada, potenciaCV, marca, estado, mecanico);
    }

    //Metodo
    public boolean esTurbo(String esTurbo) {
        if(esTurbo.equals("ES TURBO")) {
            return true;
        } else {
            return false;
        }
    }

    // Getter
    public String getEsTurbo() {
        return esTurbo;
    }



    //Setter
    public void setEsTurbo(String esTurbo) {
        this.esTurbo = esTurbo;
    }
}
