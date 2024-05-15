package EasyRide.Woche5.appl;

import EasyRide.Woche5.classes.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Route r1 = new Route();
        Haltepunkt h1 = new Haltepunkt(10,10);
        Haltepunkt h2 = new Haltepunkt(15,14);
        r1.addHP(h1);
        r1.addHP(h2);

        Kunde k = new Kunde("Rafael Ulmer");
        Fahrer f1  = new Fahrer("1111 Racette", r1);
        Fahrer f2  = new Fahrer("aaa Racette", r1);
        Fahrer f3  = new Fahrer("abbb Racette", r1);

        List<Haltepunkt> haltepunkte = new ArrayList<>();
        haltepunkte.add(h1);
        haltepunkte.add(h2);

        Fahrtinformation fa = new Fahrtinformation(45, haltepunkte,f1,12,k,14);


        k.FahrtStornieren();
        System.out.println(haltepunkte.get(0));

        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);
    }
}
