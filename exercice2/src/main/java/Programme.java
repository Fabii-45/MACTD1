public class Programme {

    public static void main(String[] args) throws Exception {

        FabriqueAnimal fabrique = new FabriqueAnimalImpl();
        Animal chat = fabrique.creerAnimal("Chat");

        //Cast pour utiliser une méthode de Chien et pas uniquement d'Animal
        if(chat instanceof Chat)
            System.out.println(((Chat)chat).getNom());
    }
}
