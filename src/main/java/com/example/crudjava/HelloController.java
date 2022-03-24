package com.example.crudjava;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    @FXML
    private TextField idconfirmez2;

    @FXML
    private TextField idmail2;

    @FXML
    private TextField idmdp2;

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
    void retour(ActionEvent event) {
    }
    @FXML
    void connexion(ActionEvent event) {

    }
    @FXML
    void inscription(ActionEvent event) {

    }
}