package J30_1;

public class PojazdKolowy extends Pojazd {
    int liczbaKol;

    public PojazdKolowy(int _waga, int _mocSilnika, String _kolor, int _liczbaPasazerow, double _cena, int _liczbaKol){
        super(_waga, _mocSilnika, _kolor, _liczbaPasazerow, _cena);
        this.liczbaKol = _liczbaKol;
    }
    public PojazdKolowy(){}
}
