package View;

import Entite.ArticleEntite;
import Service.ArticleService;

import java.util.Scanner;

public class ArticleView {
    private final ArticleService articleService;

    public ArticleView() {
        this.articleService = new ArticleService();
    }

    public void afficherMenu() {
        Scanner scanner = new Scanner(System.in);
        int choix;

        do {
            System.out.println("\n--- Gestion des Articles ---");
            System.out.println("1. Créer un nouvel article");
            System.out.println("2. Mettre à jour le stock d'un article");
            System.out.println("3. Quitter");
            System.out.print("Votre choix : ");
            choix = scanner.nextInt();
            scanner.nextLine(); // Consomme la ligne restante

            switch (choix) {
                case 1 -> creerArticle(scanner);
                case 2 -> mettreAJourStock(scanner);
                case 3 -> System.out.println("Retour au menu principal...");
                default -> System.out.println("Choix invalide, veuillez réessayer.");
            }
        } while (choix != 3);
    }

    private void creerArticle(Scanner scanner) {
        System.out.print("Nom de l'article : ");
        String nom = scanner.nextLine();
        System.out.print("Prix : ");
        double prix = scanner.nextDouble();
        System.out.print("Quantité initiale : ");
        int quantite = scanner.nextInt();

        ArticleService article = articleService.creerArticle(nom, prix, quantite);
        System.out.println("Article créé avec succès : " + article.getNom());
    }

    private void mettreAJourStock(Scanner scanner) {
        System.out.print("ID de l'article : ");
        int id = scanner.nextInt();
        System.out.print("Nouvelle quantité à ajouter : ");
        int quantite = scanner.nextInt();

        articleService.mettreAJourStock(id, quantite);
        System.out.println("Stock mis à jour avec succès.");
    }
}
