package J24;

public class AutoRun {
    public static void main(String[] args) {
        AutoController kontroler = new AutoController();

        kontroler.addAuto();
        kontroler.addAuto("BMW","Z3",60000,"black","V8");
        kontroler.addAuto("Audi","A3",45000,"red","V6");
        kontroler.addAuto("Polonez","Truck",10000,"blue","LPG");
        kontroler.addAuto("Opel","Astra",25500,"green","DIESEL");

        kontroler.showAuto();
    }
}
