package Service;

import Entite.DetteEntite;
import Entite.PaiementEntite;

public class PaiementService {
    public PaiementEntite enregistrerPaiement(int detteId, double montant, DetteEntite dette) {
        return new PaiementEntite(0,  montant, dette);
    }
}