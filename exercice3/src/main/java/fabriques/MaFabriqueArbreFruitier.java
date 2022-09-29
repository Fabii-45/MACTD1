package fabriques;

import modele.AbstractArbreFruitier;

public class MaFabriqueArbreFruitier {
    public static AbstractArbreFruitier getArbreFruitier(FabriqueArbreFruitier factory) throws Exception {
        return factory.creerArbreFruitier();
    }
}
