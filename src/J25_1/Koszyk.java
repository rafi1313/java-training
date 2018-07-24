package J25_1;

import java.util.ArrayList;
import java.util.HashMap;

public class Koszyk {
    HashMap<String, Integer> zakupy = new HashMap<>();

//    Koszyk(ArrayList<String> produkty) {
//        for (String tmp : produkty) {
//            this.zakupy.put(tmp, 0);
//        }
//    }

    public void addToCart(String produkt, int liczba) {
        Integer obecnaIlosc;
        if (zakupy.containsKey(produkt)){
            obecnaIlosc = zakupy.get(produkt);
        }else {
            obecnaIlosc =0;
        }

        obecnaIlosc += liczba;
        zakupy.put(produkt, obecnaIlosc);

    }

}
