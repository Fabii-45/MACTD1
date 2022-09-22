public class Programme {

    public static void main(String[] args) throws CloneNotSupportedException {

        FabriqueAnimal fabrique = new FabriqueAnimalImpl();
        Animal chien = (Animal) fabrique.creerAnimal("Chien");
        Animal chat = (Animal) fabrique.creerAnimal("Chat");
        Animal chien2 = (Animal) fabrique.creerAnimal("Chien");

        //Cast pour utiliser une méthodes de Chien et pas uniquement d'Animal
        if(chien instanceof Chien) {
            System.out.println(((Chien) chien).getNom());
        } else {
            System.out.println("C'est pas un chien");
        }
        System.out.println(chat);
        System.out.println(chien2);
    }
}
