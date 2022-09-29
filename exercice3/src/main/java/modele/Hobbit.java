package modele;

import appliV1.Fruit;

public class Hobbit {

    private String nom;

    public Hobbit(String nom) {
        this.nom = nom;
    }


    public String mange(Fruit cueille) {
        return this.nom+ " mange "+cueille.toString();
    }
}
