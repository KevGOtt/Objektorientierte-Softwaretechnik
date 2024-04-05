package Vorlesungen.Woche1;

import java.util.ArrayList;

public class Bibliothek {
    //Bestand aus Büchern, Hörbücher auf CD die man leihen kann
    private ArrayList<Buch> buecherBestand = new ArrayList<>();
    private ArrayList<Buch> hoerbuecherBestand = new ArrayList<>();

    public Bibliothek(ArrayList<Buch> buecher , ArrayList<Buch> hoerbuecher) {
        this.buecherBestand = buecher;
        this.hoerbuecherBestand = hoerbuecher;
    }

    public ArrayList<Buch> getBuecherBestand() {
        return buecherBestand;
    }

    public ArrayList<Buch> getHoerbuecherBestand() {
        return hoerbuecherBestand;
    }

}
