package J37_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Imiona> listaImion = new ArrayList<>();
        File myFile = new File("X:\\BeD kurs\\java\\java-training\\src\\J37_1\\imiona.txt");
        Scanner scanner = new Scanner(myFile);
        while (scanner.hasNextLine()) {
            String newLine = scanner.nextLine();
            Imiona newName = new Imiona(newLine);
            listaImion.add(newName);
        }
        for (int i = 1; i <= listaImion.size(); i++) {
            System.out.println("Imię: (" + i + ") " + listaImion.get(i - 1));
        }
    }
}
