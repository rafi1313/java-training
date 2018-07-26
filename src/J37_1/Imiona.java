package J37_1;

public class Imiona {
    private String imie;

    public Imiona(String _imie) {
        this.imie = _imie;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    @Override
    public String toString() {
        return this.imie;
    }
}
