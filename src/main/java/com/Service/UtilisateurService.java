package Service;
import java.util.*;

import Entite.UtilisateurEntite;

public class UtilisateurService {
    public UtilisateurEntite creerUtilisateur(String email, String login, String password, String role, boolean actif) {
        return new Utilisateur(0, email, login, password, role, actif);
    }

    public void desactiverUtilisateur(Utilisateur utilisateur) {
        utilisateur.setActif(false);
    }

    public void activerUtilisateur(Utilisateur utilisateur) {
        utilisateur.setActif(true);
    }
}