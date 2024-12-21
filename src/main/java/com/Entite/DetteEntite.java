package Entite;

import java.util.List;

public class DetteEntite {
    private int id;
    private String date;
    private double montant;
    private double montantVerse;
    private double montantRestant;
    private List<ArticleEntite> articles;
    private List<PaiementEntite> paiements;
    private ClientEntite client;
    private String etat; // En Cours, Annuler

    // Constructeurs
    public void Dette(int id, String date, double montant, double montantVerse, double montantRestant, List<Article> articles, List<Paiement> paiements, Client client, String etat) {
        this.id = id;
        this.date = date;
        this.montant = montant;
        this.montantVerse = montantVerse;
        this.montantRestant = montantRestant;
        this.articles = articles;
        this.paiements = paiements;
        this.client = client;
        this.etat = etat;
    }

    // Getters et Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }

    public double getMontant() { return montant; }
    public void setMontant(double montant) { this.montant = montant; }

    public double getMontantVerse() { return montantVerse; }
    public void setMontantVerse(double montantVerse) { this.montantVerse = montantVerse; }

    public double getMontantRestant() { return montantRestant; }
    public void setMontantRestant(double montantRestant) { this.montantRestant = montantRestant; }

    public List<ArticleEntite> getArticles() { return articles; }
    public void setArticles(List<ArticleEntite> articles) { this.articles = articles; }

    public List<PaiementEntite> getPaiements() { return paiements; }
    public void setPaiements(List<PaiementEntite> paiements) { this.paiements = paiements; }

    public ClientEntite getClient() { return client; }
    public void setClient(ClientEntite client) { this.client = client; }

    public String getEtat() { return etat; }
    public void setEtat(String etat) { this.etat = etat; }
}