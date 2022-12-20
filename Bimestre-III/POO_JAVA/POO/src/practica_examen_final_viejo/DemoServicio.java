package practica_examen_final_viejo;

import practica_examen_final_viejo.servicios.ServicioComboComposite;
import practica_examen_final_viejo.servicios.ServicioSimple;

public class DemoServicio {
    public static void main(String[] args) {

        ServicioFactoryMethodSingleton creador = ServicioFactoryMethodSingleton.obtenerInstancia();

        ServicioSimple ventaAireAcondicionado = (ServicioSimple) creador.crearServicio("SIMPLE");
        ventaAireAcondicionado.setNombre("Venta Aire Acondicionado");
        ventaAireAcondicionado.setPrecioBase(65000);
        ventaAireAcondicionado.setIncluyeColocacion(false);
        System.out.println(ventaAireAcondicionado.calcularPrecio());


        ServicioSimple colocacionAireAcondicionado = (ServicioSimple) creador.crearServicio("Simple");
        colocacionAireAcondicionado.setNombre("Colocacion Aire Acondicionado");
        colocacionAireAcondicionado.setPrecioBase(10000);
        colocacionAireAcondicionado.setIncluyeColocacion(true);
        System.out.println(colocacionAireAcondicionado.calcularPrecio());

        ServicioComboComposite fullAireAcondicionado = (ServicioComboComposite) creador.crearServicio("Combo");
        fullAireAcondicionado.setNombre("Full Aire Acondicionado");
        fullAireAcondicionado.agregarServicio(ventaAireAcondicionado);
        fullAireAcondicionado.agregarServicio(colocacionAireAcondicionado);
        fullAireAcondicionado.setPorcentajeDeDescuento(10);
        System.out.println(fullAireAcondicionado.calcularPrecio());

    }
}
