package View;

import Entite.ClientEntite;
import Service.ClientService;

import java.util.List;
import java.util.Scanner;

public class ClientView {
    private final ClientService clientService;

    public ClientView() {
        this.clientService = new ClientService();
    }

    public void afficherMenu() {
        Scanner scanner = new Scanner(System.in);
        int choix;

        do {
            System.out.println("\n--- Gestion des Clients ---");
            System.out.println("1. Créer un nouveau client");
            System.out.println("2. Afficher tous les clients");
            System.out.println("3. Quitter");
            System.out.print("Votre choix : ");
            choix = scanner.nextInt();
            scanner.nextLine(); // Consomme la ligne restante

            switch (choix) {
                case 1 -> creerClient(scanner);
                case 2 -> afficherTousLesClients();
                case 3 -> System.out.println("Retour au menu principal...");
                default -> System.out.println("Choix invalide, veuillez réessayer.");
            }
        } while (choix != 3);
    }

    private void creerClient(Scanner scanner) {
        System.out.print("Nom : ");
        String nom = scanner.nextLine();
        System.out.print("Prénom : ");
        String prenom = scanner.nextLine();
        System.out.print("Adresse : ");
        String adresse = scanner.nextLine();
        System.out.print("Téléphone : ");
        String telephone = scanner.nextLine();

        Client client = clientService.creerClient(nom, prenom, adresse, telephone);
        System.out.println("Client créé avec succès : " + client.getNom() + " " + client.getPrenom());
    }

    private void afficherTousLesClients() {
        List<ClientService> clients = clientService.listerTousLesClients();

        if (clients.isEmpty()) {
            System.out.println("Aucun client enregistré.");
        } else {
            System.out.println("\n--- Liste des Clients ---");
            for (Client client : clients) {
                System.out.println("ID: " + client.getId() + ", Nom: " + client.getNom() + ", Prénom: " + client.getPrenom() +
                        ", Adresse: " + client.getAdresse() + ", Téléphone: " + client.getTelephone());
            }
        }
    }
}