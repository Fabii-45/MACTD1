import java.util.Objects;

public class FabriqueAnimalImpl implements FabriqueAnimal{

    Chien chien = new Chien();
    Chat chat = new Chat();
    @Override
    public Object creerAnimal(String animal) throws CloneNotSupportedException {
        Object animalCree = switch(animal){
            case"Chat"->chien.clone();
            case"Chien"->chat.clone();
            default->throw new RuntimeException("Animal inconnu");
        };
        return animalCree;
    }
}
