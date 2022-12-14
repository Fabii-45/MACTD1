import java.util.ArrayList;
import java.util.List;

public class Panier {
    List<Corrige> corriges;
    public Panier(){
        this.corriges = new ArrayList<Corrige>();
    }
    public void addItem(Corrige corrige){
        this.corriges.add(corrige);
    }
    public void removeItem(Corrige corrige){
        this.corriges.remove(corrige);
    }
    public int calculerTotal(){
        int sum = 0;
        for(Corrige corrige : corriges){
            sum += corrige.getPrix();
        }
        return sum;
    }

    public void payer(Paiement methodePaiement){
        int montant = this.calculerTotal();
        methodePaiement.payer(montant);
    }
}
