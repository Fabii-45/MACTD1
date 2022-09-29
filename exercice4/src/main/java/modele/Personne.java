package modele;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

public class Personne {
    private String nom;
    private String prenom;
    private Optional<String> adresse = Optional.empty();
    private Optional<String> ville = Optional.empty();
    private Optional<String> email = Optional.empty();
    private Optional<String> numeroTelephone = Optional.empty();
    private Optional<Collection<Contact>> contacts = Optional.empty();

    //Constructeur privé pour forcer l'utilisateur de builder statique
    private Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public static Personne creerPersonne(String nom, String prenom) {
        //peut faire des verifs en plus que dans le constructeur, car si exception dans le constructeur
        //ça fou la merde
        return new Personne(nom, prenom);
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setAdresse(String adresse) {
        this.adresse = Optional.of(adresse);
    }

    public void setVille(String ville) {
        this.ville = Optional.of(ville);
    }

    public void setEmail(String email) {
        this.email = Optional.of(email);
    }

    public void setNumeroTelephone(String numeroTelephone) {
        this.numeroTelephone = Optional.of(numeroTelephone);
    }

    public void setContacts(Collection<Contact> contacts) {
        this.contacts = Optional.of(contacts);
    }

    public void addContact(Contact contact) {
        if(this.contacts.isEmpty())
            this.contacts = Optional.of(new ArrayList<>());
        this.contacts.get().add(contact);
    }

    public String toString() {
        String str =  "Nom : "+this.nom+" | Prénom : "+this.prenom;
        if(!adresse.isEmpty())
            str += " | Adresse : "+this.adresse.get();
        if(!ville.isEmpty())
            str += " | Ville : "+this.ville.get();
        if(!email.isEmpty())
            str += " | Email : "+this.email.get();
        if(!numeroTelephone.isEmpty())
            str += " | Numéro Téléphone : "+this.numeroTelephone.get();
        if (!contacts.isEmpty()) {
            for(Contact c : this.contacts.get()) {
                str += " | "+c.toString();
            }
        }
        return str;
    }
}