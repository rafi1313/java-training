package J35_1;

public abstract class Sportowiec {
    private int predkosc=5;

    public int getPredkosc() {
        return predkosc;
    }

    public void setPredkosc(int predkosc) {
        this.predkosc = predkosc;
    }

    public abstract void przyspiesz ();
}
