package clase_20.actividad_en_vivo.productos;

public class Ensalada extends Producto{


    public Ensalada(String nombre, double costo) {
        super(nombre, costo);
    }

    @Override
    public double calcularPrecio() {
        return this.getCosto() + (this.getCosto() / 100 * this.getPORCENTAJE_DE_GANANCIA());
    }
}
