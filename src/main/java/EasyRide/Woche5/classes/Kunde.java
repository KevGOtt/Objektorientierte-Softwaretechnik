package EasyRide.Woche5.classes;

import EasyRide.Woche5.interfaces.IFahrtinformationen;

public class Kunde implements IFahrtinformationen {
    private final String name;

    public Kunde(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void FahrtBuchen(){
        //Hier wird eine Fahrt gebucht
    }

    public boolean FahrtStornieren() {
        //Hier wird eine Fahrt storniert
        return true;
    }


    @Override
    public Fahrtinformation getFahrtinformationen() {
        return null;
    }
}
