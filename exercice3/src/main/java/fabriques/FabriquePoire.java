package fabriques;

import modele.Fruit;
import modele.Poire;

public class FabriquePoire implements FabriqueFruit{

    private String type;

    public FabriquePoire(String type) {
        this.type = type;
    }

    @Override
    public Fruit creerFruit() throws Exception {
        return new Poire(type);
    }
}
