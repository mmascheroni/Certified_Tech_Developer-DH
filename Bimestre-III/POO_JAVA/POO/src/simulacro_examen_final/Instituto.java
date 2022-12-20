package simulacro_examen_final;

import simulacro_examen_final.ofertas.OfertaAcademica;

import java.util.ArrayList;

public class Instituto {

    private String nombre;
    private ArrayList<OfertaAcademica> ofertasAcademicas = new ArrayList<>();

    public void agregarOfertaAcademica(OfertaAcademica oferta) {
        this.ofertasAcademicas.add(oferta);
    }

    public void quitarOfertaAcademica(OfertaAcademica oferta) {
        this.ofertasAcademicas.remove(oferta);
    }

    public void generarInforme() {
        for (OfertaAcademica ofertaAcademica : ofertasAcademicas) {
            System.out.println("Oferta academica: " + ofertaAcademica.getNombre() + " tiene un precio de $" + ofertaAcademica.calcularPrecio());
        }
    }
}
