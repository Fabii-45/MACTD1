public class Chat extends Animal{

    private String nom;

    public Chat() {}

    public String getNom() {
        return nom;
    }

    @Override
    public void fabriquer() {
        System.out.println("Chat fabriqué");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
