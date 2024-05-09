package EasyRide.Woche5.classes;

import EasyRide.Woche5.interfaces.IFahrtinformationen;

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


}
