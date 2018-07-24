package J23;

public class Employee {
    public String imie;
    public String nazwisko;
    public String dataUrodzenia;
    public String stazPracy;

    @Override
    public String toString() {
        return this.imie+" "+this.nazwisko+" "+this.dataUrodzenia+" "+this.stazPracy;
    }
}
