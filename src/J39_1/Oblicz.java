package J39_1;

public class Oblicz {
    public void wypisz (String _napis){
        try{
            System.out.println(_napis.length());
        }catch(NullPointerException e){
            System.out.println(" oooo");
        }
    }
}
