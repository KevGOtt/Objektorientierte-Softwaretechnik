package EasyRide.Woche5.classes;

public class Fahrzeug {

    private String nummernschild;
    private int fahrzeugNr;
    private int maxSitzplaetze;

    public Fahrzeug(String nummernschild, int fahrzeugNr, int maxSitzplaetze) {
        this.nummernschild = nummernschild;
        this.fahrzeugNr = fahrzeugNr;
        this.maxSitzplaetze = maxSitzplaetze;
    }

    public String getNummernschild() {
        return nummernschild;
    }

    public int getFahrzeugNr() {
        return fahrzeugNr;
    }

    public int getMaxSitzplaetze() {
        return maxSitzplaetze;
    }
}
