package Composite;

public class Test {
    public static void main(String[] args) {
        DepartFinanciero departamento1 = new DepartFinanciero(1,"Financiero1");
        departamento1.getName();
        DepartVentas departamento2 = new DepartVentas(2,"Ventas");
        departamento2.getName();
        DepartComposite composite = new DepartComposite(3,"Composite");
        composite.addDepart(departamento1);
        composite.addDepart(departamento2);
        composite.getName();
    }
}
