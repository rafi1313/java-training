package J34_1;

public class Zawodnik implements Zawody {
    String imie;
    int wiek;
    int waga;
    public Zawodnik(String _imie, int _wiek, int _waga){
        this.imie = _imie;
        this.wiek = _wiek;
        this.waga = _waga;

    }
    @Override
    public String plywanie() {
        return "Zawodnik "+this.imie+" pływa";
    }

    @Override
    public String skakanie() {
        return "Zawodnik "+this.imie+" skacze";
    }

    @Override
    public String bieganie() {
        return "Zawodnik "+this.imie+" biegnie";
    }

    @Override
    public String toString() {
        return "Zawodnik "+this.imie+" waży "+this.waga+" wiek zawodnika: "+this.wiek+" lat";
    }
}
