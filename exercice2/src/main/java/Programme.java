public class Programme {

    public static void main(String[] args) {
        Animal chien = FabriqueAnimal.getAnimal("Chien");
        Animal chat = FabriqueAnimal.getAnimal("Chat");

        System.out.println("Chien fabriqué !");
        System.out.println("Chat fabriqué !");
    }
}
