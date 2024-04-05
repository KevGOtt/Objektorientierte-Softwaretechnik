package Vorlesungen.Woche1;

public class Anschrift {
    //Strasse Hausnummmer PLZ Ort
    private String strasse;
    private int hausNr;
    private int plz;
    private String ort;

    public Anschrift(String strasse, int hausNr, int plz, String ort) {
        this.hausNr = hausNr;
        this.ort = ort;
        this.plz = plz;
        this.strasse = strasse;
    }

    public String getStrasse() {
        return this.strasse;
    }

    public int getHausNr() {
        return this.hausNr;
    }

    public int getPlz() {
        return this.plz;
    }

    public String getOrt() {
        return this.ort;
    }
}
