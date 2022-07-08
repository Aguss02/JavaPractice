package ConstructuraPractica;

import java.util.ArrayList;

public class Constructora implements Comprable{
    private ArrayList<Comprable> producto = new ArrayList<>();

    public void addProducto(Comprable c){
        this.producto.add(c);
    };

    @Override
    public Double obtenerPrecio() {
        Double total = 0.0;
        for(Comprable p: producto){
            total += p.obtenerPrecio();
        }
        return total;
    }

    @Override
    public String getTipo() {
        return this.getClass().getSimpleName();
    }

    public void generarInforme(){
        for(Comprable p: producto){
            System.out.println("Tipo: " + p.getTipo() +
                    "  Precio de lista: " + p.obtenerPrecio());
        }

    }
}
