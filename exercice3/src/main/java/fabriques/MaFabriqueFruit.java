package fabriques;

import modele.Fruit;

public class MaFabriqueFruit {
    public static Fruit getFruit(FabriqueFruit factory) throws Exception {
        return factory.creerFruit();
    }
}
