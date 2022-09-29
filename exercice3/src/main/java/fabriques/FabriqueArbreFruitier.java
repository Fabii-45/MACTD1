package fabriques;

import modele.AbstractArbreFruitier;

@FunctionalInterface
public interface FabriqueArbreFruitier {
    public AbstractArbreFruitier creerArbreFruitier() throws Exception;
}
