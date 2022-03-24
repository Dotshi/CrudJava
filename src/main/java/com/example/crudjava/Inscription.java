package com.example.crudjava;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.*;
import com.example.crudjava.Inscription;

import java.sql.SQLException;

public class Inscription {

    @FXML
    private TextField idconfirmez2;

    @FXML
    private TextField idmail2;

    @FXML
    private TextField idmdp2;

    @FXML
    private TextField idnom2;

    @FXML
    private TextField idprenom2;

    @FXML
    private Button idretour;

    @FXML
    private Button idsauvegarder;

    @FXML
    public void inscription(ActionEvent event) throws SQLException {
        User user = new User();
        user.inscription(this.idnom2.getText(), this.idprenom2.getText(), this.idmail2.getText(), this.idmdp2.getText());
        HelloApplication.changeScene("Connexion.fxml");
    }

        @FXML
        public void retour (ActionEvent event){
            HelloApplication.changeScene("EntreCrud.fxml");
        }
}