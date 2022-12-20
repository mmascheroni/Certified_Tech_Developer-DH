package clase_22_pre_examen;

import clase_22_pre_examen.unidades.UnidadDeTrabajoCombinadaComposite;
import clase_22_pre_examen.unidades.UnidadDeTrabajoSimple;

public class DemoUnidad {
    public static void main(String[] args) {

        UnidadDeTrabajoFactoryMethodSingleton creador = UnidadDeTrabajoFactoryMethodSingleton.obtenerInstancia();

        UnidadDeTrabajoSimple mantenimiento = (UnidadDeTrabajoSimple) creador.crearUnidadDeTrabajo("Simple");
        mantenimiento.setNombre("Mantenimiento");
        mantenimiento.setCantidadPersonas(4);
        mantenimiento.setMontoPorPersona(120000);


        UnidadDeTrabajoSimple limpieza = (UnidadDeTrabajoSimple) creador.crearUnidadDeTrabajo("Simple");
        limpieza.setNombre("Limpieza");
        limpieza.setCantidadPersonas(24);
        limpieza.setMontoPorPersona(100000);
        limpieza.mostrarComponentes();
//        System.out.println(limpieza.calcularMonto());

        UnidadDeTrabajoCombinadaComposite serviciosGenerales = (UnidadDeTrabajoCombinadaComposite) creador.crearUnidadDeTrabajo("Combinada");
        serviciosGenerales.setNombre("Servicios Generales");
        serviciosGenerales.setCoeficienteGlobal(3.0);
        serviciosGenerales.agregarUnidadDeTrabajo(mantenimiento);
        serviciosGenerales.agregarUnidadDeTrabajo(limpieza);
//        System.out.println(serviciosGenerales.mostrarComponentes());
        System.out.println(serviciosGenerales.calcularMonto());

    }
}
