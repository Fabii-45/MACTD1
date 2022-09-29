package modele;

public class Poire extends Fruit{

    private String type;

    public Poire(String type) {
        this.type = type;
    }

    @Override
    public String getType() {
        return this.type;
    }
}
