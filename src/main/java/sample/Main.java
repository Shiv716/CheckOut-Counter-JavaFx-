package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    // Loads the main checkout:-

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("CHECKOUT.fxml"));
        primaryStage.setTitle("CHECKOUT");
        primaryStage.setScene(new Scene(root, 745, 503));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}