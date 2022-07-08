package SimulacroFinal;

public class Curso extends OfertaAcademica{

    private Double cargaHoraria;
    private Integer duracion;
    private Double valor;

    public Curso(String nombre, String descripcion, Double cargaHoraria, Integer duracion, Double valor) {
        super(nombre, descripcion);
        this.cargaHoraria = cargaHoraria;
        this.duracion = duracion;
        this.valor = valor;
    }

    @Override
    public Double getPrecio() {
        return this.cargaHoraria * this.duracion * this.valor;
    }
}
