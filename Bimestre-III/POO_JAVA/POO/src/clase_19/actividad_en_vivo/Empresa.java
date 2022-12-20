package clase_19.actividad_en_vivo;

import clase_19.actividad_en_vivo.empleados.Empleado;

import java.util.ArrayList;

public class Empresa {

    private String nombreDeFantasia;
    private ArrayList<Empleado> empleados;

    public Empresa(String nombreDeFantasia) {
        this.nombreDeFantasia = nombreDeFantasia;
    }

    public double calcularTotalDeSalarios() {
        return 1.0;
    }

}
