package Vorlesungen.Woche1;

public class Autor {
    //Namen, Vornamen opt. Mittelname & Namenzusatz(akd Grad)
    private final String name;
    private final String vorname;
    private final String mittelname;
    private final String namenzusatz;

    public Autor(String name, String vorname, String mittelname, String namenzusatz) {
        this.name = name;
        this.vorname = vorname;
        this.mittelname = mittelname;
        this.namenzusatz = namenzusatz;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Autor{" +
                "name='" + this.name + '\'' +
                ", vorname='" + this.vorname + '\'' +
                ", mittelname='" + this.mittelname + '\'' +
                ", namenzusatz='" + this.namenzusatz + '\'' +
                '}';
    }
}
