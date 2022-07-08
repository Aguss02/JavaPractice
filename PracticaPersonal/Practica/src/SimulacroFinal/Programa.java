package SimulacroFinal;


import java.util.ArrayList;

public class Programa extends OfertaAcademica{

    private Double bonificacion;
    private ArrayList<OfertaAcademica> cursos;

    public Programa(String nombre, String descripcion, Double bonificacion) {
        super(nombre, descripcion);
        this.bonificacion = bonificacion;
        this.cursos = new ArrayList<>();
    }

    @Override
    public Double getPrecio() {
        Double precio = 0.0;
        for(OfertaAcademica c: this.cursos){
            precio += c.getPrecio();
        }
        return precio * ((100 - bonificacion) / 100);
    }

    public void agregarCurso(OfertaAcademica oa){
        this.cursos.add(oa);
    }

    public void sacarCurso(OfertaAcademica oa){
        this.cursos.remove(oa);
    }
}
