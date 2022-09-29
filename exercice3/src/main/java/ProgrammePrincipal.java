import modele.Hobbit;
import fabriques.*;
import modele.AbstractArbreFruitier;
import modele.Fruit;

public class ProgrammePrincipal {

    // https://www.codingame.com/playgrounds/36103/design-pattern-factory-abstract-factory/exemple-abstract-factory


    public static void main(String[] args) throws Exception {
        Fruit pomme = MaFabriqueFruit.getFruit(new FabriquePomme("GOLDEN"));
        Fruit poire = MaFabriqueFruit.getFruit(new FabriquePoire("WILLIAM"));
        AbstractArbreFruitier pommier1 = MaFabriqueArbreFruitier.getArbreFruitier(new FabriquePommier("pommier",5));
        AbstractArbreFruitier pommier2 = MaFabriqueArbreFruitier.getArbreFruitier(new FabriquePommier("pommier",15));
        AbstractArbreFruitier poirier1 = MaFabriqueArbreFruitier.getArbreFruitier(new FabriquePoirier("poirier",8));
        AbstractArbreFruitier poirier2 = MaFabriqueArbreFruitier.getArbreFruitier(new FabriquePoirier("poirier",20));
        Hobbit maraudeur = new Hobbit("Francis");
        Hobbit maraudeur2 = new Hobbit("Lil");

        maraudeur.mange(pommier1.cueille());
        System.out.println("d'un "+pommier1);

        maraudeur.mange(poirier2.cueille());
        System.out.println("d'un "+poirier2);

        maraudeur2.mange(poirier1.cueille());
        System.out.println("d'un "+poirier1);

        maraudeur2.mange(pommier2.cueille());
        System.out.println("d'un "+pommier2);
    }
}
