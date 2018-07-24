import java.util.Scanner;

public class J19_1 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Podaj wymiar tablicy:");
        int wymiar = userInput.nextInt();
        for (int i = 1; i <= wymiar; i++) {
            int poz = 1;
            for (int j = 1; j <= wymiar; j++) {
                if (i == poz || i == (wymiar + 1 - poz)) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
                poz++;
            }
            System.out.print("\n");
        }
    }
}
