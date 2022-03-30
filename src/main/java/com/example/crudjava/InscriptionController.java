package com.example.crudjava;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;

import java.sql.SQLException;

public class InscriptionController {

    @FXML
    private Label idconfirmez;

    @FXML
    private TextField idconfirmez2;

    @FXML
    private Label idmail;

    @FXML
    private TextField idmail2;

    @FXML
    private Label idmdp;

    @FXML
    private TextField idmdp2;

    @FXML
    private Label idnom;

    @FXML
    private TextField idnom2;

    @FXML
    private Label idprenom;

    @FXML
    private TextField idprenom2;

    @FXML
    private ToggleButton idretour;

    @FXML
    private ToggleButton idsauvegarder;

    @FXML
    void idsauvegarder(ActionEvent event) {
    }

    @FXML
    public void inscription(ActionEvent event) throws SQLException {
        User user = new User();
        user.inscription(this.idnom2.getText(),this.idprenom2.getText(),this.idmail2.getText(),this.idmdp2.getText());
        MainApp.changeScene("Connexion.fxml");
    }
    @FXML
    public void retour(ActionEvent event) {
        MainApp.changeScene("EntreCrud");
    }

}