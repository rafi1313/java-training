package J25;

import java.util.Scanner;

public class CalcTest {
    public static void main(String[] args) {
        Calculator kalk = new Calculator();
        Scanner input = new Scanner(System.in);
        System.out.println("Wybierz działanie [+/-]");
        String operacja = input.nextLine();
        System.out.println("Podaj liczbę argumentów:");
        int argumentow = input.nextInt();

        if (operacja.equals("+")){
            if (argumentow==2){
                System.out.println(kalk.add(input.nextInt(),input.nextInt()));
            }else if (argumentow==3){
                System.out.println(kalk.add(input.nextInt(),input.nextInt(),input.nextInt()));
            }else {
                System.out.println("Błąd");
            }

        }else if (operacja.equals("-")){
            if (argumentow==2){
                System.out.println(kalk.subtract(input.nextInt(),input.nextInt()));
            }else if (argumentow==3){
                System.out.println(kalk.subtract(input.nextInt(),input.nextInt(),input.nextInt()));
            }else {
                System.out.println("Błąd");
            }
        }else {
            System.out.println("Niedostępna operacja!");
        }


    }
}
