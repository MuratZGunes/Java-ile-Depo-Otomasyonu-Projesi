package com.mycompany.sonproje3;

public class bayi {
    private String bayiid;
    private String firmaismi;
    private String yetkiliadsoyad;
    private String adres;
    private String telefon;
    private String eposta;

    @Override
    public String toString() {
        return bayiid+","+firmaismi+","+yetkiliadsoyad+","+adres+","+telefon+","+eposta;
    }

    public bayi(String bayiid, String firmaismi, String yetkiliadsoyad, String adres, String telefon, String eposta) {
        this.bayiid = bayiid;
        this.firmaismi = firmaismi;
        this.yetkiliadsoyad = yetkiliadsoyad;
        this.adres = adres;
        this.telefon = telefon;
        this.eposta = eposta;
    }

    public String getBayiid() {
        return bayiid;
    }

    public void setBayiid(String bayiid) {
        this.bayiid = bayiid;
    }

    public String getFirmaismi() {
        return firmaismi;
    }

    public void setFirmaismi(String firmaismi) {
        this.firmaismi = firmaismi;
    }

    public String getYetkiliadsoyad() {
        return yetkiliadsoyad;
    }

    public void setYetkiliadsoyad(String yetkiliadsoyad) {
        this.yetkiliadsoyad = yetkiliadsoyad;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getEposta() {
        return eposta;
    }

    public void setEposta(String eposta) {
        this.eposta = eposta;
    }
    
    
}
