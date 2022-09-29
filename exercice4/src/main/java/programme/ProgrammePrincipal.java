package programme;

import builder.PersonneBuilder;
import modele.Contact;

public class ProgrammePrincipal {

    public static void main(String[] args) {

        PersonneBuilder personneBuilder = new PersonneBuilder("ATTE", "Fabien");

        personneBuilder.ajouterNumeroTel("06 06 06 06 06")
                .ajouterMail("fabi.fabi@fabi.fabi")
                .ajouterContact(new Contact(Contact.SocialNetwork.LINKED, "fabii"))
                .ajouterContact(new Contact(Contact.SocialNetwork.FACEBOOK, "fabii"))
                .getPersonneConstruite()
                .toString();

        System.out.println(personneBuilder);

    }
}


