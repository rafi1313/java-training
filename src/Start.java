//import java.util.Arrays;
//import java.util.Random;

import java.math.BigDecimal;
import java.sql.Array;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
//        System.out.println(System.getProperty("java.runtime.version"));


//        System.out.print("Jan" + " " + "Piotr" + " " + "Marek");
//
//        System.out.print("Liczba int: ");
//        System.out.println(25);
//
//        System.out.print("Liczba double: ");
//        System.out.println(25.75);


//        String imie = "Jan";
//        int lat = 25;
//        boolean si = true;
//        String initials = "J K";
//        System.out.print("Cześć "+imie+", słyszałem, że masz " +lat);
//        System.out.println("i uczysz się programowania, czy to prawda? ");
//        System.out.println(si);
//        System.out.println("Czy Twoje inicjały to "+ initials);
//        System.out.println("Tak, "+si);

//        int liczba1 = 5;
//        int liczba2 = liczba1;
//        System.out.println(liczba1+liczba2);
//        double liczba3, liczba4;
//        liczba3 = 5;
//        liczba4 = 3.5;
//        System.out.println(liczba3);
//
//        System.out.println(liczba4);


//        final double STALA_PI = 3.14;
//        final int STALA2;
//
//        STALA_PI = 8;
//        STALA2 = 9;

//            String napis = "Nauka programowania w Java - Reaktor PWN";
//
//        System.out.println(napis.split(" ")[1]);
//        System.out.println(napis.split(" ")[3]);
//        System.out.println(napis.split("").toString());
//        System.out.println(Arrays.toString(napis.split(" ")));
//        System.out.println(napis.charAt(3));
//        System.out.println(napis.indexOf("PWN"));
//        System.out.println(napis.substring(22,26));
//        System.out.println(napis.replace("Reaktor", "traktor"));
//        System.out.println(napis.length());
//        System.out.println(napis.toUpperCase());


//        String nazwisko = "Jan";
//        nazwisko = new StringBuilder(nazwisko).append(" Kowalski").toString();
//        System.out.println(nazwisko);
//        String s= "a";
//        long start = System.nanoTime();
//        for (int i=0; i<10000;i++){
//            s=s+"a";
////            s = new StringBuilder(s).append("a").toString();
//        }
//        long time1 = (System.nanoTime()-start);
//        System.out.println("Time1: "+time1);
//
//        s= "a";
//        start = System.nanoTime();
//        for (int i=0; i<10000;i++){
////            s=s+"a";
//            s = new StringBuilder(s).append("a").toString();
//        }
//        long time2 = (System.nanoTime()-start);
//        System.out.println("Time1: "+time2);
//        System.out.println("Time1: "+(System.nanoTime()-start));
//        System.out.println((double) time2/time1);
//

//        String a = "tekst zmienna a";
//        String b = "tekst zmienna b";
//        String c, d;
//
//        c = a+b;
//        d = c +" coś";
//
//        System.out.println(c.toUpperCase());
//        System.out.println(d.toLowerCase());
//        System.out.println(d.length());
//        System.out.println(c.charAt(2));
//        System.out.println(c.charAt(5));
//        System.out.println(d.charAt(d.length()-3));
//
//        System.out.println(d.split(" ")[0].toString());
//        System.out.println(d.split(" ")[1].toString());

//        int x =5;
//        int y = 10;
//        boolean logic = true;
//        System.out.println("x<10 && y<11");
//        System.out.println(x<10 && y<11);
//
//        int a =10;
//        int b = 15;
//
//        String wynik = a<b?"a<b":"a>b";
//        System.out.println(wynik);
//

//double pol = 8.5;
//double pok = 2.5;
//
//int wynik = (int)(pol/pok);
//        System.out.println(wynik);
//        System.out.println((int)(pol/pok));

//        Random rand = new Random();
//
//        int x = rand.nextInt();
//        int y = rand.nextInt();
//        System.out.println(x);
//        System.out.println(y);
//
//        System.out.println(x>y?true:false);
//        System.out.println(x*2>y?true:false);
//        System.out.println((x+3>y)&&(y>x-2)?true:false);
//        System.out.println(x*y%2==0?true:false);


//   double liczba = 9.0;
//   int b = 3;
//   double pierwiastek = Math.sqrt(liczba);
//   double potega = Math.pow(liczba,b);
//        System.out.println("Pierwiastek z "+liczba+" wynosi: "+pierwiastek);
//        System.out.println("Liczba "+liczba+" podniesiona do potęgi "+b+" wynosi: "+potega);
//
//

//
//        BigDecimal x = new BigDecimal("1651325464651246894354");
//        BigDecimal y = new BigDecimal("12987465151246894354");
//
//
//        BigDecimal result;
//
//        result = x.add(y);
//        System.out.println(result);
//
//        result = x.subtract(y);
//        System.out.println(result);
//
//        result = x.multiply(y);
//        System.out.println(result);
//
//        result = x.divide(y,3);
//        System.out.println(result);


