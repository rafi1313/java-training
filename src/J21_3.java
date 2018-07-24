import java.util.HashMap;

public class J21_3 {

    public static void main(String[] args) {

        HashMap<String,Integer> mapa = new HashMap<>();
        mapa.put("zero",0);
        mapa.put("jeden",1);
        mapa.put("dwa",2);
        mapa.put("trzy",3);
        mapa.put("cztery",4);
        mapa.put("pięć",5);
        mapa.put("sześć",6);

        String zm1 = "jeden";
        String zm2 = "pięć";

        System.out.println("Dodawanie: "+ (mapa.get(zm1)+mapa.get(zm2)));

        System.out.println(mapa.values());
        System.out.println(mapa.size());

        for ( String tmp: mapa.keySet()){
            System.out.println("Klucz: "+ tmp+"; wartość: "+mapa.get(tmp));

        }
    }
}
