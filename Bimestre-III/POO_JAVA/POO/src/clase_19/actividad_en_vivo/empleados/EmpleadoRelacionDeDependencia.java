package clase_19.actividad_en_vivo.empleados;

public class EmpleadoRelacionDeDependencia extends Empleado{

    private double salarioBruto;
    public static double incentivo = 15.0;


    @Override
    public double calcularSalario() {
        return 0;
    }
}
