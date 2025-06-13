package Utente_Permessi;
import java.util.ArrayList;

abstract class Utente {
    protected String username;
    protected String email;

    public Utente(String username, String email) {
        this.username = username;
        this.email = email;
    }

    public abstract ArrayList<String> getPermessi();

    public void stampaInfo() {
        System.out.println("Username: " + username + " - Email: " + email);
    }
}
