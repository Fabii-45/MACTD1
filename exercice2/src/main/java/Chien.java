public class Chien extends Animal{

    String nom;

    public Chien() {}

    public String getNom() {
        return nom;
    }

    @Override
    public void fabriquer() {
        System.out.println("Chien fabriqué");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
