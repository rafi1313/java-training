import java.util.Scanner;

public class J18_1 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int wielkosc = 5;
        String[] imiona = new String[wielkosc];
        for (int i = 0; i < wielkosc; i++) {
            System.out.println("Podaj imię do wprowadzenia:");
            imiona[i] = userInput.nextLine();
        }
        for (String tmp : imiona) {
            System.out.println("Cześć " + tmp);
        }
    }
}
