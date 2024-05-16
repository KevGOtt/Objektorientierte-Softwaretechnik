package EasyRide.Woche5.classes;

import java.util.ArrayList;
import java.util.List;

public class FahrerListe {
    private static List<Fahrer> fahrer = new ArrayList<>();

    public static void addFahrer(Fahrer f) {
        fahrer.add(f);
    }

    public static Fahrer getClosestFahrer() {
        //SPÄTER Djikstra implementieren
        return fahrer.get(0);
    }
}