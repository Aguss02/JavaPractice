package Composite;

public class DepartVentas implements Departamento{
    private int id;
    private String name;

    public DepartVentas(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public void getName() {
        System.out.println(getClass().getSimpleName());
    }
}
