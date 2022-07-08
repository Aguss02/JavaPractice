package Jugueteria;

import SimulacroFinal.Instituto;

public class Test {
    public static void main(String[] args) {

        Jugueteria jugeteria = Jugueteria.getInstance();


        JuegoDeMesa life = new JuegoDeMesa("Life",2,6,50.0);
        jugeteria.agregarJuguetes(life);
        Juguete spiderman = new Juguete("Spiderman", 40.00, 5);
        jugeteria.agregarJuguetes(spiderman);
        Difraz ironman = new Difraz("Iron Man", 20.00, "M");

        ComboComposite navidenio = new ComboComposite(223344);
        navidenio.addJuguete(life);
        navidenio.addJuguete(spiderman);
        navidenio.addJuguete(spiderman);
        navidenio.addJuguete(ironman);
        jugeteria.agregarJuguetes(navidenio);

        jugeteria.generarReporte();
    }
}
