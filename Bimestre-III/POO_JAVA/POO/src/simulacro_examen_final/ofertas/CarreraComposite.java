package simulacro_examen_final.ofertas;

import java.util.ArrayList;

public class CarreraComposite extends OfertaAcademica{

    private ArrayList<OfertaAcademica> ofertaAcademicas = new ArrayList<>();
    private double porcentajeDeBonificacion;

    @Override
    public double calcularPrecio() {
        double precioCarrera = 0;
        for (OfertaAcademica oferta : ofertaAcademicas) {
            precioCarrera += oferta.calcularPrecio();
        }

        return precioCarrera - (precioCarrera / 100 * this.porcentajeDeBonificacion);
    }

    public void agregarCurso(Curso curso) {
        this.ofertaAcademicas.add(curso);
    }

    public void quitarCurso(Curso curso) {
        this.ofertaAcademicas.remove(curso);
    }

    public void mostrarCursos() {
        for (OfertaAcademica oferta : ofertaAcademicas) {
            System.out.println(oferta.getNombre());
        }
    }

    // Getters
    public ArrayList<OfertaAcademica> getOfertaAcademicas() {
        return ofertaAcademicas;
    }

    public double getPorcentajeDeBonificacion() {
        return porcentajeDeBonificacion;
    }

    // Setter
    public void setPorcentajeDeBonificacion(double porcentajeDeBonificacion) {
        this.porcentajeDeBonificacion = porcentajeDeBonificacion;
    }
}
