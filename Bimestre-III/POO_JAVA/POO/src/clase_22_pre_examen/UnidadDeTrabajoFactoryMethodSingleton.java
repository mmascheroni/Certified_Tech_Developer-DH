package clase_22_pre_examen;

import clase_22_pre_examen.unidades.UnidadDeTrabajo;
import clase_22_pre_examen.unidades.UnidadDeTrabajoCombinadaComposite;
import clase_22_pre_examen.unidades.UnidadDeTrabajoSimple;

public class UnidadDeTrabajoFactoryMethodSingleton {

    private static UnidadDeTrabajoFactoryMethodSingleton instancia;


    private UnidadDeTrabajoFactoryMethodSingleton() {}

    public static UnidadDeTrabajoFactoryMethodSingleton obtenerInstancia() {

        if(UnidadDeTrabajoFactoryMethodSingleton.instancia == null) {
            UnidadDeTrabajoFactoryMethodSingleton.instancia = new UnidadDeTrabajoFactoryMethodSingleton();
        }

        return UnidadDeTrabajoFactoryMethodSingleton.instancia;
    }

    public UnidadDeTrabajo crearUnidadDeTrabajo(String tipo) {
        switch (tipo.toUpperCase()) {
            case "SIMPLE":
                return new UnidadDeTrabajoSimple();
            case "COMBINADA":
                return new UnidadDeTrabajoCombinadaComposite();
        }

        return null;
    }

}
