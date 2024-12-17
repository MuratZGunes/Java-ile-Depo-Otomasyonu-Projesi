package com.mycompany.sonproje3;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;

public class PrimaryController implements Initializable {
    @FXML
    private Button girisYap;
    @FXML
    private PasswordField sifreAlani;
    @FXML
    private ComboBox<String> adminSec;
    @FXML
    private Label tf_bilgilendirme;
    @FXML
    private ImageView kapatma;

    private void switchTopersonelgiris() throws IOException {
        App.setRoot("personelgiris");
        
    }
    private void switchToadmingiris() throws IOException{
        App.setRoot("admingiris");
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
     adminSec.setItems(FXCollections.observableArrayList("Murat (Admin)","Gunes (Admin)","Personel"));
     
    }
    

    @FXML
    private void girisyap(ActionEvent event) {
        
     String parola=new String(sifreAlani.getText());
    tf_bilgilendirme.setText("");

     String muratAdmin="123456";
     String gunesAdmin="123123";
     String personel="123";

    if ("Murat (Admin)".equals(adminSec.getValue())) { 
        if (parola.equals(muratAdmin)) {
            try {
                switchToadmingiris();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
         }
        else if (parola.equals("")) {
            tf_bilgilendirme.setText("Lütfen bir şifre giriniz.");
        }
         else{
        tf_bilgilendirme.setText("Yanlış Şifre Girdiniz.");
        sifreAlani.setText("");
        }
    }
    else if ("Gunes (Admin)".equals(adminSec.getValue())) {
    if (parola.equals(gunesAdmin)) {
        try {
                switchToadmingiris();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
    }
     else if (parola.equals("")) {
            tf_bilgilendirme.setText("Lütfen bir şifre giriniz.");
        }
    else{
        tf_bilgilendirme.setText("Yanlış Şifre Girdiniz.");
        sifreAlani.setText("");
    }
    }
    else if ("Personel".equals(adminSec.getValue())) {
        if (parola.equals(personel)) {
         try {
                switchTopersonelgiris();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
         else if (parola.equals("")) {
            tf_bilgilendirme.setText("Lütfen bir şifre giriniz.");
        }
    else{
    tf_bilgilendirme.setText("Yanlış Şifre Girdiniz.");
    sifreAlani.setText("");
    }
    }
    else{
        tf_bilgilendirme.setText("Lütfen Personel Seçiniz.");
    }
    }

    @FXML
    private void kapatma(MouseEvent event) {
        System.exit(0);
    }
    }

