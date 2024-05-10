package EasyRide.Woche5.classes;

public class Haltepunkt {
    private double laengengrad;
    private double breitengrad;

    public Haltepunkt(double laengengrad, double breitengrad) {
        this.laengengrad = laengengrad;
        this.breitengrad = breitengrad;
    }

    public double getLaengengrad() {
        return laengengrad;
    }

    public double getBreitengrad() {
        return breitengrad;
    }
}
