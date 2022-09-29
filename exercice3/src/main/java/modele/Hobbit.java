package modele;

import appliV1.Fruit;

public class Hobbit {

    private String nom;

    public Hobbit(String nom) {
        this.nom = nom;
    }


    public void mange(Fruit cueille) {
        System.out.println(this.nom+ " mange "+cueille.toString());
    }
}
