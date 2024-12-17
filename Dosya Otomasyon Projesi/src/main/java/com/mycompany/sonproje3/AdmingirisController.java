/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.sonproje3;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author murat
 */
public class AdmingirisController implements Initializable {

    @FXML
    private Button buton_UrunIslemleri;
    @FXML
    private Button buton_BayiIslemleri;
    @FXML
    private ImageView geriDonus;
    @FXML
    private ImageView kapatma;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    } 
    private void switchTourunislemleri() throws IOException{
        App.setRoot("UrunIslemleri");
    }
    private void switchTobayiislemleri() throws IOException{
        App.setRoot("bayiUrunIslemleri");
    }
    private void switchTopriary() throws IOException{
        App.setRoot("primary");
    }

    @FXML
    private void buton_UrunIslemleri(ActionEvent event) {
        try {
            switchTourunislemleri();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @FXML
    private void buton_BayiIslemleri(ActionEvent event) {
        try {
            switchTobayiislemleri();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @FXML
    private void geriDonus(MouseEvent event) {
        try {
            switchTopriary();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @FXML
    private void kapatma(MouseEvent event) {
        System.exit(0);
    }
    
}
