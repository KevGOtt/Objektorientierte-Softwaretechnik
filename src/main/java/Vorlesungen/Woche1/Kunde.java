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
    private int kundenID;
    private String bild;

    public Kunde(String name, Anschrift anschrift, int kundenID, String bild) {
        this.name = name;
        this.anschrift = anschrift;
        this.kundenID = kundenID;
        this.bild = bild;
    }
    public void buchReservieren(Buch b) {
        //TODO
    }
    public void reservierungStornieren(Buch b){
        //TODO
    }
    public void leihfristVerlaenger(Buch b) {
        //todo
    }
    public void buchStandortAnzeigen(Buch b) {
        //TODO
    }
    public void buchStatusAnzeigen(Buch b) {

    }
    public void buecherBestandAnzeigen() {

    }
    public int getID() {
        return this.kundenID;
    }
}
