package J29;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentController {
    private ArrayList<Student> studentList = new ArrayList<>();
    private boolean toContinue = true;
    Scanner userInput = new Scanner(System.in);

    public StudentController() {

        while (toContinue) {
            System.out.println("Wybierz operację:");
            System.out.println("D-dodaj studenta; U-usuń studenta; W-wyświetl listę studentów; M-modyfikacja studenta; L-podaj liczbę studentów; Q-wyjście");
            String operacja = userInput.nextLine().toUpperCase();
            if (operacja.equals("D")) {
                dodajStudenta();
            } else if (operacja.equals("U")) {
                usunStudenta();
            } else if (operacja.equals("W")) {
                wyswietlStudentow();
            } else if (operacja.equals("M")) {
                zmodyfikujStudenta();
            } else if (operacja.equals("L")) {
                podajLiczbeStudentow();
            } else if (operacja.equals("Q")) {
                toContinue = false;
            } else {
                System.out.println("Nieznana operacja!");
            }//koniec if else


        }//koniec while
    }

    private void dodajStudenta() {
        System.out.println("Podaj imię studenta:");
        String imie = userInput.nextLine();
        System.out.println("Podaj nazwisko studenta:");
        String nazwisko = userInput.nextLine();
        boolean isOk = true;
//        do {
        System.out.println("Podaj nr indeksu studenta:");
        int index = userInput.nextInt();
        userInput.nextLine();

//            for (Student tmp: studentList){
//
//            }
//
//        }while(isOk);

        Student nowyStudent = new Student(imie, nazwisko, index);
        studentList.add(nowyStudent);
        Student.count++;
    }

    private void usunStudenta() {
        if (studentList.size()==0){
            System.out.println("Brak studentów!");
        }else {
            System.out.println("Podaj nr indeksu studenta do usunięcia:");
            int index = userInput.nextInt();
            userInput.nextLine();
            String message = "Nie ma takiego studenta!";
            for (Student tmp : studentList) {

                if (tmp.getIndex() == index) {

                    studentList.remove(tmp);
                    message = "Usunięto studenta";
                    Student.count--;
                    System.out.println(message);
                    break;
                }
                System.out.println(message);
            }
        }

    }

    private void zmodyfikujStudenta() {
        System.out.println("Podaj nr indeksu studenta do modyfikacji:");
        int index = userInput.nextInt();
        userInput.nextLine();
        String message = "Nie ma takiego studenta!";
        for (Student tmp : studentList) {

            if (tmp.getIndex() == index) {
                System.out.println("Podaj nowe imię:");
                String noweImie = userInput.nextLine();
                if (!noweImie.equals("")) {
                    tmp.setImie(noweImie);
                }
                System.out.println("Podaj nowe nazwisko:");
                String noweNazwisko = userInput.nextLine();
                if (!noweNazwisko.equals("")) {
                    tmp.setNazwisko(noweNazwisko);
                }


                message = "Zmodyfikowano studenta";
            }
            System.out.println(message);
        }


    }

    private void wyswietlStudentow() {
        for (Student tmp : studentList) {
            System.out.println(tmp);
        }
    }

    private void podajLiczbeStudentow() {
        System.out.println("Liczba studentów: "+Student.count);
    }
}
