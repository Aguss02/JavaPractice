import java.util.ArrayList;

public class Barco {
    private ArrayList<Carga> carga = new ArrayList<>();

    public void addCarga(Carga c){
        carga.add(c);
    }

    public void mostrarCarga(){
        for(Carga c: carga){
            System.out.println( "Carga: " + c.getNombre() +
                            "  Peso: " + c.calcularPeso() );
        }
    }
}
