package simulacro_examen_final;

import simulacro_examen_final.ofertas.CarreraComposite;
import simulacro_examen_final.ofertas.Curso;

public class DemoInstituto {
    public static void main(String[] args) {

        OfertaAcademicaFactoryMethodSingleton creador = OfertaAcademicaFactoryMethodSingleton.obtenerInstancia();

        //CURSO FRONTEND
        Curso frontEnd = (Curso) creador.crearOfertaAcademica("CURSO");
        frontEnd.setNombre("FrontEnd");
        frontEnd.setDuracionMensual(2);
        frontEnd.setCargaHorariaMensual(20);
        frontEnd.setValorHora(900);

        //CURSO BACKEND
        Curso backEnd = (Curso) creador.crearOfertaAcademica("Curso");
        backEnd.setNombre("BackEnd");
        backEnd.setDuracionMensual(2);
        backEnd.setCargaHorariaMensual(16);
        backEnd.setValorHora(1000);

        //CARRERA FULLSTACK (COMPOSITE)
        CarreraComposite fullStack = (CarreraComposite) creador.crearOfertaAcademica("carrera");
        fullStack.setNombre("FullStack");
        fullStack.setPorcentajeDeBonificacion(20);
        fullStack.agregarCurso(frontEnd);
        fullStack.agregarCurso(backEnd);

        Instituto instituto = new Instituto();
        instituto.agregarOfertaAcademica(frontEnd);
        instituto.agregarOfertaAcademica(backEnd);
        instituto.agregarOfertaAcademica(fullStack);
        instituto.generarInforme();

    }
}
