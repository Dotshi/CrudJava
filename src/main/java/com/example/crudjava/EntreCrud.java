package com.example.crudjava;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class EntreCrud {
    @FXML
    private Button idconnexion;

    @FXML
    private Button idinscription;

    @FXML
    void connexion(ActionEvent event) {
        HelloApplication.changeScene("Connexion");
    }
    @FXML
    void inscription(ActionEvent event) {
        HelloApplication.changeScene("Inscription");
    }
}
