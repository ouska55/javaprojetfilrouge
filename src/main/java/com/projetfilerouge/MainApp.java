package com.projetfilerouge;
package filrouge.view;

import main.java.com.Entite.*;
import main.java.com.service.*;
import java.util.*;

public class MainApp {
    public static void main(String[] args) {
        UtilisateurService utilisateurService = new UtilisateurService();
        ClientService clientService = new ClientService();
        ArticleService articleService = new ArticleService();
        DetteService detteService = new DetteService();
        PaiementService paiementService = new PaiementService();

        Scanner scanner = new Scanner(System.in);
        List<Utilisateur> utilisateurs = new ArrayList<>();
        List<Client> clients = new ArrayList<>();
        List<Article> articles = new ArrayList<>();
        List<Dette> dettes = new ArrayList<>();

        while (true) {
            // Menu principal
            System.out.println("=== Menu Principal ===");
            System.out.println("1. Gestion des Utilisateurs");
            System.out.println("2. Gestion des Clients");
            System.out.println("3. Gestion des Articles");
            System.out.println("4. Gestion des Dettes");
            System.out.println("5. Gestion des Paiements");
            System.out.println("6. Quitter");
            System.out.print("Choisissez une option: ");
            int choix = scanner.nextInt();
            scanner.nextLine();  // Consommer la nouvelle ligne après l'entier

            switch (choix) {
                case 1:
                    // Gestion des Utilisateurs
                    System.out.println("=== Gestion des Utilisateurs ===");
                    System.out.println("1. Créer un utilisateur");
                    System.out.println("2. Activer un utilisateur");
                    System.out.println("3. Désactiver un utilisateur");
                    System.out.print("Choisissez une option: ");
                    int choixUtilisateur = scanner.nextInt();
                    scanner.nextLine();  // Consommer la nouvelle ligne

                    if (choixUtilisateur == 1) {
                        System.out.print("Email: ");
                        String email = scanner.nextLine();
                        System.out.print("Login: ");
                        String login = scanner.nextLine();
                        System.out.print("Mot de passe: ");
                        String password = scanner.nextLine();
                        System.out.print("Rôle (Admin/User): ");
                        String role = scanner.nextLine();
                        System.out.print("Actif (true/false): ");
                        boolean actif = scanner.nextBoolean();
                        scanner.nextLine();  // Consommer la nouvelle ligne

                        Utilisateur utilisateur = utilisateurService.creerUtilisateur(email, login, password, role, actif);
                        utilisateurs.add(utilisateur);
                        System.out.println("Utilisateur créé: " + utilisateur.getEmail());
                    } else if (choixUtilisateur == 2) {
                        System.out.print("ID de l'utilisateur à activer: ");
                        int idActiver = scanner.nextInt();
                        scanner.nextLine();  // Consommer la nouvelle ligne
                        Utilisateur utilisateurActif = utilisateurs.get(idActiver);
                        utilisateurService.activerUtilisateur(utilisateurActif);
                        System.out.println("Utilisateur activé.");
                    } else if (choixUtilisateur == 3) {
                        System.out.print("ID de l'utilisateur à désactiver: ");
                        int idDesactiver = scanner.nextInt();
                        scanner.nextLine();  // Consommer la nouvelle ligne
                        Utilisateur utilisateurDesactive = utilisateurs.get(idDesactiver);
                        utilisateurService.desactiverUtilisateur(utilisateurDesactive);
                        System.out.println("Utilisateur désactivé.");
                    }
                    break;

                case 2:
                    // Gestion des Clients
                    System.out.println("=== Gestion des Clients ===");
                    System.out.println("1. Créer un client");
                    System.out.println("2. Lister les clients");
                    System.out.print("Choisissez une option: ");
                    int choixClient = scanner.nextInt();
                    scanner.nextLine();  // Consommer la nouvelle ligne

                    if (choixClient == 1) {
                        System.out.print("Nom: ");
                        String surname = scanner.nextLine();
                        System.out.print("Téléphone: ");
                        String telephone = scanner.nextLine();
                        System.out.print("Adresse: ");
                        String adresse = scanner.nextLine();
                        System.out.print("ID du compte utilisateur: ");
                        int idCompte = scanner.nextInt();
                        scanner.nextLine();  // Consommer la nouvelle ligne

                        Utilisateur compte = utilisateurs.get(idCompte);
                        Client client = clientService.creerClient(surname, telephone, adresse, compte);
                        clients.add(client);
                        System.out.println("Client créé: " + client.getSurname());
                    } else if (choixClient == 2) {
                        System.out.println("Liste des clients:");
                        for (Client c : clients) {
                            System.out.println("Client ID: " + c.getId() + ", Nom: " + c.getSurname() + ", Téléphone: " + c.getTelephone());
                        }
                    }
                    break;

                case 3:
                    // Gestion des Articles
                    System.out.println("=== Gestion des Articles ===");
                    System.out.println("1. Créer un article");
                    System.out.println("2. Mettre à jour le stock d'un article");
                    System.out.print("Choisissez une option: ");
                    int choixArticle = scanner.nextInt();
                    scanner.nextLine();  // Consommer la nouvelle ligne

                    if (choixArticle == 1) {
                        System.out.print("Nom de l'article: ");
                        String nom = scanner.nextLine();
                        System.out.print("Quantité en stock: ");
                        int quantite = scanner.nextInt();
                        scanner.nextLine();  // Consommer la nouvelle ligne

                        Article article = articleService.creerArticle(nom, quantite);
                        articles.add(article);
                        System.out.println("Article créé: " + article.getNom());
                    } else if (choixArticle == 2) {
                        System.out.print("ID de l'article à mettre à jour: ");
                        int idArticle = scanner.nextInt();
                        System.out.print("Nouvelle quantité en stock: ");
                        int nouvelleQuantite = scanner.nextInt();
                        scanner.nextLine();  // Consommer la nouvelle ligne

                        Article article = articles.get(idArticle);
                        articleService.mettreAJourStock(article, nouvelleQuantite);
                        System.out.println("Stock de l'article mis à jour.");
                    }
                    break;

                case 4:
                    // Gestion des Dettes
                    System.out.println("=== Gestion des Dettes ===");
                    System.out.println("1. Créer une dette");
                    System.out.println("2. Lister les dettes non soldées");
                    System.out.print("Choisissez une option: ");
                    int choixDette = scanner.nextInt();
                    scanner.nextLine();  // Consommer la nouvelle ligne

                    if (choixDette == 1) {
                        System.out.print("Date: ");
                        String date = scanner.nextLine();
                        System.out.print("Montant total: ");
                        double montant = scanner.nextDouble();
                        System.out.print("Montant versé: ");
                        double montantVerse = scanner.nextDouble();
                        System.out.print("Montant restant: ");
                        double montantRestant = scanner.nextDouble();
                        scanner.nextLine();  // Consommer la nouvelle ligne

                        System.out.print("ID du client: ");
                        int idClient = scanner.nextInt();
                        scanner.nextLine();  // Consommer la nouvelle ligne
                        Client client = clients.get(idClient);

                        List<Article> articlesAssocies = new ArrayList<>(); // Ajoutez des articles si nécessaire
                        Dette dette = detteService.creerDette(date, montant, montantVerse, montantRestant, articlesAssocies, client, "En Cours");
                        dettes.add(dette);
                        System.out.println("Dette créée.");
                    } else if (choixDette == 2) {
                        List<Dette> dettesNonSoldees = detteService.listerDettesNonSoldees(dettes);
                        System.out.println("Dettes non soldées:");
                        for (Dette dette : dettesNonSoldees) {
                            System.out.println("Dette ID: " + dette.getId() + ", Montant restant: " + dette.getMontantRestant());
                        }
                    }
                    break;

                case 5:
                    // Gestion des Paiements
                    System.out.println("=== Gestion des Paiements ===");
                    System.out.println("1. Enregistrer un paiement");
                    System.out.print("Choisissez une option: ");
                    int choixPaiement = scanner.nextInt();
                    scanner.nextLine();  // Consommer la nouvelle ligne

                    if (choixPaiement == 1) {
                        System.out.print("Date du paiement: ");
                        String datePaiement = scanner.nextLine();
                        System.out.print("Montant: ");
                        double montantPaiement = scanner.nextDouble();
                        System.out.print("ID de la dette: ");
                        int idDette = scanner.nextInt();
                        scanner.nextLine();  // Consommer la nouvelle ligne

                        Dette dettePaiement = dettes.get(idDette);
                        Paiement paiement = paiementService.enregistrerPaiement(datePaiement, montantPaiement, dettePaiement);
                        System.out.println("Paiement enregistré.");
                    }
                    break;

                case 6:
                    // Quitter
                    System.out.println("Au revoir!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Option invalide. Essayez encore.");
            }
        }
    }
}

}
