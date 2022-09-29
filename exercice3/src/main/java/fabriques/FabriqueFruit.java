package fabriques;

import modele.Fruit;
@FunctionalInterface
public interface FabriqueFruit {
    public Fruit creerFruit() throws Exception;
}
