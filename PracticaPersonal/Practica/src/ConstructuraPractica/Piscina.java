package ConstructuraPractica;

public class Piscina implements Comprable{
    private String tipo;
    private Double litros;
    private String forma;
    private boolean iluminacion;
    private Double precioLitro;
    private Double precioIluminacion;

    public Piscina(String tipo, Double litros, String forma, boolean iluminacion, Double precioLitro, Double precioIluminacion) {
        this.tipo = tipo;
        this.litros = litros;
        this.forma = forma;
        this.iluminacion = iluminacion;
        this.precioLitro = precioLitro;
        this.precioIluminacion = precioIluminacion;
    }

    @Override
    public Double obtenerPrecio() {
        Double total;
        total = this.litros * precioLitro;
        if (iluminacion){
            total += precioIluminacion;
        }
        return total;
    }

    public String getTipo() {
        return this.tipo;
    }
}
