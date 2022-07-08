package ConstructuraPractica;

public class Casa implements Comprable{
    private String tipo;
    private Double metrosCuadrados;
    private Double precioXMetro;
    private Integer ambientesMax;

    public Casa(String tipo, Double metrosCuadrados, Double precioXMetro) {
        this.tipo = tipo;
        this.metrosCuadrados = metrosCuadrados;
        this.precioXMetro = precioXMetro;
    }

    public void setAmbientesMax(Integer ambientesMax) {
        this.ambientesMax = ambientesMax;
    }

    @Override
    public Double obtenerPrecio() {
        Double total = 0.0;
        total = this.metrosCuadrados * precioXMetro;
        return total;
    }

    public String getTipo() {
        return this.tipo;
    }
}
