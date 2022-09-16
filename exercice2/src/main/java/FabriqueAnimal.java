public class FabriqueAnimal{

    public static Animal getAnimal(String animal){
        if("Chat".equalsIgnoreCase(animal)) return new Chat();
        else if("Chien".equalsIgnoreCase(animal)) return new Chien();
        return null;
    }
}
