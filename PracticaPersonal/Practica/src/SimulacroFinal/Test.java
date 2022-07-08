package SimulacroFinal;


public class Test {
    public static void main(String[] args) {
        OfertaAcademyFactory fabrica = OfertaAcademyFactory.getInstance();
        OfertaAcademica backend = fabrica.crearOfertaAcademica("Backend");
        OfertaAcademica frontend = fabrica.crearOfertaAcademica("Frontend");
        OfertaAcademica fullstack = fabrica.crearOfertaAcademica("Fullstack");
        System.out.println(backend.getPrecio());
        System.out.println(frontend.getPrecio());
        System.out.println(fullstack.getPrecio());

        Instituto.getInstance().agregarOfertas(backend);
        Instituto.getInstance().agregarOfertas(frontend);
        Instituto.getInstance().agregarOfertas(fullstack);

        Instituto.getInstance().generarInforme();
    }
}
