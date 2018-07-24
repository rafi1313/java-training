package J24;

import java.util.ArrayList;
import java.util.Scanner;

public class AutoController {

    ArrayList<Auto> listaAut = new ArrayList<>();

    public void addAuto () {
        Auto autko = new Auto();
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj markę:");
        autko.marka = input.nextLine();
        System.out.println("Podaj model:");
        autko.model = input.nextLine();
        System.out.println("Podaj cenę:");
        autko.cena = input.nextDouble();
        input.nextLine();
        System.out.println("Podaj kolor:");
        autko.kolor = input.nextLine();
        System.out.println("Podaj silnik:");
        autko.silnik = input.nextLine();
        listaAut.add(autko);
    }
    public void addAuto (String marka, String model, double cena, String kolor, String silnik) {
        Auto autko = new Auto(marka, model, cena, kolor, silnik);
        listaAut.add(autko);
    }
    public void showAuto(){
        for (Auto tmp: listaAut){
            System.out.println(tmp.toString());;
        }
    }


}
