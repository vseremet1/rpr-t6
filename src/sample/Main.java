package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;

import static javafx.scene.control.PopupControl.USE_COMPUTED_SIZE;

public class Main extends Application {

    ComboBox<String> odsjek;
    ComboBox<String> status;
    ComboBox<String> borci;
    ComboBox<String> godina;
    ComboBox<String> ciklus;


    @Override
    public void start(Stage primaryStage) throws Exception{
   Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Student");


        primaryStage.setScene(new Scene(root, USE_COMPUTED_SIZE, USE_COMPUTED_SIZE));
        primaryStage.show();




    }



    public static void main(String[] args) {
        launch(args);
    }
}
