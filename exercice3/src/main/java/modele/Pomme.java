package modele;

public class Pomme extends Fruit{

    private String type;

    public Pomme(String type) {
        this.type = type;
    }

    @Override
    public String getType() {
        return this.type;
    }
}
