package Entite;

public class ArticleEntite {
    private int id;
    private String nom;
    private int quantiteStock;

    public void Article(int id, String nom, int quantiteStock) {
        this.id = id;
        this.nom = nom;
        this.quantiteStock = quantiteStock;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }

    public int getQuantiteStock() { return quantiteStock; }
    public void setQuantiteStock(int quantiteStock) { this.quantiteStock = quantiteStock; }
}
