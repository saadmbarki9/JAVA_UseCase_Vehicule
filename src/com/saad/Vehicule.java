package com.saad;

public class Vehicule {
    private String marque;
    private int tarif_ref = 50;


    public Vehicule(String marque, int tarif_ref) {
        this.marque = marque;
        this.tarif_ref = tarif_ref;

    }

    public void afficherDescription(){

    }

    public double calculerPrix(int j) {

        return j*tarif_ref;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public int getTarif_ref() {
        return tarif_ref;
    }

    public void setTarif_ref(int tarif_ref) {
        this.tarif_ref = tarif_ref;
    }
}
