package Entite;
import java.util.List;

public class UtilisateurEntite {
    private int id;
    private String email;
    private String login;
    private String password;
    private String role;
    private boolean actif;

    public void Utilisateur(int id, String email, String login, String password, String role, boolean actif) {
        this.id = id;
        this.email = email;
        this.login = login;
        this.password = password;
        this.role = role;
        this.actif = actif;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getLogin() { return login; }
    public void setLogin(String login) { this.login = login; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }

    public boolean isActif() { return actif; }
    public void setActif(boolean actif) { this.actif = actif; }
}