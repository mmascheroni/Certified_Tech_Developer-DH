package clase_21.actividad_mesa;

import clase_21.actividad_mesa.productos.Caja;
import clase_21.actividad_mesa.productos.Pelota;
import clase_21.actividad_mesa.productos.Producto;

public class ProductoFactoryMethodSingleton {

    private static ProductoFactoryMethodSingleton instancia;

    private ProductoFactoryMethodSingleton(){}

    public static ProductoFactoryMethodSingleton obtenerInstancia() {
        if (ProductoFactoryMethodSingleton.instancia == null) {
            ProductoFactoryMethodSingleton.instancia = new ProductoFactoryMethodSingleton();
        }

        return ProductoFactoryMethodSingleton.instancia;
    }

    // FactoryMethod
    public Producto crearProducto(String tipo){
        switch (tipo.toUpperCase()){
            case "CAJA10X10":
                return new Caja(10, 10, 10);
            case "PELOTAFUTBOL":
                return new Pelota(11);
            case "PELOTATENIS":
                return new Pelota(0.32);
        }

        return null;
    }
}

