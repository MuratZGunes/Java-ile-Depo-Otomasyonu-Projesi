/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.sonproje3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.NoSuchElementException;
import java.util.Observable;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
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
public class UrunIslemleriController implements Initializable,tablokontrol {


    @FXML
    private TextField tf_urunIsmi;
    @FXML
    private TextField tf_fiyat;
    @FXML
    private TextField tf_bayiid;
    @FXML
    private Button ekleButonu;
    @FXML
    private Button guncelleButonu;
    @FXML
    private Button silButonu;
    @FXML
    private ComboBox<String> cb_kategori;
    @FXML
    private Label mesajYazisi;
    @FXML
    private TableView<tablo> urunTablosu;
    @FXML
    private TableColumn<tablo, String> urunIsmi;
    @FXML
    private TableColumn<tablo, String> Kategori;
    @FXML
    private TableColumn<tablo, Integer> Fiyat;
    @FXML
    private TableColumn<tablo, Integer > BayiID;

    ObservableList<tablo> veriler;
    @FXML
    private Button urunGetir;
    @FXML
    private Button load;
    @FXML
    private Label dmesajYazisi;
    @FXML
    private ImageView geriDon;
    @FXML
    private ImageView kapat;
    @FXML
    private ImageView adminbayigoruntule;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        cb_kategori.setItems(FXCollections.observableArrayList("Elektronik","Ev Yaşam Kırtasiye","Spor Outdoor","Pet Shop","Oto Bahçe Yapı","Kozmetik Bakım"));
        
        veriler=FXCollections.observableArrayList();
        
        urunIsmi.setCellValueFactory(new PropertyValueFactory<>("UrunIsmi"));
        Kategori.setCellValueFactory(new PropertyValueFactory<>("Kategori"));
        Fiyat.setCellValueFactory(new PropertyValueFactory<>("Fiyat"));
        BayiID.setCellValueFactory(new PropertyValueFactory<>("BayiID"));
        
        urunTablosu.setItems(veriler);
        
        
        
         try {
    BufferedReader bufferedReader = new BufferedReader(new FileReader("urunIslemleri.txt"));
    String line;
    ObservableList<tablo> data2 = FXCollections.observableArrayList();

    while ((line = bufferedReader.readLine()) != null) {
    String[] values = line.split(",");
    tablo teblo=new tablo(values[0],values[1], Integer.parseInt(values[2]), Integer.parseInt(values[3]));
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
        mesajYazisi.setText("");
        dmesajYazisi.setText("");
        
       
       try {
        if (tf_urunIsmi.getText().trim().equals("")) {
            mesajYazisi.setText("Ürün ismi boş bırakılamaz.");
        }
        else if (tf_fiyat.getText().trim().equals("")) {
            mesajYazisi.setText("Fiyat boş bırakılamaz.");
        }
        else if (tf_bayiid.getText().trim().equals("")) {
            mesajYazisi.setText("Bayi ID boş bırakılamaz.");
        }
         
        else if (cb_kategori.getValue().trim().equals("Kategori Seciniz")) {
            mesajYazisi.setText("Kategori seçiniz.");
        }
        
        else{
        veriler=FXCollections.observableArrayList();
        veriler.add(new tablo(tf_urunIsmi.getText(),cb_kategori.getValue(), Integer.valueOf(tf_fiyat.getText()), Integer.valueOf(tf_bayiid.getText())));
        urunTablosu.getItems().addAll(veriler);
        dmesajYazisi.setText("Ürün başarıyla eklendi.");
                }
        } catch (java.lang.NullPointerException e) {
             mesajYazisi.setText("Kategori Seciniz");
        } catch (java.lang.NumberFormatException e) {
            mesajYazisi.setText("Fiyat ve Bayi ID'ye sadece Sayı girilebilir..");
        
    }

    }

    @FXML
    public void urunGuncelle(ActionEvent event) {
        dmesajYazisi.setText("");
        mesajYazisi.setText("");
        if (tf_urunIsmi.getText().trim().equals("")) {
            mesajYazisi.setText("Ürün ismi boş bırakılamaz.");
        }
        else if (tf_fiyat.getText().trim().equals("")) {
            mesajYazisi.setText("Fiyat boş bırakılamaz.");
        }
        else if (tf_bayiid.getText().trim().equals("")) {
            mesajYazisi.setText("Bayi ID boş bırakılamaz.");
        }
         
        else if (cb_kategori.getValue().trim().equals("Kategori Seciniz")) {
            mesajYazisi.setText("Kategori seçiniz.");
        }
        else{
        try {
            
        
        tablo teblo=new tablo("","",0,0);
        if (urunTablosu.getSelectionModel().getSelectedIndex()!=-1) {
            teblo=(tablo) urunTablosu.getItems().get(urunTablosu.getSelectionModel().getSelectedIndex());
            tablo kk=new tablo(tf_urunIsmi.getText(),cb_kategori.getValue(),Integer.parseInt(tf_fiyat.getText()),Integer.parseInt(tf_bayiid.getText()));
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
    public void urunGetir(ActionEvent event) {
        dmesajYazisi.setText("");
        mesajYazisi.setText("");
        tablo teblo=new tablo("","",0,0);
        if (urunTablosu.getSelectionModel().getSelectedIndex()!=-1) {
            teblo=(tablo) urunTablosu.getItems().get(urunTablosu.getSelectionModel().getSelectedIndex());
            tf_urunIsmi.setText(teblo.getUrunIsmi());
            cb_kategori.setValue(teblo.getKategori());
            tf_fiyat.setText(String.valueOf(teblo.getFiyat()));
            tf_bayiid.setText(String.valueOf( teblo.getBayiID()));
        }
        else{
            mesajYazisi.setText("Herhangi bir kayıt seçilmedi.");
        }
    }
    @FXML
    public void UrunuSil(ActionEvent event) {
        try {
        dmesajYazisi.setText("");
        mesajYazisi.setText("");
        ObservableList<tablo> secilenKayit, tumKayitlar;
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
    public void load(ActionEvent event) {
        dmesajYazisi.setText("");
        mesajYazisi.setText("");
    ObservableList<tablo> data = urunTablosu.getItems();
    FileWriter fileWriter;
        try {
    fileWriter = new FileWriter("urunIslemleri.txt");
        
    BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

    for (tablo row : data) {
    bufferedWriter.write(row.toString());
    
    bufferedWriter.newLine();

    }
            dmesajYazisi.setText("Tablo Başarıyla Kaydedildi");
            bufferedWriter.close();

    } catch (IOException ex) {
        }

    }

    private void switchTobayiUrunIsleri() throws IOException{
        App.setRoot("bayiUrunIslemleri");
    }
    private void switchToadmingiris() throws IOException{
        App.setRoot("admingiris");
    }

    @FXML
    private void geriDon(MouseEvent event) {
        try {
            switchToadmingiris();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @FXML
    private void kapat(MouseEvent event) {
        System.exit(0);
    }

    @FXML
    private void adminbayigoruntule(MouseEvent event) {
        try {
            switchTobayiUrunIsleri();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    


}
