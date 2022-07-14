public class Test {
    public static void main(String[] args) {
        CargaFactory construir = CargaFactory.getInstance();
        Carga tv = construir.crearCarga("tv");
        Carga medicamentos = construir.crearCarga("medicamentos");
        Carga contenedor = construir.crearCarga("contenedor");
        Barco barco = new Barco();
        barco.addCarga(tv);
        barco.addCarga(medicamentos);
        barco.addCarga(contenedor);
        barco.mostrarCarga();

    }
}
