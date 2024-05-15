package EasyRide.Woche5.classes;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class KundeTest {
    Kunde k = new Kunde("Richard Walter");

    @Test
    public void test1() {
        int uhrzeit = 13;
        Fahrt fahrt =  k.FahrtBuchen(uhrzeit, new Haltepunkt(10,10), new Haltepunkt(14,11));
        assertEquals(uhrzeit, fahrt.getUhrzeit());
    }


}