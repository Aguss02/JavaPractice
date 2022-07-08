package Jugueteria;

public class Difraz implements JugueteProducto{
    private String descripcion;
    private Double precio;
    private String talle;

    public Difraz(String descripcion, Double precio, String talle) {
        this.descripcion = descripcion;
        this.precio = precio;
        this.talle = talle;
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
