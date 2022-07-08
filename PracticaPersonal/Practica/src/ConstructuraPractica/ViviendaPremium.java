package ConstructuraPractica;

import java.util.ArrayList;

public class ViviendaPremium implements Comprable{
    private ArrayList<Comprable> paquete = new ArrayList<>();
    private String nombre;
    private Double bonificacion;

    public ViviendaPremium(String nombre, Double bonificacion) {
        this.nombre = nombre;
        this.bonificacion = bonificacion;
    }

    public void agregarPaquete(Comprable c){
        this.paquete.add(c);
    }

    @Override
    public Double obtenerPrecio() {
       Double total = 0.0;
        for(Comprable p: paquete){
           total += p.obtenerPrecio();
        }
        total *= (100 - bonificacion) / 100;
        return total;
    }

    @Override
    public String getTipo() {
        return this.getClass().getSimpleName();
    }

}
