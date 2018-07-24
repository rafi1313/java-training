package J24;

public class Auto {
    String marka;
    String model;
    double cena;
    String kolor;
    String silnik;

    public Auto (){

    }
    public Auto(String marka, String model, double cena, String kolor, String silnik){
        this.marka = marka;
        this.model = model;
        this.cena = cena;
        this.kolor = kolor;
        this.silnik = silnik;
    }

    @Override
    public String toString() {
        return this.marka+" "+this.model+"; cena: "+this.cena+" PLN; kolor: "+this.kolor+"; silnik: "+this.silnik;
    }
}
