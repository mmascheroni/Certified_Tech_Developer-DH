package clase_11.Impresora;

public class DemoImpresora {

    public static void main(String[] args) {

        ImpresoraCannon impresoraCannon1 = new ImpresoraCannon();

        impresoraCannon1.setHojasDisponibles(0);
        impresoraCannon1.setPorcentajeTinta(10.0);

        System.out.println("Tiene papel " + impresoraCannon1.tienePapel());
        System.out.println("Necesita tinta " + impresoraCannon1.necesitaTinta());
        System.out.println(impresoraCannon1.imprimir());


        ImpresoraEpson impresoraEpson1 = new ImpresoraEpson();

        impresoraEpson1.setHojasDisponibles(10);
        impresoraEpson1.setPorcentajeTinta(4.0);

        System.out.println("Tiene papel " + impresoraEpson1.tienePapel());
        System.out.println("Necesita tinta " + impresoraEpson1.necesitaTinta());
        System.out.println(impresoraEpson1.imprimir());

    }

}
