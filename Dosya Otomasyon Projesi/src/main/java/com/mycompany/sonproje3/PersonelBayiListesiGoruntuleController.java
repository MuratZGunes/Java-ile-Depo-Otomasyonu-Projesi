/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.sonproje3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author murat
 */
public class PersonelBayiListesiGoruntuleController implements Initializable {

    @FXML
    private TableView<bayi> urunTablosu;
    @FXML
    private TableColumn<bayi,String> bayiid;
    @FXML
    private TableColumn<bayi,String> firmaismi;
    @FXML
    private TableColumn<bayi,String> yetkiliadsoyad;
    @FXML
    private TableColumn<bayi,String> adres;
    @FXML
    private TableColumn<bayi,String> telefon;
    @FXML
    private TableColumn<bayi,String> eposta;
    
    ObservableList<bayi> veriler;
    @FXML
    private ImageView personeluruntablosu;
    @FXML
    private ImageView kapatma;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        veriler=FXCollections.observableArrayList();
        
        bayiid.setCellValueFactory(new PropertyValueFactory<>("bayiid"));
        firmaismi.setCellValueFactory(new PropertyValueFactory<>("firmaismi"));
        yetkiliadsoyad.setCellValueFactory(new PropertyValueFactory<>("yetkiliadsoyad"));
        adres.setCellValueFactory(new PropertyValueFactory<>("adres"));
        telefon.setCellValueFactory(new PropertyValueFactory<>("telefon"));
        eposta.setCellValueFactory(new PropertyValueFactory<>("eposta"));
        
        urunTablosu.setItems(veriler);
         try {
      BufferedReader bufferedReader = new BufferedReader(new FileReader("BayiurunIslemleri.txt"));
      String line;
      ObservableList<bayi> data2 = FXCollections.observableArrayList();

      while ((line = bufferedReader.readLine()) != null) {
     String[] values = line.split(",");
     bayi teblo=new bayi(values[0],values[1], values[2], values[3],values[4],values[5]);
     data2.add(teblo);
     }
     urunTablosu.getItems().addAll(data2);

         bufferedReader.close();
     } catch (IOException ex) {
     ex.printStackTrace();
      } 
        
      } 

    private void switchTopersonelurunlistesi() throws IOException{
        App.setRoot("personelUrunListesiDuzenle");
    }
    @FXML
    private void personeluruntablosu(MouseEvent event) {
        try {
            switchTopersonelurunlistesi();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @FXML
    private void kapatma(MouseEvent event) {
        System.exit(0);
    }

    }    
    

