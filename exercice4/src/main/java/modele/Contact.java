package modele;

public class Contact {
    public enum SocialNetwork {
        FACEBOOK,
        LINKED,
        TWITTER,
        INSTAGRAM
    };
    SocialNetwork reseau;
    String idContactReseau;
    public Contact(SocialNetwork sn, String id) {
        this.reseau = sn;
        this.idContactReseau = id;
    }

    public SocialNetwork getReseau() {
        return reseau;
    }

    public void setReseau(SocialNetwork reseau) {
        this.reseau = reseau;
    }

    public String getIdContactReseau() {
        return idContactReseau;
    }

    public void setIdContactReseau(String idContactReseau) {
        this.idContactReseau = idContactReseau;
    }

    public String toString() {
        return "Réseau : "+this.reseau+" | id : "+this.idContactReseau;
    }
}