package com.titoubani.produit.Model;


/**
 */

public class Produit {
    String Title;
    String prixu;
    String prixmoy;
    String prixmax;
    public Produit(String title, String prixu, String prixmoy, String prixmax) {
        Title = title;
        this.prixu = prixu;
        this.prixmoy = prixmoy;
        this.prixmax = prixmax;
    }


    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getPrixu() {
        return prixu;
    }

    public void setPrixu(String prixu) {
        this.prixu = prixu;
    }

    public String getPrixmoy() {
        return prixmoy;
    }

    public void setPrixmoy(String prixmoy) {
        this.prixmoy = prixmoy;
    }

    public String getPrixmax() {
        return prixmax;
    }


    public void setPrixmax(String prixmax) {
        this.prixmax = prixmax;
    }
}
