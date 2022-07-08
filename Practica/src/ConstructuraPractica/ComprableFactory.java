package ConstructuraPractica;

public class ComprableFactory {
    private static ComprableFactory instance;

    private ComprableFactory(){

    }

   public static ComprableFactory getInstance() {
        if(instance == null){
            instance = new ComprableFactory();
        }
        return instance;
    }

    public Comprable crearComprable(String s){
        switch (s){
            case "chaletPareado":
                Casa chaletPareado = new Casa("Chalet Pareado",200.0, 1500.0);
                chaletPareado.setAmbientesMax(6);
                return chaletPareado;
            case "hormigon":
                Piscina hormigon = new Piscina("Hormigon",40000.0, "Cuadrada",false,1.10,null);
                return hormigon;
            case "homeSweetHome":
                ViviendaPremium homeSweetHome = new ViviendaPremium("Home Sweet Home",5.0);
                Casa aislada = new Casa("Casa Aislada",420.0,3200.0);
                Piscina desbordante = new Piscina("Piscina Desbordante",60000.0,"Cuadrada", true,2.10,30000.0);
                homeSweetHome.agregarPaquete(aislada);
                homeSweetHome.agregarPaquete(desbordante);
                return homeSweetHome;
            default:
                return null;
        }

    }
}
