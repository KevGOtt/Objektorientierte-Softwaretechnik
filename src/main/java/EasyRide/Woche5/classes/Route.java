package EasyRide.Woche5.classes;

import java.util.ArrayList;
import java.util.List;

public class Route {
    private  String name;

    private Fahrer fahrer;
    private List<Haltepunkt> haltepunkte = new ArrayList<>();

    public Route(){
        this.haltepunkte.add(0,new Haltepunkt(this.fahrer.getxPos(), this.fahrer.getyPos(), 0) );
    }
    public Route(String name, Fahrer fahrer) {
        this.fahrer = fahrer;
        this.name = name;
        this.haltepunkte.add(0,new Haltepunkt(this.fahrer.getxPos(), this.fahrer.getyPos(), 0) );
    }
    public static Route createNewRoute() {
        return new Route();
    }
    public List<Haltepunkt> getHaltepunkte() {
        return haltepunkte;
    }
    public double getGesamtRoutenDauer() {
        return (double)Math.round((this.getGesamtStreckeInKm() / 0.58)*100)/100;
    }
    public double getGesamtStreckeInKm() {
        double gesamt = 0;
        int index1 = 0;
        int index2 = 1;
        Haltepunkt hp1;
        Haltepunkt hp2;
        int xAbstand;
        int yAbstand;
        double strecke = 0;
        if (this.haltepunkte.size()<=1) {
            return 0;
        }else{
            for (int i = 0; i < haltepunkte.size() -1; i++) {
                hp1 = haltepunkte.get(index1);
                hp2 = haltepunkte.get(index2);
                xAbstand = (int)Math.abs(hp1.getxPos() - hp2.getxPos());
                yAbstand = (int)Math.abs(hp1.getyPos() - hp2.getyPos());
                strecke = (double)Math.sqrt(xAbstand * xAbstand + yAbstand * yAbstand);
                gesamt += strecke;
                index2++;
                index1++;
            }
        }
         return (double)Math.round(gesamt*100)/100;
    }







    public void addHP(Haltepunkt h) {
        haltepunkte.add(h);
    }

    public Fahrer getFahrer() {
        return fahrer;
    }

    public void setFahrer(Fahrer fahrer) {
        this.fahrer = fahrer;
    }

    @Override
    public String toString() {
        return "Route{" +
                "name='" + name + '\'' +
                ", haltepunkte=" + haltepunkte +
                '}';
    }
}
