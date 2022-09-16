public class FabriqueDemandeur {

    public static Fabrique getFabrique(String choix){
        if("Animal".equalsIgnoreCase(choix)){
            return new FabriqueAnimal();
        }
        return null;
    }
}
