public class PaiementPaypal implements Paiement {

    private String id;
    private String password;

    public PaiementPaypal(String id, String password) {
        this.password = password;
        this.id = id;
    }

    @Override
    public void payer(int montant) {
        System.out.println(montant+ "€ ont été payés avec Paypal.");
    }
}
