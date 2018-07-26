package J37;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) throws FileNotFoundException {

        File plik = new File("X:\\BeD kurs\\java\\java-training\\src\\J37\\books.txt");
        Scanner skaner = new Scanner(plik);
        ArrayList<Book> listaKsiazek = new ArrayList<>();

        while (skaner.hasNextLine()) {
            String[] newLine = skaner.nextLine().split(",");
            Book newBook = new Book(newLine[0], newLine[1], Integer.parseInt(newLine[2].trim()));
            listaKsiazek.add(newBook);
        }

        for (Book tmp: listaKsiazek){
            System.out.println(tmp);
        }
    }
}
