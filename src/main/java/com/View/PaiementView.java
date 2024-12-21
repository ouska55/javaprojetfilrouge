package View;

import Service.PaiementService;

import java.util.Scanner;

public class PaiementView {
    private final PaiementService paiementService;

    public PaiementView() {
        this.paiementService = new PaiementService();
    }

    public void afficherMenu() {
        Scanner scanner = new Scanner(System.in);
        int choix;

        do {
            System.out.println("\n--- Gestion des Paiements ---");
            System.out.println("1. Enregistrer un paiement");
            System.out.println("2. Quitter");
            System.out.print("Votre choix : ");
            choix = scanner.nextInt();
            scanner.nextLine(); // Consomme la ligne restante

            switch (choix) {
                case 1 -> enregistrerPaiement(scanner);
                case 2 -> System.out.println("Retour au menu principal...");
                default -> System.out.println("Choix invalide, veuillez réessayer.");
            }
        } while (choix != 2);
    }

    private void enregistrerPaiement(Scanner scanner) {
        System.out.print("ID de la dette : ");
        int detteId = scanner.nextInt();
        System.out.print("Montant du paiement : ");
        double montant = scanner.nextDouble();

        paiementService.enregistrerPaiement(detteId, montant);
        System.out.println("Paiement enregistré avec succès.");
    }
}
