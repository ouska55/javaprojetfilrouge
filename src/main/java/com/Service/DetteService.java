package Service;

import java.util.List;
import Entite.ArticleEntite;
import Entite.ClientEntite;
import Entite.DetteEntite;
import Service.DetteService;


public class DetteService {
    public DetteEntite creerDette(String date, double montant, double montantVerse, double montantRestant, List<ArticleEntite> articles, ClientEntite client, String etat) {
        return new Dette(0, date, montant, montantVerse, montantRestant, articles, new ArrayList<>(), client, etat);
    }

    public List<DetteEntite> listerDettesNonSoldees(List<DetteEntite> dettes) {
        List<DetteEntite> resultat = new ArrayList<>();
        for (DetteEntite dette : dettes) {
            if (dette.getMontantRestant() > 0) {
                resultat.add(dette);
            }
        }
        return resultat;
    }
}