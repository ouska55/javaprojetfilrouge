package Entite;

public class ClientEntite {
    private int id;
    private String surname;
    private String telephone;
    private String adresse;
    private UtilisateurEntite compte;

    // Constructeurs
    public void Client(int id, String surname, String telephone, String adresse, UtilisateurEntite compte) {
        this.id = id;
        this.surname = surname;
        this.telephone = telephone;
        this.adresse = adresse;
        this.compte = compte;
    }

    // Getters et Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getSurname() { return surname; }
    public void setSurname(String surname) { this.surname = surname; }

    public String getTelephone() { return telephone; }
    public void setTelephone(String telephone) { this.telephone = telephone; }

    public String getAdresse() { return adresse; }
    public void setAdresse(String adresse) { this.adresse = adresse; }

    public UtilisateurEntite getCompte() { return compte; }
    public void setCompte(UtilisateurEntite compte) { this.compte = compte; }
}
