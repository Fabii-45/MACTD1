public class PaiementCarte implements Paiement{

    private String numeroCarte;
    private String crypto;
    private String nom;
    private String date;

    public PaiementCarte(String numeroCarte, String crypto, String nom, String date) {
        this.numeroCarte = numeroCarte;
        this.crypto = crypto;
        this.nom = nom;
        this.date = date;
    }

    @Override
    public void payer(int montant) {
        System.out.println("Paiement de " + montant + "€ par " + nom + " CB " + numeroCarte + "/" + crypto + " expire:" + date);
    }
}
