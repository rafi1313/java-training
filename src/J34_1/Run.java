package J34_1;

import java.util.ArrayList;

public class Run {
    public static void main(String[] args) {
        ArrayList<Zawodnik> listaZawodnikow = new ArrayList<>();

        Zawodnik zaw1 = new Zawodnik("Adam", 30, 90);
        listaZawodnikow.add(zaw1);
        Zawodnik zaw2 = new Zawodnik("Aga", 36, 62);
        listaZawodnikow.add(zaw2);
        Zawodnik zaw3 = new Zawodnik("Ala", 45, 55);
        listaZawodnikow.add(zaw3);
        Zawodnik zaw4 = new Zawodnik("Edek", 20, 70);
        listaZawodnikow.add(zaw4);
        Zawodnik zaw5 = new Zawodnik("Jacek", 10, 50);
        listaZawodnikow.add(zaw5);


        for (Zawodnik tmp : listaZawodnikow) {
            System.out.println(tmp);
            System.out.println(tmp.bieganie());
            System.out.println(tmp.plywanie());
            System.out.println(tmp.skakanie());


        }
    }
}
