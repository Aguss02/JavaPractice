package ConstructuraPractica;

public class Test {
    public static void main(String[] args) {
        ComprableFactory construir = ComprableFactory.getInstance();
        Comprable chalet = construir.crearComprable("chaletPareado");
        Comprable homeSweetHome = construir.crearComprable("homeSweetHome");
        Comprable hormigon = construir.crearComprable("hormigon");
        Constructora constructora = new Constructora();
        constructora.addProducto(chalet);
        constructora.addProducto(homeSweetHome);
        constructora.addProducto(hormigon);
        constructora.generarInforme();
    }
}
