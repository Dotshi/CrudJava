package com.example.crudjava;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class EntreCrudController {
    @FXML
    private Button idconnexion;

    @FXML
    private Button idinscription;

    @FXML
    void connexion(ActionEvent event) {
        MainApp.changeScene("Connexion");
    }
    @FXML
    void inscription(ActionEvent event) {
        MainApp.changeScene("Inscription");
    }
}
