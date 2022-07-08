package Jugueteria;

public class Juguete implements JugueteProducto {
    private String nombre;
    private Double precio;
    private Integer edadMin;

    public Juguete(String nombre, Double precio, Integer edadMin) {
        this.nombre = nombre;
        this.precio = precio;
        this.edadMin = edadMin;
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

