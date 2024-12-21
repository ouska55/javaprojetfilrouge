package Service;

public class ArticleService {
    public Article creerArticle(String nom, int quantiteStock) {
        return new Article(0, nom, quantiteStock);
    }

    public void mettreAJourStock(Article article, int nouvelleQuantite) {
        article.setQuantiteStock(nouvelleQuantite);
    }
}
