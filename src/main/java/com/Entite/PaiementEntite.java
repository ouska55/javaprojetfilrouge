package Entite;

public class PaiementEntite {
    private int id;
    private String date;
    private double montant;
    private DetteEntite dette;

  

    public PaiementEntite(int i, double montant2) {
        //TODO Auto-generated constructor stub
    }

    public void Paiement(int id, String date, double montant, DetteEntite dette) {
        this.id = id;
        this.date = date;
        this.montant = montant;
        this.dette = dette;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }

    public double getMontant() { return montant; }
    public void setMontant(double montant) { this.montant = montant; }

    public DetteEntite getDette() { return dette; }
    public void setDette(DetteEntite dette) { this.dette = dette; }
}

