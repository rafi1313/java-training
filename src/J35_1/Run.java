package J35_1;

public class Run {
    public static void main(String[] args) {
        Sportowiec janek = new Sprinter();
        System.out.println(janek);
        janek.przyspiesz();
        janek.przyspiesz();
        janek.przyspiesz();
        janek.przyspiesz();
        janek.przyspiesz();
        System.out.println(janek);

        Sportowiec bartek = new Sprinter();
        System.out.println(bartek);
    }
}
