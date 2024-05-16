package EasyRide.Woche5.classes;

import java.util.Scanner;

public class Kunde {

    private static int idCounter = 1;

    private final int id;
    private final String name;

    private Route route;

    public Kunde(String name){
        this.name = name;
        this.id = idCounter;
        idCounter++;
    }

    public String getName(){
        return this.name;
    }

    public void fahrtBuchen(Haltepunkt startPunkt, Haltepunkt zielpunkt){
        Fahrer f = FahrerListe.getClosestFahrer();
        f.getRoute().addHP(startPunkt);
        f.getRoute().addHP(zielpunkt);
        this.route = f.getRoute();
        System.out.println("Fahrt buchen erfolgreich.");
    }

    public void fahrtStornieren() {
        int id = this.getId();
        this.getRoute().getHaltepunkte().removeIf(h -> h.getIdKunde() == id);
        System.out.println("Ihre Fahrt wurde erfolgreich storniert.");
        this.route = null;
    }

    public int getId() {
        return id;
    }

    public Route getRoute() {
        return route;
    }

    public Fahrtinformation getFahrtinformationen() {
        return null;
    }
}
