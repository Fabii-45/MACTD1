import java.util.Objects;

public class FabriqueAnimalImpl implements FabriqueAnimal{

    private Chien chien = new Chien("Yeti");
    private Chat chat = new Chat("Youpi");

    @Override
    public Animal creerAnimal(String animal) throws Exception {
        Animal a;
        switch (animal) {
            case "Chien": {
                a = chien.clone();
                break;
            }
            case "Chat": {
                a = chat.clone();
                break;
            }
            default: {
                throw new Exception("Pas d'animal de ce type existant !");
            }
        }
        return a;
    }
}
