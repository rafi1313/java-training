package J29;

public class Student {
    private String imie;
    private String nazwisko;
    private int index;

    public Student() {
    }

    public Student(String _imie, String _nazwisko, int _index) {
        this.imie = _imie;
        this.nazwisko = _nazwisko;
        this.index = _index;
    }

    public static int count = 0;

    @Override
    public String toString() {
        return this.imie + " " + this.nazwisko + " nr indeksu: " + this.index;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
