package modele;

public abstract class Fruit {

    public abstract String getType();



    @Override
    public String toString() {
        return this.getType();
    }
}
