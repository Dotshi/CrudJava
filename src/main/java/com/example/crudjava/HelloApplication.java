package com.example.crudjava;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    private static Stage stage;
    @Override
    public void start(Stage firstStage) throws IOException {
        stage = firstStage;
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("EntreCrud.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("CrudUser !");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

    public static void changeScene(String fichierFXML, Object controller) {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource( "Inscription.fxml"));
        try {
            Scene scene = new Scene(fxmlLoader.load());
            stage.setTitle("CrudUser !");
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void changeScene(String fichierFXML) {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource( fichierFXML+".fxml"));
        try {
            Scene scene = new Scene(fxmlLoader.load());
            stage.setTitle("CrudUser !");
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
