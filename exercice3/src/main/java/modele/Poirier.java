package modele;

public class Poirier extends AbstractArbreFruitier {

    private int taille;
    private String type;

    public Poirier(String type, int taille) {
        this.taille = taille;
        this.type = type;
    }

    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public int getTaille() {
        return this.taille;
    }
}
