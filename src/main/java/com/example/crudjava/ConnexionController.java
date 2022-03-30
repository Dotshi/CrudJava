package com.example.crudjava;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.sql.SQLException;


public class ConnexionController {

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
        private Button idretour;

        @FXML
        void connexion(ActionEvent event) throws SQLException {
            User user = new User();
            user.Connexion(this.idmail.getText(),this.idmdp.getText());
            MainApp.changeScene("Crud",new CrudController());
    }
    @FXML
    void retour(ActionEvent event) {
        MainApp.changeScene("EntreCrud", new EntreCrudController());
    }
}
