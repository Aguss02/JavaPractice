package SimulacroFinal;

public class OfertaAcademyFactory {

    private static OfertaAcademyFactory instance;

    private OfertaAcademyFactory(){

    }

    public static OfertaAcademyFactory getInstance(){
        if(instance == null){
           instance = new OfertaAcademyFactory();
        }
        return instance;
    }

    public OfertaAcademica crearOfertaAcademica(String oa){
        switch (oa){
            case "Frontend":
                Curso curso1 = new Curso("Frontend", " ", 16.0,2, 1000.0);
                return curso1;
            case "Backend":
                Curso curso2 = new Curso("Backend", "",20.0, 2, 900.0);
                return curso2;
            case "Fullstack":
                Curso cursoFront = new Curso("Frontend", " ", 16.0,2, 1000.0);
                Curso cursoBack = new Curso("Backend", "",20.0, 2, 900.0);
                Programa programa = new Programa("Fullstack", "", 20.0);
                programa.agregarCurso(cursoBack);
                programa.agregarCurso(cursoFront);
                return programa;
            default:
                return null;
        }
    }

}
