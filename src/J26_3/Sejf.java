package J26_3;

import java.util.Random;

public class Sejf {
    private Random gen = new Random();
    private int tajnaLiczba= gen.nextInt(100)+1;

    private int getTajnaLiczba() {
        return tajnaLiczba;
    }
    public void odczyt(int kod){
        if (kod==852){
            System.out.println( this.getTajnaLiczba());
        }
    }
}
