package EasyRide.Woche5.classes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KundeFahrtStornieren {
    Fahrer fahrer2 = new Fahrer("Sido", 0, 0);
    Kunde k3 = new Kunde("Gzuz");
    Kunde k4 = new Kunde("Bonez MC");

    @Test
    public void fahrtStornieren() {
        k3.fahrtBuchen(new Haltepunkt(1, 3, k3.getId()), new Haltepunkt(1, 1, k3.getId()));
        k4.fahrtBuchen(new Haltepunkt(0, 2, k4.getId()), new Haltepunkt(4, 3, k4.getId()));
        assertEquals(5, k3.getRoute().getHaltepunkte().size());
        assertEquals(5, k4.getRoute().getHaltepunkte().size());
        //K2 möchte seine Fahrt stornieren
        k4.fahrtStornieren();
        assertEquals(3, k3.getRoute().getHaltepunkte().size());
        assertNull(k4.getRoute());
    }
}
