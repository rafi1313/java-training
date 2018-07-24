import java.util.ArrayDeque;

public class J21_4 {
    public static void main(String[] args) {
        ArrayDeque<String> kolejka = new ArrayDeque<>();
        kolejka.addFirst("A");
        kolejka.addFirst("B");
        kolejka.addFirst("C");
        kolejka.addFirst("D");
        kolejka.addFirst("E");

        kolejka.removeFirst();
        kolejka.removeFirst();
        kolejka.removeLast();
        kolejka.removeLast();

        System.out.println(kolejka);


    }
}