//        String imie;
//        Scanner odczyt = new Scanner(System.in);
//        System.out.println("Podaj imie:");
//        imie = odczyt.nextLine();
//        System.out.println("Witaj "+imie);
//        odczyt.close();


//        Scanner input = new Scanner(System.in);
//        input.useLocale(Locale.US);
//        System.out.println("Podaj A:");
//        double a = input.nextDouble();
//        System.out.println("Podaj B:");
//        double b = input.nextDouble();
//        input.close();
//        System.out.println("A + B = "+(a+b));

//        System.out.println("Podaj imię: ");
//        Scanner userInput = new Scanner(System.in);
//        String imie = userInput.nextLine();
//
//        System.out.println("Podaj nazwisko: ");
//        userInput = new Scanner(System.in);
//        String nazwisko = userInput.nextLine();
//
//        System.out.println("Podaj wiek: ");
//        userInput = new Scanner(System.in);
//        int wiek = userInput.nextInt();
//        userInput.nextLine();
//
//        System.out.println("Podaj nazwę kursu: ");
//        userInput = new Scanner(System.in);
//        String kurs = userInput.nextLine();
//
//        userInput.close();
//
//        System.out.println(imie+" "+nazwisko+" wiek:"+ wiek+"; kurs: "+kurs);


// J8
//        System.out.println("Podaj pierwszą liczbę:");
//        Scanner userInput= new Scanner(System.in);
//        userInput.useLocale(Locale.US);
//        double x1 = userInput.nextDouble();
//        userInput.nextLine();
//        System.out.println("Podaj drugą liczbę:");
//        double x2 = userInput.nextDouble();
//        userInput.nextLine();
//        System.out.println("Podaj trzecią liczbę:");
//        double x3 = userInput.nextDouble();
//        userInput.nextLine();
//        double wynik = (x1+x2+x3)/3;
//        System.out.println("Średnia wynosi: "+wynik);

// J8-1

//        System.out.println("Podaj podstawę do obliczenia potęgi:");
//        Scanner userInput = new Scanner(System.in);
//        double podstawa = userInput.nextDouble();
//
//        System.out.println("Podaj wykładnik do obliczenia potęgi:");
//        double wykladnik = userInput.nextDouble();
//
//        System.out.println(Math.pow(podstawa,wykladnik));
//J9
//        System.out.println("Podaj napis:");
//        Scanner userInput = new Scanner(System.in);
//        String teskt = userInput.nextLine();
//        String tekstReversed = new StringBuilder(teskt).reverse().toString();
//        userInput.close();
//        System.out.println("Czytając od końca będzie: "+tekstReversed);

//J9-1
//        System.out.println("Podaj pierwszą długość boku trójkąta:");
//        Scanner userInput= new Scanner(System.in);
//        userInput.useLocale(Locale.US);
//        double x1 = userInput.nextDouble();
//        userInput.nextLine();
//        System.out.println("Podaj drugą  długość boku trójkąta:");
//        double x2 = userInput.nextDouble();
//        userInput.nextLine();
//        System.out.println("Podaj trzecią  długość boku trójkąta:");
//        double x3 = userInput.nextDouble();
//
//         double boki[] = {x1,x2,x3};
//        Arrays.sort(boki);
//        String answer = (boki[0]*boki[0]+boki[1]*boki[1])==boki[2]*boki[2]?"To jest trójkąt prostokątny":"To nie jest trójkąt prostokątny";
//        System.out.println(answer);

//J10
//        System.out.println("Podaj dowolny tekst: ");
//        Scanner userInput = new Scanner(System.in);
//        String txt = userInput.nextLine();
//        System.out.println("Liczba znaków: " + txt.length());
//        int liczbaZnakow = txt.length();
//        int liczbaZnakowBezSpacji = String.join("", txt.split(" ")).length();
//        System.out.println(liczbaZnakow - liczbaZnakowBezSpacji);
//J10-2

        System.out.println("Podaj pierwszą liczbę:");
        Scanner userInput= new Scanner(System.in);
        userInput.useLocale(Locale.US);
        double x1 = userInput.nextDouble();
        userInput.nextLine();
        System.out.println("Podaj drugą liczbę:");
        double x2 = userInput.nextDouble();
        userInput.nextLine();
        System.out.println("Podaj trzecią liczbę:");
        double x3 = userInput.nextDouble();
        userInput.nextLine();

        double[] liczby = {x1,x2,x3};
        Arrays.sort(liczby);
        System.out.println("Największa liczba: "+ liczby[2]);
        System.out.println("Największa liczba: "+ liczby[0]);
    }
}
