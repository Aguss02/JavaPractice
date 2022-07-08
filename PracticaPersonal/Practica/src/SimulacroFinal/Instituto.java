package SimulacroFinal;

import java.util.ArrayList;

public class Instituto {
    private static Instituto instance;
    private ArrayList<OfertaAcademica> cursosYProgramas;

    private Instituto() {
    }

    public static Instituto getInstance() {
        if (instance == null) {
            instance = new Instituto();
        }
        return instance;
    }


    public void agregarOfertas(OfertaAcademica oa) {
        if (this.cursosYProgramas == null) {
            this.cursosYProgramas = new ArrayList();
        }
        this.cursosYProgramas.add(oa);
    }

    public void generarInforme() {
        for (OfertaAcademica oa : this.cursosYProgramas) {
            System.out.println("Nombre " + oa.getNombre() + "  Precio " + oa.getPrecio());
        }
    }
}
