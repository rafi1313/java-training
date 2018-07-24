package konstruktory;

public class Przyklad {
    String pole1="";
    String pole2="";
    String pole3="";

    public Przyklad() {
    }

    public Przyklad(String _pole1) {
        this.pole1=_pole1;
    }
    public Przyklad(String _pole1,String _pole2) {
        this.pole1=_pole1;
        this.pole2=_pole2;
    }
    public Przyklad(String _pole1,String _pole2,String _pole3) {
        this.pole1=_pole1;
        this.pole2=_pole2;
        this.pole3=_pole3;
    }

    @Override
    public String toString() {
        return this.pole1+this.pole2+this.pole3;
    }
}
