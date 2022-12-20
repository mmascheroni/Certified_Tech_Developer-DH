package clase_10;

public class Asteroide extends ObjetoEspacial{

    private int lesion;

    public Asteroide(int posx, int posy, char direccion, int lesion) {
        super(posx, posy, direccion);
        this.lesion = lesion;
    }

    // Getters
    public int getLesion() {
        return lesion;
    }


    // Setters
    public void setLesion(int lesion) {
        this.lesion = lesion;
    }

}
