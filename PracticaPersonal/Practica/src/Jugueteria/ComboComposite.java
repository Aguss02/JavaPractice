package Jugueteria;

import Composite.Departamento;

import java.util.ArrayList;

public class ComboComposite  implements JugueteProducto {
    private Integer codigo;
    private Double precio;
    private ArrayList<JugueteProducto> juguetes;

    public ComboComposite(Integer codigo) {
        this.codigo = codigo;
        this.juguetes = new ArrayList<>();
    }

    @Override
    public Double getPrecio() {
       Double total = 0.0;
        for (JugueteProducto j : juguetes) {
            total += j.getPrecio();
        }
        this.precio = total * 0.85;
        return this.precio;
    }

    public void addJuguete(JugueteProducto j){
        juguetes.add(j);
    }

    public void removeJuguete(JugueteProducto j){
        juguetes.remove(j);
    }

    @Override
    public Double applicarCupon15() {
        return this.precio * 0.85;
    }

    @Override
    public Double applicarCupon30() {
        return this.precio * 0.70;
    }
}
