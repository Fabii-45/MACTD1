package builder;

import modele.Contact;
import modele.Personne;

import java.util.Collection;

public class PersonneBuilder {

    private Personne personneEnConstruction;

    public PersonneBuilder(String nom, String prenom) {
        this.personneEnConstruction = personneEnConstruction.creerPersonne(nom, prenom);
    }

    //Appelle de la méthode quand on a fini de construire notre personne
    public Personne getPersonneConstruite() {
        return personneEnConstruction;
    }

    public PersonneBuilder ajouterMail(String email) {
        personneEnConstruction.setEmail(email);
        return this;
    }

    public PersonneBuilder ajouterVille(String ville) {
        personneEnConstruction.setVille(ville);
        return this;
    }

    public PersonneBuilder ajouterAdresse(String adresse) {
        personneEnConstruction.setAdresse(adresse);
        return this;
    }

    public PersonneBuilder ajouterNumeroTel(String tel) {
        personneEnConstruction.setNumeroTelephone(tel);
        return this;
    }

    public PersonneBuilder definirContact(Collection<Contact> reseaux) {
        personneEnConstruction.setContacts(reseaux);
        return this;
    }

    public PersonneBuilder ajouterContact(Contact reseau) {
        personneEnConstruction.addContact(reseau);
        return this;
    }

    public String toString() {
        return personneEnConstruction.toString();
    }

}