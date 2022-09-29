package fabriques;

import modele.AbstractArbreFruitier;
import modele.Poirier;
import modele.Pommier;

public class FabriquePommier implements FabriqueArbreFruitier{

    private String type;
    private int taille;

    public FabriquePommier(String type, int taille) {
        this.type = type;
        this.taille = taille;
    }

    @Override
    public AbstractArbreFruitier creerArbreFruitier() throws Exception {
        return new Poirier(type, taille);
    }
}
