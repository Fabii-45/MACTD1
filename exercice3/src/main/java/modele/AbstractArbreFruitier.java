package modele;

import appliV1.Fruit;

public abstract class AbstractArbreFruitier {

    public abstract String getType();
    public abstract int getTaille();

    public Fruit cueille() throws Exception{
        if (this.getType().equals("pommier")) {
            return new Fruit("pomme");
        } else if (this.getType().equals("poirier")) {
            return new Fruit("poire");
        } else {
            throw new Exception("Quel est donc cet arbre ?");
        }
    }

    @Override
    public String toString() {
        return this.getType()+" d'une taille de "+this.getTaille()+" mètres !";
    }
}
