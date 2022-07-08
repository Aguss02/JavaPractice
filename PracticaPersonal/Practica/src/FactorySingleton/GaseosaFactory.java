package FactorySingleton;

public class GaseosaFactory {

    private static GaseosaFactory instance;

    private GaseosaFactory(){

    }

    public static GaseosaFactory getInstance(){
        if(instance == null){
            instance = new GaseosaFactory();
        }
        return instance;
    }

    public static Gaseosa construir(String tipo){
        switch(tipo){
            case "Coca":
                return new GaseosaCola();
            case "Naranja":
                return new GaseosaNaranja();
            default:
                System.out.println("Ups, no encontramos este objeto para construir");
                return null;
        }
    }
}
