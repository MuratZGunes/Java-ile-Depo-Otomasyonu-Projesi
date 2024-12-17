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
public class PersonelgirisController implements Initializable {

    @FXML
    private Button urunListesiDuzenle;
    @FXML
    private Button bayiListesiGoruntule;
    @FXML
    private ImageView loginekrani;
    @FXML
    private ImageView kapatma;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
         }  
        private void switchTopersonelBayiListesiGoruntule() throws IOException{
        App.setRoot("personelBayiListesiGoruntule");
    }
        private void switchTopersonelUrunListesiDuzenle() throws IOException{
        App.setRoot("personelUrunListesiDuzenle");
    }
        private void switchToprimary() throws IOException{
        App.setRoot("primary");
    }
        
        

    @FXML
    private void urunListesiDuzenle(ActionEvent event) {
        try {
            switchTopersonelUrunListesiDuzenle();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @FXML
    private void bayiListesiGoruntule(ActionEvent event) {
        try {
            switchTopersonelBayiListesiGoruntule();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @FXML
    private void loginekrani(MouseEvent event) {
        try {
            switchToprimary();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @FXML
    private void kapatma(MouseEvent event) {
        System.exit(0);
    }
    
    }