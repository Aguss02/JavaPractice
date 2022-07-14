public class CargaSimple implements Carga{
    private String nombre;
    private String descripcion;
    private Double peso;
    private boolean refrigeracion;

    public CargaSimple(String nombre, String descripcion, Double peso, boolean refrigeracion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.peso = peso;
        this.refrigeracion = refrigeracion;
    }

    @Override
    public Double calcularPeso() {
        if (refrigeracion){
            this.peso *= 1.1;
        }
        return this.peso;
    }

    public String getNombre() {
        return nombre;
    }
}
