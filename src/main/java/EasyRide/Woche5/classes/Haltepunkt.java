package EasyRide.Woche5.classes;

public class Haltepunkt {
    private final double xPos;
    private final double yPos;
     private final int idKunde;
    public Haltepunkt(double xPos, double yPos, int idKunde) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.idKunde = idKunde;
    }

    public double getxPos() {
        return xPos;
    }

    public double getyPos() {
        return yPos;
    }

    public int getIdKunde() {
        return idKunde;
    }

    @Override
    public String toString() {
        return "Haltepunkt{" +
                "laengengrad=" + xPos +
                ", breitengrad=" + yPos +
                '}';
    }
}
