package modele;

public class Pommier extends AbstractArbreFruitier {

    private int taille;
    private String type;

    public Pommier( String type,int taille) {
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
