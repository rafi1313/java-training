package J38;

import java.io.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CompanyController {
    FileWriter listaPracownikow = new FileWriter("X:\\BeD kurs\\java\\java-training\\src\\J38\\pracownicy.txt", true);
    Scanner userInput = new Scanner(System.in);


    public CompanyController() throws IOException {

    }

    public void start() throws IOException {
        boolean ifContinue = true;
        while (ifContinue) {
            System.out.println("Wybierz operację:");
            System.out.println("D-dodaj pracownika, O-odczyt listy pracowników, U - usuń pracownika, Z-zmień informacje o pracowniku, W-wyszukaj pracownika,Q-wyjście");
            String operacja = userInput.nextLine().toUpperCase();
            if (operacja.equals("D")) {
                dodaj();
            } else if (operacja.equals("O")) {
                listaPracownikow();
            } else if (operacja.equals("U")) {
                usun();
            } else if (operacja.equals("Z")) {
                zmodyfikuj();
            } else if (operacja.equals("W")) {
                wyszukaj();
            } else if (operacja.equals("Q")) {
                ifContinue = false;
            } else {
                System.out.println("Nieznana operacja!");
            }


        }//while
    }//metoda start

    private void dodaj() throws IOException {
        String imiePracownika="";
        String nazwiskoPracownika="";
        String pensjaPracownika="";
        do {
            System.out.println("Podaj imię pracownika:");
            imiePracownika = userInput.nextLine();
            if (imiePracownika.equals("")) {
                System.out.println("Nie podano imienia.");
            }
        } while (imiePracownika.equals(""));

        do {
            System.out.println("Podaj nazwisko pracownika:");
            nazwiskoPracownika = userInput.nextLine();
            if (nazwiskoPracownika.equals("")) {
                System.out.println("Nie podano nazwiska.");
            }
        } while (nazwiskoPracownika.equals(""));
        boolean ifContinue = true;
        do {

            try {
                System.out.println("Podaj pensję pracownika:");
                pensjaPracownika = userInput.nextLine();
//                userInput.nextLine();
                Integer.parseInt(pensjaPracownika);
            ifContinue = false;
            }catch (NumberFormatException e){
                System.out.println("Nie podano liczby");
//                userInput.nextLine();
            }
        } while (ifContinue);

        String pracownik = new StringBuilder().append(imiePracownika).append(";").append(nazwiskoPracownika).append(";").append(pensjaPracownika).append("\n").toString();
        listaPracownikow.append(pracownik);
        listaPracownikow.close();
    }//dodaj

    private void listaPracownikow() throws FileNotFoundException {
        File plikDoOdczytu = new File("X:\\BeD kurs\\java\\java-training\\src\\J38\\pracownicy.txt");
        Scanner fileInput = new Scanner(plikDoOdczytu);
        while (fileInput.hasNextLine()) {
            String currEmployee = fileInput.nextLine();
//            System.out.println(currEmployee);
            String[] pracownik = currEmployee.split(";");
            System.out.println("Imię: " + pracownik[0] + " Nazwisko: " + pracownik[1] + " Pensja: " + pracownik[2] + " PLN");
        }
    }//listaPracownikow

    private void usun() throws IOException {
        System.out.println("Podaj nazwisko pracownika do usunięcia:");
        String doUsuniecia = userInput.nextLine();
        File plikDoOdczytu = new File("X:\\BeD kurs\\java\\java-training\\src\\J38\\pracownicy.txt");
        Scanner fileInput = new Scanner(plikDoOdczytu);
        ArrayList<String[]> listaPracownikow = new ArrayList<>();
        String czyZnaleziono = "Nie znaleziono takiego pracownika!";
        while (fileInput.hasNextLine()) {
            String[] nowaLinia = fileInput.nextLine().split(";");
            if (nowaLinia[1].equals(doUsuniecia)) {
                czyZnaleziono = "Usunięto pracownika!";
            } else {
                listaPracownikow.add(nowaLinia);
            }
        }
        fileInput.close();
        FileWriter zapis = new FileWriter("X:\\BeD kurs\\java\\java-training\\src\\J38\\pracownicy.txt", false);
        for (String[] tmp : listaPracownikow) {
            String napis = tmp[0] + ";" + tmp[1] + ";" + tmp[2] + "\n";
            zapis.append(napis);
        }
        zapis.close();
        System.out.println(czyZnaleziono);
    }//usun

    private void zmodyfikuj() throws IOException {
        System.out.println("Podaj imie lub nazwisko pracownika do zmodyfikowania:");
        String doZnalezienia = userInput.nextLine();
        File plikDoOdczytu = new File("X:\\BeD kurs\\java\\java-training\\src\\J38\\pracownicy.txt");
        Scanner fileInput = new Scanner(plikDoOdczytu);
        ArrayList<String[]> listaPracownikow = new ArrayList<>();
        String czyZnaleziono = "Nie znaleziono takiego pracownika!";
        while (fileInput.hasNextLine()) {
            String[] nowaLinia = fileInput.nextLine().split(";");
            if (nowaLinia[0].equals(doZnalezienia) || nowaLinia[1].equals(doZnalezienia)) {
                czyZnaleziono = "Znaleziono pracownika!";
                System.out.println("Podaj nowe imię:");
                String noweImie = userInput.nextLine();
                System.out.println("Podaj nowe nazwisko:");
                String noweNazwisko = userInput.nextLine();
                System.out.println("Podaj nową pensję:");
                String nowaPensja = userInput.nextLine();
                if (!noweImie.equals("")) {
                    nowaLinia[0] = noweImie;
                }
                if (!noweNazwisko.equals("")) {
                    nowaLinia[1] = noweNazwisko;
                }
                if (!nowaPensja.equals("")) {
                    nowaLinia[2] = nowaPensja;
                }
            }
            listaPracownikow.add(nowaLinia);
        }
        fileInput.close();
        FileWriter zapis = new FileWriter("X:\\BeD kurs\\java\\java-training\\src\\J38\\pracownicy.txt", false);
        for (String[] tmp : listaPracownikow) {
            String napis = tmp[0] + ";" + tmp[1] + ";" + tmp[2] + "\n";
            zapis.append(napis);
        }
        zapis.close();
//        System.out.println(czyZnaleziono);


    }

    private void wyszukaj() throws FileNotFoundException {
        System.out.println("Podaj imie lub nazwisko pracownika do wyświetlenia:");
        String doZnalezienia = userInput.nextLine();
        File plikDoOdczytu = new File("X:\\BeD kurs\\java\\java-training\\src\\J38\\pracownicy.txt");
        Scanner fileInput = new Scanner(plikDoOdczytu);
        boolean czyZnaleziono = false;
        while (fileInput.hasNextLine()) {
            String[] pracownik = fileInput.nextLine().split(";");
            if ((pracownik[0].indexOf(doZnalezienia)) != -1 || (pracownik[1].indexOf(doZnalezienia)) != -1) {
                System.out.println("Imię: " + pracownik[0] + " Nazwisko: " + pracownik[1] + " Pensja: " + pracownik[2] + " PLN");
                czyZnaleziono = true;
            }


        }
        fileInput.close();
        if (!czyZnaleziono) {
            System.out.println("Nie znaleziono takiego pracownika!");
        }
    }
}
