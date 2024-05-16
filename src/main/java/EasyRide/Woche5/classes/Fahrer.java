package EasyRide.Woche5.classes;

public class Fahrer {
    private final String name;
    private boolean available = true;
    public static int idCounter = 1;
    private final int ID;

    private Route route;

    private int xPos;
    private  int yPos;


    public Fahrer(String name,int xPos, int yPos) {
        this.name = name;
        this.xPos = xPos;
        this.yPos = yPos;
        this.ID = idCounter;
        idCounter++;

        this.route = new Route("Strecke " + this.getID() , this);
        FahrerListe.addFahrer(this);
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

    public int getxPos() {
        return xPos;
    }

    public int getyPos() {
        return yPos;
    }

    public Route getRoute() {
        return route;
    }

    @Override
    public String toString() {
        return "Fahrer{" +
                "name='" + name + '\'' +
                ", ID=" + ID +
                '}';
    }
}
