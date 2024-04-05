package Vorlesungen.Woche1;

public class Buch {
    private String titel;
    private String verlag;
    private int auflage;
    private String erscheinungsdatum;
    private int isbn;
    private int seitenzahl;
    private Genre genre;
    private Autor autor;
    private int ID;
    private Standort standort;

    public Buch(String titel, String verlag, int auflage, String erscheinungsdatum, int isbn, int seitenzahl, Genre genre, Autor autor, int ID, Standort standort) {
        this.titel = titel;
        this.verlag = verlag;
        this.auflage = auflage;
        this.erscheinungsdatum = erscheinungsdatum;
        this.isbn = isbn;
        this.seitenzahl = seitenzahl;
        this.genre = genre;
        this.autor = autor;
        this.ID = ID;
        this.standort = standort;
    }

    public String getTitel() {
        return titel;
    }

    public String getVerlag() {
        return verlag;
    }

    public int getAuflage() {
        return auflage;
    }

    public String getErscheinungsdatum() {
        return erscheinungsdatum;
    }

    public int getIsbn() {
        return isbn;
    }

    public int getSeitenzahl() {
        return seitenzahl;
    }

    public Genre getGenre() {
        return genre;
    }

    public Autor getAutor() {
        return autor;
    }

    public int getID() {
        return ID;
    }

    public Standort getStandort() {
        return standort;
    }
}
