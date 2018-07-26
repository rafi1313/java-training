package J30_2;

public class Kwiatek extends Ogrod {
    String zapach = "owocowy";

public Kwiatek(String nazwa,String ile){

}

    @Override
    public String getZapach() {
        return zapach + " " + super.getZapach();
    }
}
