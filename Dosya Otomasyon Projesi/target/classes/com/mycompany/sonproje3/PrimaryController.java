/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.sonproje3;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;

/**
 * FXML Controller class
 *
 * @author murat
 */
public class PrimaryController implements Initializable {

    @FXML
    private Button girisYap;
    @FXML
    private PasswordField sifreAlani;
    @FXML
    private ComboBox<String> adminSec;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
     adminSec.setItems(FXCollections.observableArrayList("Murat (Admin)","Gunes (Admin)","Personel"));
    }    
}
