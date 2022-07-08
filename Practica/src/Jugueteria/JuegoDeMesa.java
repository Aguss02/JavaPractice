package Jugueteria;

public class JuegoDeMesa implements JugueteProducto{
    private String nombre;
    private Integer cantJugadoresMin;
    private Integer getCantJugadoresMax;
    private Double precio;

    public JuegoDeMesa(String nombre, Integer cantJugadoresMin, Integer getCantJugadoresMax, Double precio) {
        this.nombre = nombre;
        this.cantJugadoresMin = cantJugadoresMin;
        this.getCantJugadoresMax = getCantJugadoresMax;
        this.precio = precio;
    }

    @Override
    public Double getPrecio() {
        return this.precio;
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
