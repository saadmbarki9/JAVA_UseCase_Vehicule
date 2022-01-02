package com.saad;

public class Camion extends Vehicule {
    private  int capacite;

    public Camion(String marque, int tarif_ref, int capacite) {
        super(marque, tarif_ref);
        this.capacite = capacite;
    }

    public int getCapacite() {
        return capacite;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

    @Override
    public double calculerPrix(int j) {

        return j*this.getTarif_ref()*1/2;
    }
}
