package J34_2;

public class Przedmiot implements Wyklady, Cwiczenia {

    private String nazwa;
    private String prowadzacyCwiczenia = "";
    private String prowadzacyWyklad = "";

    public Przedmiot(String _nazwa) {
        this.nazwa = _nazwa;
    }

    @Override
    public void addProwadzacyCwiczenia(String _imie) {
        this.prowadzacyCwiczenia = _imie;
    }

    @Override
    public void addProwadzacyWyklad(String _imie) {
        this.prowadzacyWyklad = _imie;
    }

    @Override
    public String toString() {
        return "Nazwa przedmiotu: " + this.nazwa + "; Prowadzący wykład: " + this.prowadzacyWyklad + "; Prowadzący ćwiczenia: " + this.prowadzacyCwiczenia + ";";
    }
}
