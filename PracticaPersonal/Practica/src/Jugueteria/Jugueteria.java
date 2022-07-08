package Jugueteria;

import SimulacroFinal.OfertaAcademica;

import java.util.ArrayList;

public class Jugueteria {

    private static Jugueteria instance;
    private ArrayList<JugueteProducto> juguetes;

    private Jugueteria() {
        this.juguetes = new ArrayList<>();
    }

    public static Jugueteria getInstance() {
       if(instance == null){
           instance = new Jugueteria();
       }
        return instance;
    }

    public void agregarJuguetes(JugueteProducto j){
        this.juguetes.add(j);
    }

    public void generarReporte(){
        for(JugueteProducto j: this.juguetes){
            System.out.println("Nombre: " + j.getClass().getSimpleName() +
                    "  Precio de lista: " + j.getPrecio() +
                    "  Con 15% Desc: " + j.applicarCupon15() +
                    "  Con 30% Desc: " + j.applicarCupon30());
        }
    }


}
