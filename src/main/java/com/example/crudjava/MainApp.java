package com.example.crudjava;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApp extends Application {
    private static Stage stage;
    @Override
        public void start(Stage firstStage) throws IOException {
            stage = firstStage;
            FXMLLoader fxmlLoader = new FXMLLoader(MainApp.class.getResource("EntreCrud.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Bienvenue");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
    public static void changeScene(String fxml, Object controller) {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApp.class.getResource(fxml+".fxml"));
        try {
            fxmlLoader.setController(controller);
            Scene scene = new Scene(fxmlLoader.load());
            stage.setTitle("Inscription");
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void changeScene(String fxml) {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApp.class.getResource(fxml + ".fxml"));
        Scene scene = null;
        try {
            scene = new Scene(fxmlLoader.load());
            stage.setTitle("CrudJava");
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();

        }

    }

}
