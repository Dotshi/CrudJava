package com.example.crudjava;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class CrudController implements Initializable {

    @FXML
    private Button idajouter;

    @FXML
    private TableColumn<?, ?> idemail;

    @FXML
    private Button idlire;

    @FXML
    private TableColumn<?, ?> idmdp;

    @FXML
    private Button idmodifier;

    @FXML
    private TableColumn<?, ?> idnom;

    @FXML
    private TableColumn<?, ?> idprenom;

    @FXML
    private Button idsupprimer;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle){
        String[][] colonnes ={
                {"Id", "iduser"},
                {"Nom", "nom"},
                {"Prenom", "prenom"},
                {"Mail", "mail"},
                {"Admin", "estAdmin"},
        };
        TableColumn<User, String> tbl = null;
        for (int i = 0; i < colonnes.length ; i ++){
            TableColumn<User, String> firstNameColumn = new TableColumn<>(colonnes[i][0]);
            firstNameColumn.setCellValueFactory(new PropertyValueFactory<>(colonnes[i][1]));
            tbl.getColumns().add(firstNameColumn);
        }
        TableColumn<User, String> firstNameColumns = new TableColumn<>("Code");
        firstNameColumns.setCellValueFactory(new PropertyValueFactory<>("code"));
        tbl.getColumns().add(firstNameColumns);
    }
}
