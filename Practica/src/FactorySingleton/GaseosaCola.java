package FactorySingleton;

public class GaseosaCola extends Gaseosa{
    String nombre = "Coca Cool";

    @Override
    public String getNombre() {
        return nombre;
    }
    @Override
    public void abrir() {
        super.abrir();
    }

}
