package clase_20.actividad_en_vivo;

import clase_20.actividad_en_vivo.productos.Producto;

import java.util.ArrayList;

public class Carrito {

    private ArrayList<Producto> productos = new ArrayList();

    public void agregarProducto(Producto producto) {
        this.productos.add(producto);
    }

    public void quitarProducto(Producto producto) {
        this.productos.remove(producto);
    }

    public double calcularTotalDeLaCompra() {
        double total = 0;

        for (Producto producto : this.productos) {
            total += producto.calcularPrecio();
        }

        return total;
    }
}
