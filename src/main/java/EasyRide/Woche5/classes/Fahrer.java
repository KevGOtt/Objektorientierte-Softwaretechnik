package EasyRide.Woche5.classes;

import EasyRide.Woche5.interfaces.IFahrtinformationen;

public class Fahrer implements IFahrtinformationen {
    private final String name;

    public Fahrer(String name) {
        this.name = name;
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

    @Override
    public Fahrtinformation getFahrtinformationen() {
        return null;
    }
}
