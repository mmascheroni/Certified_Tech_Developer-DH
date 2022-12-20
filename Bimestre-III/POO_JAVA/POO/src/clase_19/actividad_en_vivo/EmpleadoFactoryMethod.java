package clase_19.actividad_en_vivo;

import clase_19.actividad_en_vivo.empleados.Empleado;
import clase_19.actividad_en_vivo.empleados.EmpleadoContratadoPorHora;
import clase_19.actividad_en_vivo.empleados.EmpleadoRelacionDeDependencia;

public class EmpleadoFactoryMethod {

    public Empleado crearEmpleado(String tipo) {

        switch (tipo) {
            case "EMP-RD":
                return new EmpleadoRelacionDeDependencia();
            case "EMP-PH":
                return new EmpleadoContratadoPorHora();
        }
        return null;
    }

}
