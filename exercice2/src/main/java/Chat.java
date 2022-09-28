public class Chat extends Animal{

    private String nom;

    public Chat(String nom) {
        this.nom=nom;
    }

    public String getNom() {
        return nom;
    }

    @Override
    public void fabriquer() {
        System.out.println("Chat fabriqué");
    }

    @Override
    public Chat clone() {
        return new Chat(getNom());
    }
}
