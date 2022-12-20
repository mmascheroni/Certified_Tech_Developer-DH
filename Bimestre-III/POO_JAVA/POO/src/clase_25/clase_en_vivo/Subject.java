package clase_25.clase_en_vivo;

public interface Subject {


    public void agregar(Observer observer);

    public void quitar(Observer observer);

    public void notificar();

}
