package ConstructuraPractica;

import java.util.ArrayList;

public class Constructora {
    private ArrayList<Comprable> producto = new ArrayList<>();

    public void addProducto(Comprable c){
        this.producto.add(c);
    };

    public Double getPrecio() {
        Double total = 0.0;
        for(Comprable p: producto){
            total += p.obtenerPrecio();
        }
        return total;
    }

    public void generarInforme(){
        for(Comprable p: producto){
            System.out.println("Tipo: " + p.getTipo() +
                    "  Precio de lista: " + p.obtenerPrecio());
        }

    }
}
