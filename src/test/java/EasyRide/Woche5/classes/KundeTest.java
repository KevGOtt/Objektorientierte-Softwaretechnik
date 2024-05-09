package EasyRide.Woche5.classes;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class KundeTest {
    Kunde k = new Kunde("abc");

    @Test
    public void testKundeGetName() {
        assertEquals("abc", k.getName());

    }

    @Test
    public void testKundeIsNull() {
        assertNotNull(k);
    }


}