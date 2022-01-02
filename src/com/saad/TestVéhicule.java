package com.saad;

import java.util.LinkedList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestVéhicule {

    public static void main(String[] args) {
        LinkedList<Voiture> tabV = new LinkedList<Voiture>();
        LinkedList<Camion> tabC = new LinkedList<Camion>();
        LinkedList<Vehicule> tab= new LinkedList<Vehicule>();

        Camion c1=new Camion("DAF",50,25);
        tabC.add(c1);
        Camion c2=new Camion("Volvo",50,30);
        tabC.add(c2);

        Voiture v1=new Voiture("BMW","blanche",280,50);
        tabV.add(v1);
        Voiture v2=new Voiture("Audi","grise",370,50);
        tabV.add(v2);
        for (Vehicule i:tabC){
            tab.add(i);
        }
        for (Vehicule j:tabV){
            tab.add(j);
        }
        int duree=5;
        System.out.println("le prix de location de la voiture Audi:"+v2.getNb_chevaux()*duree+"$" );

        for (Vehicule i: tab){
            Object type=i.getClass();
            if (type.toString().equals("class com.saad.Camion") ){
                Camion j;
                j=(Camion)i;

                System.out.println("je suis une camion de marque "+j.getMarque()+".Ma capacité est de "+j.getCapacite()+"mètre cube.");
            }
            if (type.toString().equals("class com.saad.Voiture") ){
                Voiture k;
                k=(Voiture)i;

                System.out.println("je suis une voiture de marque "+k.getMarque()+" .Ma couleur est "+k.getCouleur()+".");            }


        }

        /*
        for (Camion i:tabC){
            System.out.println("je suis une camion de marque "+i.getMarque()+".Ma capacité est de "+i.getCapacite()+"mètre cube.");
        }
        for (Voiture j:tabV){
            System.out.println("je suis une voiture de marque "+j.getMarque()+" .Ma couleur est "+j.getCouleur()+".");
        }
        int capacitéTotale=0;
        for (Voiture k:tabV){
            capacitéTotale+=k.getNb_chevaux();
        }
        System.out.println(capacitéTotale);

       //LinkedList tab= (LinkedList) Stream.concat(tabC.stream(),tabV.stream()).collect(Collectors.toList());
        //System.out.print("tab = " + tab);;*/


    }
}