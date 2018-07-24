import java.util.ArrayList;

public class J21_1 {
    public static void main(String[] args) {
        ArrayList<String> nowaLista = new ArrayList<>();
        nowaLista.add("A");
        nowaLista.add("B");
        nowaLista.add("C");
        nowaLista.add("D");
        nowaLista.add("E");
        System.out.println(nowaLista.get(2));
        nowaLista.set(3, "A");
        System.out.println(nowaLista.toString());
        nowaLista.remove("A");
        System.out.println(nowaLista.toString());
        nowaLista.remove(0);
        System.out.println(nowaLista.toString());
        System.out.println(nowaLista.contains("D"));
        System.out.println(nowaLista.toString());
        System.out.println("Rozmiar listy: "+nowaLista.size());
    }
}
