import java.util.ArrayList;
import java.util.Scanner;

public class J21 {
    public static void main(String[] args) {
        String wprowadzenie;
        Scanner userInput = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();
        do {
            System.out.println("Podaj napis do wprowadzenia do listy lub wpisz 'end' aby zakończyć: ");
            wprowadzenie = userInput.nextLine();
            if (wprowadzenie.equals("end")){
                System.out.println("Zakończono wprowadzanie do listy!");
            }else {
                lista.add(wprowadzenie);
            }

        } while (!wprowadzenie.equals("end") );

        for (String tmp: lista){
            System.out.println(tmp);
        }
    }
}
