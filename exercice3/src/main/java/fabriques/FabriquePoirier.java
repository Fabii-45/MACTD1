package fabriques;

import modele.AbstractArbreFruitier;
import modele.Poirier;

public class FabriquePoirier implements FabriqueArbreFruitier{

    private String type;
    private int taille;

    public FabriquePoirier(String type, int taille) {
        this.type = type;
        this.taille = taille;
    }

    @Override
    public AbstractArbreFruitier creerArbreFruitier() throws Exception {
        return new Poirier(type, taille);
    }


}
