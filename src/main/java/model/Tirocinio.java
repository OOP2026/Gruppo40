package model;

public class Tirocinio {
}
public class Tirocinio {
    private int idTirocinio;
    private String titolo;
    private String descrizione;
    private data dataInizio;
    private data dataFine;
    private StatoTirocinio stato;

    private Docente referente; // Associazione "propone"
}