public class Programme {

    public static void main(String[] args) {
        Corrige article1 = new Corrige("Livre : 'Tout savoir sur le pattern Strategy'",25);
        Corrige article2 = new Corrige("Piano steinway & sons d274",155690);
        Panier panier1 = new Panier();
        panier1.addItem(article1);
        panier1.addItem(article2);

        article1.payer(new PaiementPaypal("JeanDup45", "Dup45"));

        article2.payer(new PaiementCarte( "1234567890123456", "786", "Jean", "04/23"));

        panier1.payer(new PaiementPaypal("Jean", "Dup45"));

        panier1.payer(new PaiementCarte( "1234567890123456", "786", "Jean", "04/23"));


    }
}
