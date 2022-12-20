package clase_21.actividad_mesa;

import clase_21.actividad_mesa.productos.Producto;

import java.util.ArrayList;

public class PelotaRegaloComposite extends Producto {

    private ArrayList<Producto> productos = new ArrayList<>();

    // Metodos

    public void agregarProducto(Producto producto) {
        this.productos.add(producto);
    }

    public void quitarProducto(Producto producto) {
        this.productos.remove(producto);
    }

    @Override
    public double calcularEspacio() {
        return 0;
    }
}
