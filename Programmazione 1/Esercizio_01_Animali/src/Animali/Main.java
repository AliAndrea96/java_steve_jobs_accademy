package Animali;

public class Main {
    public static void main(String[] args) {

        Rifugio rifugio = new Rifugio();


        Cane cane = new Cane("Sally");
        Gatto gatto = new Gatto("Holy");


        rifugio.aggiungiAnimale(cane);
        rifugio.aggiungiAnimale(gatto);


        rifugio.stampaVersi();
    }
}