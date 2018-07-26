package J30_1;

public class Samochod extends PojazdKolowy {
    String typFelg;
    public Samochod(int _waga, int _mocSilnika, String _kolor, int _liczbaPasazerow, double _cena, int _liczbaKol,String _typFelg ){
        super(_waga, _mocSilnika, _kolor, _liczbaPasazerow, _cena, _liczbaKol);
        this.typFelg = _typFelg;
    }

    @Override
    public String toString() {
        return "Waga: "+this.waga+" Moc silnika: "+this.mocSilnika+" Kolor: "+this.kolor+" Liczba pasażerów: "+this.liczbaPasazerow+" Cena: "+this.cena+" Liczba kół: "+this.liczbaKol+" Typ felg: "+this.typFelg;
    }
}
