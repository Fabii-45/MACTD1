package appliV1;

public class Programme {
    public static void main(String[] args) {
        ArbreFruitier pommier = new ArbreFruitier("pommier");
        ArbreFruitier poirier = new ArbreFruitier("poirier");
        Hobbit maraudeur = new Hobbit("Merry");
        maraudeur.mange(pommier.cueille());
        maraudeur.mange(poirier.cueille());
    }
}