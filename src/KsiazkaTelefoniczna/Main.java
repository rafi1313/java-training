package KsiazkaTelefoniczna;

import KsiazkaTelefoniczna.controller.Controller;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {
        Scanner input = new Scanner(System.in);
        Controller uc = new Controller();

        boolean program = true;

        while (program) {
            System.out.println("P-pokaż, D-dodaj, U-usuń, M-modyfikuj, S-szukaj, Q-wyjście");

            String dec = input.nextLine();

            switch (dec.toUpperCase()) {
                case "D":
                    System.out.println("Podaj imię");
                    String imie = input.nextLine();
                    System.out.println("Podaj nazwisko");
                    String nazwisko = input.nextLine();
                    System.out.println("Podaj nr telefonu");
                    String telefon = input.nextLine();

                    uc.addKontakt(imie, nazwisko, telefon);
                    break;
                case "P":
                    System.out.println("Lista kontaktów");
                    uc.showContact();
                    break;
                case "U":
                    System.out.println("Lista kontaktów");
                    uc.showContact();
                    System.out.printf("Podaj nr kontaktu do usunięcia");
                    String idToDelete = input.nextLine();
                    uc.deleteContact(idToDelete);
                    break;
                case "M":
                    System.out.println("Lista kontaktów");
                    uc.showContact();
                    System.out.printf("Podaj nr kontaktu do modyfikacji");
                    String idToModify = input.nextLine();

                    System.out.println("Podaj nowe imię");
                    String noweImie = input.nextLine();
                    System.out.println("Podaj nazwisko");
                    String noweNazwisko = input.nextLine();
                    System.out.println("Podaj nr telefonu");
                    String nowyTelefon = input.nextLine();
                    uc.modifyContact(idToModify,noweImie,noweNazwisko,nowyTelefon);
                    break;
                case "S":
                    System.out.println("Podaj frazę do znalezienia");
                    String szukaj = input.nextLine();
                    uc.findContact(szukaj);
                    break;
                case "Q":
                    program = false;
                    break;

            }


        }


    }
}
