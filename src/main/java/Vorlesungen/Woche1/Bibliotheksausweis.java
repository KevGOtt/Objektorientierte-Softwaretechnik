package Vorlesungen.Woche1;

public class Bibliotheksausweis {
    //KundenID + Lichtbild des Kunden
    private int kundenID;
    private String bild;
    public Bibliotheksausweis(Kunde k, String bild) {
        this.kundenID = k.getID();
        this.bild = bild;
    }
}
