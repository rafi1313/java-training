package J37;

public class Book {

    private String nazwa;
    private String autor;
    private int rokWydania;

    public Book(String _nazwa,String _autor, int _rokWydania){
        this.nazwa = _nazwa;
        this.autor = _autor;
        this.rokWydania = _rokWydania;
    }

    @Override
    public String toString() {
        return this.autor+", "+this.nazwa+", rok wydania: "+this.rokWydania;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getRokWydania() {
        return rokWydania;
    }

    public void setRokWydania(int rokWydania) {
        this.rokWydania = rokWydania;
    }
}
