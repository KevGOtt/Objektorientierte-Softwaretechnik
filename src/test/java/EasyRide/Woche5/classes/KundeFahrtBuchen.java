package EasyRide.Woche5.classes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KundeFahrtBuchen {
    Fahrer fahrer1 = new Fahrer("Sido", 0,0);

    Kunde k1 = new Kunde("Gzuz");
    Kunde k2 = new Kunde("Bonez MC");
    @Test
    void fahrtBuchen() {
        assertEquals("Gzuz", k1.getName());
        k1.fahrtBuchen(new Haltepunkt(1,2, k1.getId()), new Haltepunkt(3,1,k1.getId()));
        assertEquals(7.71, k1.getRoute().getGesamtRoutenDauer());
        assertEquals(4.47, k1.getRoute().getGesamtStreckeInKm());
    }
}