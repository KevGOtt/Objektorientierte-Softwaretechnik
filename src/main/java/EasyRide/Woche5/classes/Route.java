package EasyRide.Woche5.classes;

import java.util.ArrayList;
import java.util.List;

public class Route {
    private  String name;

    public List<Haltepunkt> getHaltepunkte() {
        return haltepunkte;
    }

    private List<Haltepunkt> haltepunkte = new ArrayList<>();


    public Route(){

    }
    public Route(String name, List<Haltepunkt> haltepunkte) {
        this.name = name;
        this.haltepunkte = haltepunkte;
    }


    public void addHP(Haltepunkt h) {
        haltepunkte.add(h);
    }



    @Override
    public String toString() {
        return "Route{" +
                "name='" + name + '\'' +
                ", haltepunkte=" + haltepunkte +
                '}';
    }
}
