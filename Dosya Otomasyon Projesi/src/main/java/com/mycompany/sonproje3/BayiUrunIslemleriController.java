/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.sonproje3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.NoSuchElementException;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author murat
 */
public class BayiUrunIslemleriController extends UrunIslemleriController implements Initializable,tablokontrol {

    @FXML
    private TextField tf_bayiid;
    @FXML
    private Button ekleButonu;
    @FXML
    private Button guncelleButonu;
    @FXML
    private Button silButonu;
    @FXML
    private Label mesajYazisi;
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
    private Button urunGetir;
    @FXML
    private Button load;
    @FXML
    private TextField tf_yetkiliadsoyad;
    @FXML
    private TextField tf_adres;
    @FXML
    private TextField tf_telefon;
    @FXML
    private TextField tf_eposta;
    @FXML
    private TextField tf_firmaismi;
    @FXML
    private Label dmesajYazisi;
    @FXML
    private ImageView urunIslemleri;
    @FXML
    private ImageView admingiris;
    @FXML
    private ImageView kapatma;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
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

    @FXML
    public void UrunEkle(ActionEvent event) {
        dmesajYazisi.setText("");
        mesajYazisi.setText("");
        
       
       try {
        if (tf_bayiid.getText().trim().equals("")) {
            mesajYazisi.setText("BayiID ismi boş bırakılamaz.");
        }
        else if (tf_firmaismi.getText().trim().equals("")) {
            mesajYazisi.setText("Firma İsmi boş bırakılamaz.");
        }
        else if (tf_yetkiliadsoyad.getText().trim().equals("")) {
            mesajYazisi.setText("Yetkili Ad Soyado ID boş bırakılamaz.");
        }
        else if (tf_adres.getText().trim().equals("")) {
            mesajYazisi.setText("Aders boş bırakılamaz.");
        }
        else if (tf_telefon.getText().trim().equals("")) {
            mesajYazisi.setText("Telefon Numarası boş bırakılamaz.");
        }
        else if (tf_eposta.getText().trim().equals("")) {
            mesajYazisi.setText("E-Posta boş bırakılamaz.");
        }
        
        
        else{
        veriler=FXCollections.observableArrayList();
        veriler.add(new bayi(tf_bayiid.getText(),tf_firmaismi.getText(),tf_yetkiliadsoyad.getText(),tf_adres.getText(),tf_telefon.getText(),tf_eposta.getText()));
        urunTablosu.getItems().addAll(veriler);
        dmesajYazisi.setText("Ürün başarıyla eklendi.");
                }
        } catch (java.lang.NullPointerException e) {
             mesajYazisi.setText("Kategori boş bırakılmaz.");
        } catch (java.lang.NumberFormatException e) {
            mesajYazisi.setText("Fiyat ve Bayi ID'ye sadece Sayı girilebilir..");
        
    }

    }

    @FXML
    public void urunGuncelle(ActionEvent event) {
        dmesajYazisi.setText("");
        mesajYazisi.setText("");
        if (tf_bayiid.getText().trim().equals("")) {
            mesajYazisi.setText("BayiID ismi boş bırakılamaz.");
        }
        else if (tf_firmaismi.getText().trim().equals("")) {
            mesajYazisi.setText("Firma İsmi boş bırakılamaz.");
        }
        else if (tf_yetkiliadsoyad.getText().trim().equals("")) {
            mesajYazisi.setText("Yetkili Ad Soyado ID boş bırakılamaz.");
        }
        else if (tf_adres.getText().trim().equals("")) {
            mesajYazisi.setText("Aders boş bırakılamaz.");
        }
        else if (tf_telefon.getText().trim().equals("")) {
            mesajYazisi.setText("Telefon Numarası boş bırakılamaz.");
        }
        else if (tf_eposta.getText().trim().equals("")) {
            mesajYazisi.setText("E-Posta boş bırakılamaz.");
        }
        else{
         try {
            
        
        bayi teblo=new bayi("", "", "", "", "", "");
        if (urunTablosu.getSelectionModel().getSelectedIndex()!=-1) {
            teblo=(bayi) urunTablosu.getItems().get(urunTablosu.getSelectionModel().getSelectedIndex());
            bayi kk=new bayi(tf_bayiid.getText(),tf_firmaismi.getText(),tf_yetkiliadsoyad.getText(),tf_adres.getText(),tf_telefon.getText(),tf_eposta.getText());
            int sira=urunTablosu.getSelectionModel().getSelectedIndex();
            urunTablosu.getItems().set(sira, kk);
        }
        else{
            mesajYazisi.setText("Herhangi bir kayıt seçilmedi.");
        }
        } catch (java.lang.NumberFormatException e) {
            mesajYazisi.setText("Silinen kayiti guncelleyemezsiniz.");
        }
    }
    }

