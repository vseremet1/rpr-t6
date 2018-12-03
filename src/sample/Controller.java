package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import org.w3c.dom.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller {

    ObservableList<String> Odsjek = FXCollections.observableArrayList("AE", "RI", "EE", "TK");
    ObservableList<String> Godina = FXCollections.observableArrayList("Prva", "Druga", "Treća");
    ObservableList<String> Ciklus = FXCollections.observableArrayList("Bachelor", "Master", "Doktorski studij", "Stručni studij");
    ObservableList<String> Status = FXCollections.observableArrayList("Redovan", "Samofinansirajući");
    ObservableList<String> Borci = FXCollections.observableArrayList("DA", "NE");

    @FXML
    private TextField prezime;
    @FXML
    private DatePicker date;
    @FXML
    private TextField ime;
    @FXML
    private TextField email;
    @FXML
    private TextField brIndeksa;
    @FXML
    private TextField adresa;
    @FXML
    private TextField telefon;
    @FXML
    private TextField jmbg;
    @FXML
    private TextField datum;
    @FXML
    private TextField mjesto;
    @FXML
    private Button potvrdi;
    @FXML
    private ComboBox odsjek;
    @FXML
    private ComboBox status;
    @FXML
    private ComboBox godina;
    @FXML
    private ComboBox borci;
    @FXML
    private ComboBox ciklus;

    String Ime, Prezime, BrojIndeksa, Telefon, Mjesto, Email, Adresa, JMBG, Datum,odsjek1,status1,godina1,borci1,ciklus1;


    public void dodajIme(KeyEvent keyEvent) {
        ime = (TextField) keyEvent.getTarget();
        String name = ime.getText();
        this.Ime = name;

        ime.getStyleClass().removeAll("validno");
        ime.getStyleClass().removeAll("nevalidno");
        ime.getStyleClass().removeAll("normalno");

        if ((nameValid(name))) {
            ime.getStyleClass().add("validno");

        } else {
            ime.getStyleClass().add("nevalidno");
        }
    }

    public void dodajBrIndeksa(KeyEvent keyEvent) {

        brIndeksa = (TextField) keyEvent.getTarget();
        String broj = brIndeksa.getText();
        this.BrojIndeksa = broj;

        ime.getStyleClass().removeAll("validno");
        ime.getStyleClass().removeAll("nevalidno");

        if (validanIndeks(broj))

            brIndeksa.getStyleClass().add("validno");

        else brIndeksa.getStyleClass().add("nevalidno");


    }

    private boolean validanIndeks(String broj) {

        try {
            Integer.parseInt(broj);
            return true;
        } catch (Exception e) {
            return false;
        }

    }


    public void dodajPrezime(KeyEvent keyEvent) {
        prezime = (TextField) keyEvent.getTarget();
        String name = prezime.getText();
        this.Prezime = name;

        prezime.getStyleClass().removeAll("validno");
        prezime.getStyleClass().removeAll("nevalidno");

        if ((nameValid(name))) {
            prezime.getStyleClass().add("validno");

        } else {
            prezime.getStyleClass().add("nevalidno");
        }
    }


    private boolean nameValid(String name) {

        if (name.length() > 20) return false;
        if (name.length() == 0) return false;
        if (validanIndeks(name)) return false;
        if (name.length() > 0 && name.length() < 20) return true;

        return true;
    }


    @FXML
    public void initialize() {
        odsjek.setItems(Odsjek);
        godina.setItems(Godina);
        status.setItems(Status);
        borci.setItems(Borci);
        ciklus.setItems(Ciklus);


    }


    public void dodajMjesto(KeyEvent keyEvent) {

        mjesto = (TextField) keyEvent.getTarget();
        this.Mjesto = mjesto.getText();

        mjesto.getStyleClass().removeAll("validno");
        mjesto.getStyleClass().removeAll("nevalidno");


        if (nameValid(Mjesto)) mjesto.getStyleClass().add("validno");
        else mjesto.getStyleClass().add("nevalidno");


    }

    public void dodajJMBG(KeyEvent keyEvent) {

        jmbg = (TextField) keyEvent.getTarget();
        JMBG = jmbg.getText();

        jmbg.getStyleClass().removeAll("validno");
        jmbg.getStyleClass().removeAll("nevalidno");

        if (validanJMBG(JMBG)) jmbg.getStyleClass().add("validno");
        else jmbg.getStyleClass().add("nevalidno");
    }

    private boolean validanJMBG(String jmbg) {

        if (jmbg.length()>13) return false;
        if (validanIndeks(jmbg)) return true;



        return false;
    }

    public void dodajAdresu(KeyEvent keyEvent) {

        adresa = (TextField) keyEvent.getTarget();
        Adresa = adresa.getText();

        adresa.getStyleClass().removeAll("validno");
        adresa.getStyleClass().removeAll("nevalidno");


        if (nameValid(Adresa)) adresa.getStyleClass().add("validno");
        else adresa.getStyleClass().add("nevalidno");


    }

    public void dodajTelefon(KeyEvent keyEvent) {

        telefon = (TextField) keyEvent.getTarget();
        Telefon = telefon.getText();

        telefon.getStyleClass().removeAll("validno");
        telefon.getStyleClass().removeAll("nevalidno");


        if (validanTelefon(Telefon)) telefon.getStyleClass().add("validno");
        else telefon.getStyleClass().add("nevalidno");


    }

    private boolean validanTelefon(String telefon) {

        if (nameValid(telefon)) return false;

        if (telefon.length() > 12) return false;


        return true;

    }

    public void dodajEmail(KeyEvent keyEvent) {

        email = (TextField) keyEvent.getTarget();
        Email = email.getText();

        email.getStyleClass().removeAll("validno");
        email.getStyleClass().removeAll("nevalidno");


        if (nameValid(Email)) email.getStyleClass().add("validno");
        else email.getStyleClass().add("nevalidno");


    }

    public void dodajDatum(KeyEvent keyEvent) {

        date = (DatePicker) keyEvent.getTarget();
        Datum = date.getAccessibleText();

    }


    public void Potvrdi(ActionEvent actionEvent) {

        Stage stage = (Stage) potvrdi.getScene().getWindow();

        new Student(Ime,Prezime,BrojIndeksa,Mjesto,JMBG,Adresa,Telefon,Email,Datum,odsjek1,borci1,status1,godina1,ciklus1);

            stage.close();

    }

    public void dodajOdsjek(MouseEvent mouseEvent) {
        odsjek1 = String.valueOf (mouseEvent.getTarget());
    }

    public void dodajGodinu(MouseEvent mouseEvent) {
        godina1 = String.valueOf (mouseEvent.getTarget());
    }

    public void dodajCiklus(MouseEvent mouseEvent) {
        ciklus1 = String.valueOf (mouseEvent.getTarget());
    }

    public void dodajStatus(MouseEvent mouseEvent) {
        status1  = String.valueOf (mouseEvent.getTarget());
    }

    public void dodajBorci(MouseEvent mouseEvent) {
        borci1  = String.valueOf (mouseEvent.getTarget());
    }
}