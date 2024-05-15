package EasyRide.Woche5.classes;

import java.util.Scanner;

public class Kunde {
    private final String name;

    public Kunde(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public Fahrt FahrtBuchen(int Uhrzeit, Haltepunkt startPunkt, Haltepunkt zielpunkt){
        //Hier wird eine Fahrt gebucht
        return new Fahrt(Uhrzeit, startPunkt, zielpunkt);
    }

    public void FahrtStornieren() {
        //Hier wird eine Fahrt storniert
        System.out.println("Ihre Fahrt wurde erfolgreich storniert.");
    }



    public Fahrtinformation getFahrtinformationen() {
        return null;
    }
}
