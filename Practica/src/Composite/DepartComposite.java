package Composite;

import java.util.ArrayList;

public class DepartComposite implements Departamento{

    private int id;
    private String name;
    private ArrayList<Departamento> childDepartments;

    public DepartComposite(int id, String name) {
        this.id = id;
        this.name = name;
        this.childDepartments = new ArrayList<Departamento>();
    }

    @Override
    public void getName() {
        for(Departamento c: childDepartments){
            c.getName();
        }
    }

    public void addDepart(Departamento department){
        childDepartments.add(department);
    }

    public void removeDepart(Departamento department){
        childDepartments.remove(department);
    }
}
