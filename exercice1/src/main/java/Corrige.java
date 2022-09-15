public class Corrige {

    private String nom;
    private int prix;

    public Corrige(String nom, int prix) {
        this.nom = nom;
        this.prix = prix;
    }

    public String getNom() {
        return nom;
    }

    public int getPrix() {
        return prix;
    }

    public void payer(Paiement methodePaiement){
        int montant = this.getPrix();
        methodePaiement.payer(montant);
    }
}
