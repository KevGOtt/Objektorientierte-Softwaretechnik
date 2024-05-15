package Vorlesungen.Woche7.bi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KundeAusleiheAssotiationTest {
    @Test
    void testAusleiheSetKunde(){
        Ausleihe ausleihe = new Ausleihe();
        Kunde kunde = new Kunde();

        ausleihe.setKunde(kunde);

        assertTrue(kunde.getAusleihen().contains(ausleihe));
        assertTrue(ausleihe.getKunde() == kunde);

        ausleihe.setKunde(null);

        assertTrue(!kunde.getAusleihen().contains(ausleihe));
        assertTrue(ausleihe.getKunde() == null);
    }


    @Test
    void testKundeAddAusleihe(){
        Ausleihe ausleihe = new Ausleihe();
        Kunde kunde = new Kunde();

        kunde.addAusleihe(ausleihe);

        assertTrue(kunde.getAusleihen().contains(ausleihe));
        assertTrue(ausleihe.getKunde() == kunde);

    kunde.removeAusleihe(ausleihe);

        assertTrue(!kunde.getAusleihen().contains(ausleihe));
        assertTrue(ausleihe.getKunde() == null);
    }
}