package J37_2;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) throws IOException {
        Scanner userInput = new Scanner(System.in);
//        System.out.println("Podaj swoje imię, a zapiszę je do pliku");
//        String wprowadzoneImie = userInput.nextLine();
//
//        PrintWriter save = new PrintWriter("X:\\BeD kurs\\java\\java-training\\src\\J37_2\\zapisaneImie.txt");
//        save.println(wprowadzoneImie);
//        System.out.println("Zapis zakonczony");
//        save.close();

        System.out.println("Podaj zapis do dodania do pliku");
        String wprowadzenie = userInput.nextLine();
        FileWriter zapis = new FileWriter("X:\\BeD kurs\\java\\java-training\\src\\J37_2\\zapisaneImie.txt",true);
        zapis.append(wprowadzenie);
        zapis.close();
    }

}
