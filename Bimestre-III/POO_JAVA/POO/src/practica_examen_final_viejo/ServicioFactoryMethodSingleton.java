package practica_examen_final_viejo;


import practica_examen_final_viejo.servicios.Servicio;
import practica_examen_final_viejo.servicios.ServicioComboComposite;
import practica_examen_final_viejo.servicios.ServicioSimple;

public class ServicioFactoryMethodSingleton {

    private static ServicioFactoryMethodSingleton instancia;

    private ServicioFactoryMethodSingleton() {}

    public static ServicioFactoryMethodSingleton obtenerInstancia() {
        if (ServicioFactoryMethodSingleton.instancia == null) {
            ServicioFactoryMethodSingleton.instancia = new ServicioFactoryMethodSingleton();
        }

        return ServicioFactoryMethodSingleton.instancia;
    }

    public Servicio crearServicio(String tipo) {

        switch(tipo.toUpperCase()) {
            case "SIMPLE":
                return new ServicioSimple();
            case "COMBO":
                return new ServicioComboComposite();
        }
        return null;
    }

}
