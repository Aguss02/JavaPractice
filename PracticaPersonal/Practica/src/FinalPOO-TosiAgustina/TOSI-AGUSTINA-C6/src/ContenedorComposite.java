import java.util.ArrayList;

public class ContenedorComposite implements Carga{
    private String nombre;
    private String descripcion;
    private Double pesoContenedor;
    private ArrayList<Carga> carga = new ArrayList<>();

    public ContenedorComposite(String nombre, String descripcion, Double pesoContenedor) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.pesoContenedor = pesoContenedor;
    }

    @Override
    public Double calcularPeso() {
        Double total = 0.0;
        for(Carga c: carga){
            total += c.calcularPeso();
        }
        total += pesoContenedor;
        return total;
    }

    public void addCarga(Carga c){
        carga.add(c);
    }

    public String getNombre() {
        return nombre;
    }
}
