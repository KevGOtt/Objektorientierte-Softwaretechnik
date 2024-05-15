package Vorlesungen.Woche7.bi;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Kunde {
    private Set<Ausleihe> ausleihen = new HashSet<>();

    public void addAusleihe(Ausleihe a) {
        ausleihen.add(a);
    }
    public void removeAusleihe(Ausleihe ausleihe) {
        ausleihen.remove(ausleihe);
    }

    public Set<Ausleihe> getAusleihen() {
        //return new HashSet<>(ausleihen);    //Gibt ein neues HashSet zurüpck damit
                                            // niemand von außen es ändern kann
        return Collections.unmodifiableSet(ausleihen);
    }


}
