package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Scene scan = new Scene (root,700,700);
         scan.getStylesheets ().add (getClass ().getResource ("index.css").toExternalForm ());
        primaryStage.setTitle("Perodic Table");
       primaryStage.setScene (scan);
        primaryStage.show();
       
        
    }


    public static void main(String[] args) {
        launch(args);
    }
}
