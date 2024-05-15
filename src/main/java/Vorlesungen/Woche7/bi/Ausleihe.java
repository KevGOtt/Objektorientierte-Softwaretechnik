package Vorlesungen.Woche7.bi;

public class Ausleihe {
    private Kunde kunde;

    public void setKunde(Kunde kunde) {
        if (kunde == null) {
            this.kunde.removeAusleihe(this);
        }
        this.kunde = kunde;
        if (!kunde.getAusleihen().contains(this)) {
            kunde.addAusleihe(this);
        }
    }

    public Kunde getKunde() {
        return kunde;
    }
}
