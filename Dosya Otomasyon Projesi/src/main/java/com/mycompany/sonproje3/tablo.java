/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sonproje3;

/**
 *
 * @author murat
 */
public class tablo {
    private String urunIsmi;
    private String kategori;
    private int fiyat;
    private int BayiID;

    @Override
    public String toString(){
        return urunIsmi+","+kategori+","+fiyat+","+BayiID;
    }
    public tablo(String urunIsmi, String kategori, int fiyat, int BayiID) {
        this.urunIsmi = urunIsmi;
        this.kategori = kategori;
        this.fiyat = fiyat;
        this.BayiID = BayiID;
    }

    public String getUrunIsmi() {
        return urunIsmi;
    }

    public void setUrunIsmi(String urunIsmi) {
        this.urunIsmi = urunIsmi;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public int getFiyat() {
        return fiyat;
    }

    public void setFiyat(int fiyat) {
        this.fiyat = fiyat;
    }

    public int getBayiID() {
        return BayiID;
    }

    public void setBayiID(int BayiID) {
        this.BayiID = BayiID;
    }
    

    
}