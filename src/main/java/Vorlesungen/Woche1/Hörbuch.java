package Vorlesungen.Woche1;

public class Hörbuch {
    //Buch aber ohne Seitenzahl dafür mit Anzahl an Datenträgern /CDs) und eine Spiellänge in Minuten
    private String titel;
    private String verlag;
    private int auflage;
    private String erscheinungsdatum;
    private int isbn;
    private int anzahlDatentraeger;
    private int spiellaengeInMinuten;
    private Genre genre;
    private Autor autor;

    public Hörbuch(String titel, String verlag, int auflage, String erscheinungsdatum, int isbn, int anzahlDatentraeger, int spiellaengeInMinuten, Genre genre, Autor autor) {
        this.titel = titel;
        this.verlag = verlag;
        this.auflage = auflage;
        this.erscheinungsdatum = erscheinungsdatum;
        this.isbn = isbn;
        this.anzahlDatentraeger = anzahlDatentraeger;
        this.spiellaengeInMinuten = spiellaengeInMinuten;
        this.genre = genre;
        this.autor = autor;
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

    public int getAnzahlDatentraeger() {
        return anzahlDatentraeger;
    }

    public int getSpiellaengeInMinuten() {
        return spiellaengeInMinuten;
    }

    public Genre getGenre() {
        return genre;
    }

    public Autor getAutor() {
        return autor;
    }
}
