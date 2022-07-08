package FactorySingleton;

public class Test {
    public static void main(String[] args) {
        try {
            Gaseosa gs1 = GaseosaFactory.construir("Coca");
            gs1.abrir();
            Gaseosa gs2 = GaseosaFactory.construir("Naranja");
            gs2.abrir();
            Gaseosa gs3 = GaseosaFactory.construir("Uva");
            gs3.abrir();
        } catch (Exception e) {
            System.out.println("¡Exception encontrada: " + e);
        }
    }
}
