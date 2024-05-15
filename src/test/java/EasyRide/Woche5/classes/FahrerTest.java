package EasyRide.Woche5.classes;

import org.junit.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

public class FahrerTest {
    @Test
    public void fahrerTest() {
        Route r1 = new Route();
        r1.addHP(new Haltepunkt(10,14));
        r1.addHP(new Haltepunkt(51,64));
        assertEquals(2, r1.getHaltepunkte().size());
        Fahrer f1 = new Fahrer("Rafael" , r1);
        r1.addHP(new Haltepunkt(7,82));
        r1.addHP(new Haltepunkt(11,41));
        assertEquals(4, r1.getHaltepunkte().size());

    }
}