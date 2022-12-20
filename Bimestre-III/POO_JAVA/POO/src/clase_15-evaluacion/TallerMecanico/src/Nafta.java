public class Nafta extends Motor implements Comparable<Nafta>{

    private boolean tieneEncendidoElectrico;
    private String descripcionSoftware;
    private int cantValvulas;

    //Constructor
    public Nafta(int cilindrada, double potenciaCV, String marca, String estado, Mecanico mecanico){
        super(cilindrada, potenciaCV, marca, estado, mecanico);
    }

    @Override
    public int compareTo(Nafta nafta) {
        if(this.potenciaCV > nafta.potenciaCV) {
            return 1;
        } else if (this.potenciaCV < nafta.potenciaCV) {
            return -1;
        } else {
            return 0;
        }
    }

    //Getters
    public boolean getTieneEncendidoElectrico() {
        return tieneEncendidoElectrico;
    }

    public String getDescripcionSoftware() {
        return descripcionSoftware;
    }

    public int getCantValvulas() {
        return cantValvulas;
    }

    //Setters
    public void setTieneEncendidoElectrico(boolean tieneEncendidoElectrico) {
        this.tieneEncendidoElectrico = tieneEncendidoElectrico;
    }

    public void setDescripcionSoftware(String descripcionSoftware) {
        this.descripcionSoftware = descripcionSoftware;
    }

    public void setCantValvulas(int cantValvulas) {
        this.cantValvulas = cantValvulas;
    }

}
