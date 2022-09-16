public class FabriqueAnimal implements Fabrique{

    public Animal getAnimal(String animal){
        if("Chat".equalsIgnoreCase(animal)) return new Chat();
        else if("Chien".equalsIgnoreCase(animal)) return new Chien();
        return null;
    }
}
