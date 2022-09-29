package appliV1;

public class ArbreFruitier {
    private String type;

    public ArbreFruitier(String type) {
        this.type = type;
    }

    public Fruit cueille() {
        if (this.type.equals("pommier")) {
            return new Fruit("pomme");
        } else if (this.type.equals("poirier")) {
            return new Fruit("poire");
        } else {
            return null;
        }
    }

    public String toString() {
        return this.type;
    }
}