package Animali;
import java.util.ArrayList;

class Rifugio {
    private ArrayList<Animale> animali;

    public Rifugio() {
        animali = new ArrayList<>();
    }

    public void aggiungiAnimale(Animale a) {
        animali.add(a);
    }

    public void stampaVersi() {
        for (Animale animale : animali) {
            animale.emettiVerso();
        }
    }
}