package Service;

import java.util.ArrayList;
import java.util.List;

import Entite.ClientEntite;
import Entite.UtilisateurEntite;

public class ClientService {
    public ClientEntite creerClient(String surname, String telephone, String adresse, UtilisateurEntite compte) {
        return new Client(0, surname, telephone, adresse, compte);
    }

    public List<ClientEntite> listerClientsAvecOuSansCompte(List<ClientEntite> clients, boolean avecCompte) {
        List<ClientEntite> resultat = new ArrayList<>();
        for (ClientEntite client : clients) {
            if ((avecCompte && client.getCompte() != null) || (!avecCompte && client.getCompte() == null)) {
                resultat.add(client);
            }
        }
        return resultat;
    }
}
