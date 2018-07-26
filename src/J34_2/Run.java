package J34_2;

public class Run {
    public static void main(String[] args) {
        Przedmiot matma = new Przedmiot("Matematyka");
        matma.addProwadzacyWyklad("Jan");
        matma.addProwadzacyCwiczenia("Józef");
        System.out.println(matma);
    }
}
