package com.example.crudjava;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.sql.SQLException;


public class Connexion {

        @FXML
        private Button idconnexion;

        @FXML
        private Label idmail;

        @FXML
        private TextField idmail2;

        @FXML
        private Label idmdp;

        @FXML
        private TextField idmdp2;

        @FXML
        void connexion(ActionEvent event) throws SQLException {
            User user = new User();
            user.Connexion(this.idmail.getText(),this.idmdp.getText());
            HelloApplication.changeScene("Crud.fxml");
                ((Node)(event.getSource())).getScene().getWindow().hide();
        }
}