package J30_1;

public class Pojazd {
    int waga;
    int mocSilnika;
    String kolor;
    int liczbaPasazerow;
    double cena;

    public Pojazd() {
    }

    public Pojazd(int _waga, int _mocSilnika, String _kolor, int _liczbaPasazerow, double _cena) {
        this.waga = _waga;
        this.mocSilnika = _mocSilnika;
        this.kolor = _kolor;
        this.liczbaPasazerow = _liczbaPasazerow;
        this.cena = _cena;
    }
}
