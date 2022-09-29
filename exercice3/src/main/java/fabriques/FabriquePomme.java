package fabriques;

import modele.Fruit;
import modele.Pomme;

public class FabriquePomme implements FabriqueFruit{

    private String type;

    public FabriquePomme(String type) {
        this.type = type;
    }

    @Override
    public Fruit creerFruit() throws Exception {
        return new Pomme(type);
    }

}
