package J25_1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Sklep {
    public static void main(String[] args) {
        HashMap<String, Double> asortyment = new HashMap<>();
        asortyment.put("ser", 4.45);
        asortyment.put("woda", 1.20);
        asortyment.put("mleko", 2.19);
        asortyment.put("chleb", 3.45);
        asortyment.put("jaja", 0.85);
        String asortymentLista = "[";
        for (String tmp : asortyment.keySet()) {
            asortymentLista = new StringBuilder(asortymentLista).append(tmp).append(" ").append(asortyment.get(tmp)).append(" PLN; ").toString();
        }
        asortymentLista = new StringBuilder(asortymentLista).append("]").toString();
        ArrayList<String> produkty = new ArrayList<>();
        for (String tmp : asortyment.keySet()) {
            produkty.add(tmp);
        }
        boolean cont = true;
        Scanner userInput = new Scanner(System.in);
        ArrayList<Koszyk> listaKlientow = new ArrayList<>();
        while (cont) {
            System.out.println("Czy chcesz rozpocząć zakupy jako nowy klient? [T/N]");
            String toShop = userInput.nextLine().toUpperCase();
            String produktDoKoszyka = "1";
            if (toShop.equals("T")) {
                Koszyk newKlient = new Koszyk();
                while (!produktDoKoszyka.equals("")) {
                    System.out.println("Wybierz produkt z listy lub naciśnij ENTER aby zakończyć zakupy:");
                    System.out.println(asortymentLista);
                    produktDoKoszyka = userInput.nextLine();
                    if (!produktDoKoszyka.equals("")) {
                        if (asortyment.containsKey(produktDoKoszyka)) {
                            System.out.println("Podaj liczbę produktów:");

                           try {
                               int liczbaProduktow = userInput.nextInt();
                               userInput.nextLine();
                               newKlient.addToCart(produktDoKoszyka, liczbaProduktow);
                           }catch (InputMismatchException e){
                               System.out.println("Błędnie określona liczba produktów!");
                           }

                        } else {
                            System.out.println("Brak takiego produktu!");
                        }
                    }

                }
                listaKlientow.add(newKlient);
            } else {
                cont = false;
            }
        }
        //wyświetlenie koszyków
        int kosz = 1;


        for (Koszyk tmp:listaKlientow){

            System.out.println("Koszyk klienta "+kosz+":");
            double koszt=0.0;
            kosz++;
            double kosztKoszyka=0.0;
            for (String tmpKosz: tmp.zakupy.keySet()){

                double cena = asortyment.get(tmpKosz);
                int ilosc = tmp.zakupy.get(tmpKosz);
                double zaProdukty = cena * ilosc;
                System.out.println(tmpKosz+" sztuk: "+ilosc+"; koszt: "+zaProdukty+" PLN;");
                kosztKoszyka+=zaProdukty;
            }
            koszt+=kosztKoszyka;
            System.out.println("Razem za zakupy: "+koszt);
        }

    }
}
