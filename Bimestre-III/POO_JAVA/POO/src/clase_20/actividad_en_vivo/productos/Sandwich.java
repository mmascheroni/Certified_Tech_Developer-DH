package clase_20.actividad_en_vivo.productos;

public class Sandwich extends Producto{


    public Sandwich(String nombre, double costo) {
        super(nombre, costo);
    }

    @Override
    public double calcularPrecio() {
        return this.getCosto() + (this.getCosto() / 100 * this.getPORCENTAJE_DE_GANANCIA());
    }
}
