package J36_1;

import java.util.ArrayList;

public class Run {
    public static void main(String[] args) {
        Kwadrat kwadracik = new Kwadrat();
        Kolo koleczko = new Kolo();


        ArrayList<Figury> listaFigur = new ArrayList<>();
        listaFigur.add(koleczko);
        listaFigur.add(kwadracik);
    }
}
