package clase_20.actividad_en_vivo;

import clase_20.actividad_en_vivo.productos.Producto;

import java.util.ArrayList;

public class ComboComposite extends Producto {

    private ArrayList<Producto> productos = new ArrayList<>();
    private final double PORCENTAJE_DE_DESCUENTO = 5.0;

    public ComboComposite(String nombre) {
        super(nombre, 0.0);
    }


    public void agregarProducto(Producto producto) {
        this.productos.add(producto);
    }

    public void quitarProducto(Producto producto) {
        this.productos.add(producto);
    }
    @Override
    public double calcularPrecio() {
        double precio = 0;

        for (Producto producto : this.productos) {
            precio += producto.calcularPrecio();
        }

        return precio - (precio / 100 * this.PORCENTAJE_DE_DESCUENTO);
    }

    // Getters
    public ArrayList<Producto> getProductos() {
        return productos;
    }
}
