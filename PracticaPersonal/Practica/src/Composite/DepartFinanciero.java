package Composite;

public class DepartFinanciero implements Departamento{

    private int id;
    private String name;

    public DepartFinanciero(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public void getName() {
        System.out.println(getClass().getSimpleName());
    }
}
