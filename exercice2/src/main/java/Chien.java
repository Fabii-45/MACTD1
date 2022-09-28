public class Chien extends Animal{

    String nom;

    public Chien(String nom) {
        this.nom=nom;
    }

    public String getNom() {
        return nom;
    }

    @Override
    public void fabriquer() {
        System.out.println("Chien fabriqué");
    }

    @Override
    public Chien clone() {
        return new Chien(getNom());
    }
}
