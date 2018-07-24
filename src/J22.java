import java.util.HashMap;
import java.util.Scanner;

public class J22 {
    public static void main(String[] args) {

        HashMap<String, Double> cennik = new HashMap<>();
        HashMap<String, Integer> koszyk = new HashMap<>();


        cennik.put("mleko", 2.05);
        cennik.put("jajka", 4.99);
        cennik.put("chleb", 2.85);
        cennik.put("mąka", 2.40);
        cennik.put("cukier", 2.79);
        cennik.put("bułki", 2.79);
        cennik.put("woda", 2.55);
        cennik.put("pomarańcze", 7.25);
        cennik.put("ser", 3.79);

        koszyk.put("mleko", 0);
        koszyk.put("jajka", 0);
        koszyk.put("chleb", 0);
        koszyk.put("mąka", 0);
        koszyk.put("bułki", 0);
        koszyk.put("woda", 0);
        koszyk.put("pomarańcze", 0);
        koszyk.put("ser", 0);

        String zakupy = "1";
        Scanner userInput = new Scanner(System.in);
        String produkty = "Produkty: ";
        for (String tmp : cennik.keySet()) {
            produkty = new StringBuilder(produkty).append(tmp).append("; ").toString();
        }


        while (zakupy.length() != 0) {
            System.out.println("Wybierz projekt do zakupu lub naciśnij ENTER aby zakończyć:");
            System.out.println(produkty);
            zakupy = userInput.nextLine();
//            System.out.println(zakupy);
            if (!cennik.containsKey(zakupy)) {
                System.out.println("Brak takiego produktu!");
                continue;
            } else {
                if (zakupy.length() != 0) {
                    int ilosc = koszyk.get(zakupy);
                    if (ilosc != 0) {
                        System.out.println("Produkt jest juź w koszyku. Czy dodać ponownie? [T/N]");
                        String decyzja = userInput.nextLine().toUpperCase();
                        if (decyzja.equals("N")) {
                            continue;
                        }
                    }
                    ilosc++;
                    koszyk.put(zakupy, ilosc);
                } else {
                    System.out.println("Koniec zakupów");

                }
            }


        }
        //wyświetlenie podsumowania
        System.out.println("Zakupione produkty:");
        double koszt = 0.0;
        for (String tmp : koszyk.keySet()) {
            int sztuk = koszyk.get(tmp);
            if (sztuk != 0) {
                System.out.print(tmp + "=> Sztuk:" + sztuk + "\n");
            }
            koszt += sztuk * cennik.get(tmp);

        }
        System.out.println("Wartość zakupów: " + koszt);


    }
}
