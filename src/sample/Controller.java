package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller {

    ObservableList<String>  Odsjek = FXCollections.observableArrayList("AE","RI","EE","TK");
    ObservableList<String> Godina = FXCollections.observableArrayList("Prva","Druga","Treća");
    ObservableList<String>  Ciklus = FXCollections.observableArrayList("Bachelor","Master","Doktorski studij","Stručni studij");
    ObservableList<String> Status = FXCollections.observableArrayList("Redovan","Samofinansirajući");
    ObservableList<String> Borci =  FXCollections.observableArrayList("DA","NE");

    @FXML
    private TextField prezime;
    @FXML
    private TextField ime;
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




    String Ime,Prezime,Adresa,Telefon,Datum,Mjesto;
    int brojIndeksa,JMBG;


    public void dodajIme(ActionEvent actionEvent) {
        if (actionEvent.getSource()==ime) this.Ime=ime.getText();

    }

    public void dodajPrezime(ActionEvent actionEvent) {
        if (actionEvent.getSource()==prezime) this.Prezime=prezime.getText();
    }

    public void dodajBrojIndeksa(ActionEvent actionEvent) {
        if (actionEvent.getSource()==brIndeksa) this.brojIndeksa=Integer.parseInt(brIndeksa.getText());
    }

    public void dodajAdresu(ActionEvent actionEvent) {
        if (actionEvent.getSource()==adresa) this.Adresa=adresa.getText();
    }

    public void dodajTelefon(ActionEvent actionEvent) {
        if (actionEvent.getSource()==telefon) this.Telefon=telefon.getText();
    }

    public void dodajJMBG(ActionEvent actionEvent) {
        if (actionEvent.getSource()==jmbg) this.JMBG=Integer.parseInt(jmbg.getText());
    }

    public void dodajDatumRodjenja(ActionEvent actionEvent) {
        if (actionEvent.getSource()==datum) this.Datum=datum.getText();
    }

    public void dodajMjestoRodjenja(ActionEvent actionEvent) {
        if (actionEvent.getSource()==mjesto) this.Mjesto=mjesto.getText();
    }


    public void potvrdi (ActionEvent actionEvent)
    {
        if (actionEvent.getSource()==potvrdi)
        {
          new Student(Ime, Prezime, brojIndeksa, Adresa, Telefon, JMBG, Datum, Mjesto);

        }



    }


    @FXML
    public void initialize() {
        odsjek.setItems(Odsjek);
        godina.setItems(Godina);
        status.setItems(Status);
        borci.setItems(Borci);
        ciklus.setItems(Ciklus);


    }


}
