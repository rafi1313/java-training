package J35_1;

public class Sprinter extends Sportowiec{
    @Override
    public void przyspiesz() {
        setPredkosc(getPredkosc()+1);
    }

    @Override
    public String toString() {
        return "Biegnie z prędkością:"+this.getPredkosc();
    }
}
