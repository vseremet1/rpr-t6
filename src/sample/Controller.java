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
import javafx.scene.input.KeyEvent;

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


    public void dodajIme (KeyEvent keyEvent)
    {
        ime=(TextField) keyEvent.getTarget();
        String name= ime.getText();

        ime.getStyleClass().removeAll("validno");
        ime.getStyleClass().removeAll("nevalidno");

        if ((nameValid(name)))
        {
            ime.getStyleClass().add("validno");

        }
        else {
            ime.getStyleClass().add("nevalidno");
        }


    }





    private boolean nameValid(String name) {

        if (name.length()>20) return false;
        if (name.length()==0) return false;
        if (name.length()>0 && name.length()<20) return true;

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


}
