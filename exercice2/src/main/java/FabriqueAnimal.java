@FunctionalInterface
public interface FabriqueAnimal {
    Animal creerAnimal(String animal) throws Exception;
}
