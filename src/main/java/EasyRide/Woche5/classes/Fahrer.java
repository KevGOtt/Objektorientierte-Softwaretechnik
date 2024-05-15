package EasyRide.Woche5.classes;

public class Fahrer {
    private final String name;
    private Route route;

    public static int idCounter = 1;
    private int ID;


    public Fahrer(String name, Route route) {
        this.name = name;
        this.route = route;
        this.ID = idCounter;
        idCounter++;
    }

    public Boolean haltepunktBestaetigen() {
        return true;
    }

    public Fahrtinformation fahrtinformationenAnzeigen() {
        return new Fahrtinformation();
    }

    public String getName() {
        return name;
    }

    public int getID() {
        return this.ID;
    }

    public Fahrtinformation getFahrtinformationen() {
        return null;
    }

    @Override
    public String toString() {
        return "Fahrer{" +
                "name='" + name + '\'' +
                ", route=" + route +
                ", ID=" + ID +
                '}';
    }
}
