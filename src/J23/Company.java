package J23;

public class Company {
    public static void main(String[] args) {
        Employee mirek = new Employee();
        mirek.imie = "Mirek";
        mirek.nazwisko = "Mirkowski";
        mirek.dataUrodzenia = "20.11.1980";
        mirek.stazPracy = "30 lat";

        Employee jola = new Employee();
        jola.imie = "Jola";
        jola.nazwisko = "Jolińska";
        jola.dataUrodzenia = "20.11.1982";
        jola.stazPracy = "10 lat";

        Employee adam = new Employee();
        adam.imie = "Adam";
        adam.nazwisko = "Adamowski";
        adam.dataUrodzenia = "12.10.1950";
        adam.stazPracy = "20 lat";


//        System.out.println("Imię i nazwisko: "+mirek.imie+" "+mirek.nazwisko+"; data urodzenia: "+mirek.dataUrodzenia+"; staż pracy: "+mirek.stazPracy);
//        System.out.println("Imię i nazwisko: "+jola.imie+" "+jola.nazwisko+"; data urodzenia: "+jola.dataUrodzenia+"; staż pracy: "+jola.stazPracy);
//        System.out.println("Imię i nazwisko: "+adam.imie+" "+adam.nazwisko+"; data urodzenia: "+adam.dataUrodzenia+"; staż pracy: "+adam.stazPracy);
        System.out.println(mirek);


    }
}
