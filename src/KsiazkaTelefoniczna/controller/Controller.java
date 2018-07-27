package KsiazkaTelefoniczna.controller;

import KsiazkaTelefoniczna.database.DBConnect;

import javax.swing.plaf.nimbus.State;
import javax.xml.transform.Result;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Controller {

    DBConnect dao = new DBConnect();

    public void addKontakt(String _imie, String _nazwisko, String _telefon) throws SQLException {
        String insertSQL = "insert into kontakty(imie, nazwisko, telefon) values (?,?,?)";
        PreparedStatement st = dao.getCon().prepareStatement(insertSQL);
        st.setString(1, _imie);
        st.setString(2, _nazwisko);
        st.setString(3, _telefon);
        st.execute();
        st.close();
        System.out.println("Czy chcesz zatwierdzić wprowadzone zmiany ? [T/N]");
        Scanner input = new Scanner(System.in);
        String dec = input.nextLine().toLowerCase();
        if (dec.equals("t")) {
            dao.getCon().commit();
        } else {
            dao.getCon().rollback();
        }
    }

    public void showContact() throws SQLException {
        Statement st = dao.getCon().createStatement();
        ResultSet rs = st.executeQuery("select * from kontakty");
        int rows = 0;
        rs.last(); //przesunięcie kursora do ostatniego rekordu
        rows = rs.getRow(); //pobranie ilości wierszy zwróconych przez bazę danych
        rs.beforeFirst();// cofnięcie kursora do pierwszego rekordu
        if (rows == 0) {
            System.out.println("Brak kontaktów!");
        } else {
            while (rs.next()) {
                System.out.printf("%3s %10s %10s %10s \n", rs.getString("ID"), rs.getString("imie"), rs.getString("nazwisko"), rs.getString("telefon"));
            }
        }
        st.close();
    }

    public void deleteContact(String _idToDelete) throws SQLException {

        String sqlStatement = "delete from kontakty where id=?";
        PreparedStatement st = dao.getCon().prepareStatement(sqlStatement);
        st.setString(1, _idToDelete);
        st.execute();
        st.close();
        System.out.println("Czy chcesz zatwierdzić wprowadzone zmiany ? [T/N]");
        Scanner input = new Scanner(System.in);
        String dec = input.nextLine().toLowerCase();
        if (dec.equals("t")) {
            dao.getCon().commit();
        } else {
            dao.getCon().rollback();
        }
    }

    public void modifyContact(String _idToModify, String _noweImie, String _noweNazwisko, String _nowyTelefon) throws SQLException {

        String sqlStatement = "update kontakty set imie =?, nazwisko =?,telefon=? where id=?";
        PreparedStatement st = dao.getCon().prepareStatement(sqlStatement);
        st.setString(1, _noweImie);
        st.setString(2, _noweNazwisko);
        st.setString(3, _nowyTelefon);
        st.setString(4, _idToModify);
        st.execute();
        st.close();
        System.out.println("Czy chcesz zatwierdzić wprowadzone zmiany ? [T/N]");
        Scanner input = new Scanner(System.in);
        String dec = input.nextLine().toLowerCase();
        if (dec.equals("t")) {
            dao.getCon().commit();
        } else {
            dao.getCon().rollback();
        }
    }

    public void findContact(String _phrase) throws SQLException {
//        String sqlStatement = "select * from kontakty where imie like %?% or nazwisko like %?% or telefon like %?%";
//        PreparedStatement st = dao.getCon().prepareStatement(sqlStatement);
//        st.setString(1,_phrase);
//        st.setString(2,_phrase);
//        st.setString(3,_phrase);
//        st.execute();
//        st.close();
        Statement st = dao.getCon().createStatement();
        ResultSet rs = st.executeQuery("select * from kontakty where imie like '%" + _phrase + "%' or nazwisko like '%" + _phrase + "%' or telefon like '%" + _phrase + "%'");
        int rows = 0;
        rs.last(); //przesunięcie kursora do ostatniego rekordu
        rows = rs.getRow(); //pobranie ilości wierszy zwróconych przez bazę danych
        rs.beforeFirst();// cofnięcie kursora do pierwszego rekordu
        if (rows == 0) {
            System.out.println("Brak kontaktów!");
        } else {
            while (rs.next()) {
                System.out.printf("%3s %10s %10s %10s \n", rs.getString("ID"), rs.getString("imie"), rs.getString("nazwisko"), rs.getString("telefon"));
            }
        }
        st.close();

    }
}
