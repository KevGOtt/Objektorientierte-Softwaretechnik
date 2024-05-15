package EasyRide.Woche5.classes;

public class Fahrt {
    private int uhrzeit;
    private Haltepunkt startpunkt;
    private Haltepunkt zielpunkt;

    public Fahrt(int uhrzeit, Haltepunkt startpunkt, Haltepunkt zielpunkt) {
        this.uhrzeit = uhrzeit;
        this.startpunkt = startpunkt;
        this.zielpunkt = zielpunkt;
    }

    public int getUhrzeit() {
        return uhrzeit;
    }

    public Haltepunkt getStartpunkt() {
        return startpunkt;
    }

    public Haltepunkt getZielpunkt() {
        return zielpunkt;
    }
}
