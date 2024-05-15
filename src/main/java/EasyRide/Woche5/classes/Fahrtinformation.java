package EasyRide.Woche5.classes;

import java.util.List;

public class Fahrtinformation  {
    private int fahrtdauer;
    private List<Haltepunkt> haltepunkte;
    private Fahrer fahrer;
    private int strecklaengeInKm;
    private Kunde kunde;
    private int zeitpunkt;

    public Fahrtinformation() {

    }

    public Fahrtinformation(int fahrtdauer, List<Haltepunkt> haltepunkte, Fahrer fahrer, int strecklaengeInKm, Kunde kunde, int zeitpunkt) {
        this.fahrtdauer = fahrtdauer;
        this.haltepunkte = haltepunkte;
        this.fahrer = fahrer;
        this.strecklaengeInKm = strecklaengeInKm;
        this.kunde = kunde;
        this.zeitpunkt = zeitpunkt;
    }

    public int getFahrtdauer() {
        return fahrtdauer;
    }

    public List<Haltepunkt> getHaltepunkte() {
        return haltepunkte;
    }

    public Fahrer getFahrer() {
        return fahrer;
    }

    public int getStrecklaengeInKm() {
        return strecklaengeInKm;
    }

    public Kunde getKunde() {
        return kunde;
    }

    public int getZeitpunkt() {
        return zeitpunkt;
    }
}
