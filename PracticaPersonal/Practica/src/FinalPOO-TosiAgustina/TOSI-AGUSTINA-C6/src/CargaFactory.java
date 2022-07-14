public class CargaFactory {
    private static CargaFactory instance;
    private CargaFactory(){

    }

    public static CargaFactory getInstance() {
        if(instance == null){
            instance = new CargaFactory();
        }
        return instance;
    }

    public Carga crearCarga(String s){
        switch (s){
            case "tv":
                CargaSimple simple1 = new CargaSimple("TV", "32' LCD", 3.0, false);
                return simple1;
            case "medicamentos":
                CargaSimple simple2 = new CargaSimple("Caja de medicamentos","Una caja con medicamentos",2.0,true);
                return simple2;
            case "contenedor":
                CargaSimple tv = new CargaSimple("TV", "32' LCD", 3.0, false);
                CargaSimple medicamentos = new CargaSimple("Caja de medicamentos","Una caja con medicamentos",2.0,true);
                ContenedorComposite contenedor = new ContenedorComposite("Contenedor mediano", "Contiene una TV y medicamentos", 100.0);
                contenedor.addCarga(tv);
                contenedor.addCarga(medicamentos);
                return contenedor;
            default:
                return null;
        }
    }
}
