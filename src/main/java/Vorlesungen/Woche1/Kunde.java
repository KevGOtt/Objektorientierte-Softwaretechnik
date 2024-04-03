package Vorlesungen.Woche1;

public class Kunde {
    //Kundenkonto anlegen und zu löschen (sofern der Kunde keine Ausleihen mehr zurückgegebn hat)
    //Bestand einzusehen und nach Merkmalen wie Title genre suchen
    //Standort, Ausleihe & Reservierungsstatutus von Exemplaren einsehen kann
    //Buch reservieren und Reservierung stornieren
    //Leihfrist zu verlängern

    //Namen
    //Anschrift
    //KundenID
    //LICHTBILD

    private String name;
    private Anschrift anschrift;
    private int KundenID;
    private String bild;

    public int getID() {
        return this.KundenID;
    }
}