    @FXML
    public void UrunuSil(ActionEvent event) {
        try {
        dmesajYazisi.setText("");
        mesajYazisi.setText("");
        ObservableList<bayi> secilenKayit, tumKayitlar;
        tumKayitlar=urunTablosu.getItems();
        secilenKayit=urunTablosu.getSelectionModel().getSelectedItems();
        if (tumKayitlar.isEmpty()) {
            mesajYazisi.setText("Silecek ürün kalmadı");
        }
        else if (secilenKayit.isEmpty()) {
            mesajYazisi.setText("Lütfen silecek ürün seçiniz.");
        }
        else{
        secilenKayit.forEach(tumKayitlar::remove);
        dmesajYazisi.setText("Seçilen ürün başarıyla silindi.");
        }
        } catch (IndexOutOfBoundsException e) {
               mesajYazisi.setText("Silecek ürün kalmadı");
        } catch (NoSuchElementException e) {
               mesajYazisi.setText("Silecek ürün kalmadı");
        }
    }

    @FXML
    public void urunGetir(ActionEvent event) {
        dmesajYazisi.setText("");
        mesajYazisi.setText("");
        bayi teblo=new bayi("", "", "", "", "", "");
        if (urunTablosu.getSelectionModel().getSelectedIndex()!=-1) {
            teblo=(bayi) urunTablosu.getItems().get(urunTablosu.getSelectionModel().getSelectedIndex());
            tf_bayiid.setText(teblo.getBayiid());
            tf_firmaismi.setText(teblo.getFirmaismi());
            tf_yetkiliadsoyad.setText(teblo.getYetkiliadsoyad());
            tf_adres.setText(teblo.getAdres());
            tf_telefon.setText(teblo.getTelefon());
            tf_eposta.setText(teblo.getEposta());
        }
        else{
            mesajYazisi.setText("Herhangi bir kayıt seçilmedi.");
        }
    }

    @FXML
    public void load(ActionEvent event) {
        dmesajYazisi.setText("");
        mesajYazisi.setText("");
    ObservableList<bayi> data = urunTablosu.getItems();
    FileWriter fileWriter;
        try {
    fileWriter = new FileWriter("BayiurunIslemleri.txt");
        
    BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

    for (bayi row : data) {
    bufferedWriter.write(row.toString());
    
    bufferedWriter.newLine();

    }
            dmesajYazisi.setText("Tablo Başarıyla Kaydedildi");
            bufferedWriter.close();

    } catch (IOException ex) {
        }
    }
    private void switchToadmingiris() throws IOException{
        App.setRoot("admingiris");
    }
    private void switchTourunislemleri() throws IOException{
        App.setRoot("UrunIslemleri");
    }

    @FXML
    private void urunIslemleri(MouseEvent event) {
        try {
            switchTourunislemleri();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @FXML
    private void admingiris(MouseEvent event) {
        try {
            switchToadmingiris();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @FXML
    private void kapatma(MouseEvent event) {
        System.exit(0);
    }

    
}
