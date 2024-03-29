package com.example.chat.Model;

public class Kullanici {
    private String kullaniciIsmi,kullaniciEmail,kullaniciId,kullaniciProfil;

    public Kullanici(String kullaniciIsmi, String kullaniciEmail,String kullaniciId,String kullaniciProfil) {
        this.kullaniciIsmi = kullaniciIsmi;
        this.kullaniciEmail = kullaniciEmail;
        this.kullaniciId = kullaniciId;
        this.kullaniciProfil=kullaniciProfil;
    }

    public Kullanici() {
    }

    public String getKullaniciProfil() {
        return kullaniciProfil;
    }

    public void setKullaniciProfil(String kullaniciProfil) {
        this.kullaniciProfil = kullaniciProfil;
    }

    public String getKullaniciIsmi() {
        return kullaniciIsmi;
    }

    public void setKullaniciIsmi(String kullaniciIsmi) {
        this.kullaniciIsmi = kullaniciIsmi;
    }

    public String getKullaniciEmail() {
        return kullaniciEmail;
    }

    public void setKullaniciEmail(String kullaniciEmail) {
        this.kullaniciEmail = kullaniciEmail;
    }

    public String getKullaniciId() {
        return kullaniciId;
    }

    public void setKullaniciId(String kullaniciId) {
        this.kullaniciId = kullaniciId;
    }
}
