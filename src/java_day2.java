import java.util.Random;
import java.util.Scanner;

public class java_day2 {

    public static void main(String[] args) {

//J11-0


//    String cos = (1<5)?"słońce":"deszcz";
//        System.out.println(cos);

//        System.out.println("Podaj wagę w kg:");
//        Scanner userInput = new Scanner(System.in);
//
//        double waga = userInput.nextDouble();
//
//        System.out.println("Podaj wzrost w cm:");
//        double wzrost = 0.01 * userInput.nextDouble();
//
//        double bmi = waga/(wzrost*wzrost);
//        if (bmi<18.5){
//            System.out.println("niedowaga");
//        }else if(bmi>24.9) {
//            System.out.println("nadwaga");
//        }else
//            System.out.println("waga prawidłowa");


//J11
//        System.out.println("Prosty kalkulator...");
//        System.out.println("Podaj pierwszą liczbę:");
//        Scanner userInput = new Scanner(System.in);
//
//        double liczba1 = userInput.nextDouble();
//        userInput.nextLine();
//        System.out.println("Podaj działanie [+,-,*,/]:");
//        String calc = userInput.nextLine();
//        System.out.println("Podaj drugą liczbę:");
//        double liczba2 = userInput.nextDouble();
//
//        if (liczba2 == 0 && calc.equals("/")) {
//            System.out.println("Dzielenie przez 0 jest niedozwolone!!!");
//
//        } else {
//
//
//            // na if
////        if (calc.equals("+")){
////            System.out.println(liczba1+liczba2);
////        }else if (calc.equals("-")){
////            System.out.println(liczba1-liczba2);
////        }else if (calc.equals("*")){
////            System.out.println(liczba1*liczba2);
////        }else if (calc.equals("/")){
////            System.out.println(liczba1/liczba2);
////        }else{
////            System.out.println("Niedozwolone działanie!");
////        }

//
//            switch (calc) {
//                case "+":
//                    System.out.println(liczba1 + liczba2);
//                    break;
//                case "-":
//                    System.out.println(liczba1 + -liczba2);
//                    break;
//                case "*":
//                    System.out.println(liczba1 * liczba2);
//                    break;
//                case "/":
//                    System.out.println(liczba1 / liczba2);
//                    break;
//                default:
//                    System.out.println("Niedozwolone działanie!");
//            }
//
//        }


//J13/////////////////////////////////////////////////////////////

//        int liczbaU, liczbaL;
//        Random rnd = new Random();
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Podaj liczbę:");
//        liczbaU = sc.nextInt();
//
//        for (int i=0; i<5;i++){
//            liczbaL = rnd.nextInt(5)+1;
//
//
//            if (liczbaL>liczbaU){
//                System.out.println("Wylosowana liczba: "+ liczbaL+ " jest większa niż podana.");
//            }else if (liczbaL<liczbaU){
//                System.out.println("Wylosowana liczba: "+ liczbaL+ " jest mniejsza niż podana.");
//            }else {
//                System.out.println("Wylosowana liczba: "+ liczbaL+ " jest równa podanej.");
//            }
//
//        }
///////////////////////////
//J14-1
//        System.out.println("GRA \"ZA MAŁO ZA DUŻO\"");
//        System.out.println("Zgaduj liczbę:");
//        Scanner userInput = new Scanner(System.in);
//        int guess;
//        int liczba = new Random().nextInt(100)+1;
//        int attempts = 1;
//
//        while (true){
//            guess = userInput.nextInt();
//            if (liczba==guess){
//                System.out.println("Gratulacje! Trafiłeś!");
//                System.out.println("Ilość prób: "+attempts);
//                break;
//            }else if (liczba<guess){
//                System.out.println("Podałeś za dużą liczbę");
//            }else {
//                System.out.println("Podałeś za małą liczbę");
//            }
//    attempts++;
//
//        }

        ///////////////////////////////////////


    }
}
