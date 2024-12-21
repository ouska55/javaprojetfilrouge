package View;

import Entite.UtilisateurEntite;
import Service.UtilisateurService;

import java.security.Provider.Service;
import java.util.Scanner;

public class UtilisateurView {
    private final UtilisateurService utilisateurService;

    public UtilisateurView() {
        this.utilisateurService = new UtilisateurService();
    }

    public void afficherMenu() {
        Scanner scanner = new Scanner(System.in);
        int choix;

        do {
            System.out.println("\n--- Gestion des Utilisateurs ---");
            System.out.println("1. Créer un utilisateur");
            System.out.println("2. Activer un utilisateur");
            System.out.println("3. Désactiver un utilisateur");
            System.out.println("4. Quitter");
            System.out.print("Votre choix : ");
            choix = scanner.nextInt();
            scanner.nextLine(); // Consomme la ligne restante

            switch (choix) {
                case 1 -> creerUtilisateur(scanner);
                case 2 -> activerUtilisateur(scanner);
                case 3 -> desactiverUtilisateur(scanner);
                case 4 -> System.out.println("Retour au menu principal...");
                default -> System.out.println("Choix invalide, veuillez réessayer.");
            }
        } while (choix != 4);
    }

    private void creerUtilisateur(Scanner scanner) {
        System.out.print("Email : ");
        String email = scanner.nextLine();
        System.out.print("Login : ");
        String login = scanner.nextLine();
        System.out.print("Mot de passe : ");
        String password = scanner.nextLine();
        System.out.print("Rôle : ");
        String role = scanner.nextLine();
        System.out.print("Actif (true/false) : ");
        boolean actif = scanner.nextBoolean();

        UtilisateurEntite utilisateur = utilisateurService.creerUtilisateur(email, login, password, role, actif);
        System.out.println("Utilisateur créé avec succès : " + utilisateur.getEmail());
    }

}