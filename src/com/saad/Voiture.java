package com.saad;

public class Voiture extends Vehicule{
    private String couleur;
    private int nb_chevaux;


    public Voiture(String marque, String couleur, int nb_chevauxV,int tarif_ref) {
        super(marque,tarif_ref);
        this.couleur = couleur;
        this.nb_chevaux=nb_chevauxV;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public int getNb_chevaux() {
        return nb_chevaux;
    }

    public void setNb_chevaux(int nb_chevaux) {
        this.nb_chevaux = nb_chevaux;
    }

}
