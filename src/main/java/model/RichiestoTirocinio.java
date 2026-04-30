package model;

public class RichiestoTirocinio {
}
public class RichiestaTirocinio {
    private int idRichiesta;
    private data dataRichiesta;
    private StatoRichiesta stato;
    private String note;
    private String motivazioneRifiuto;

    // Collegamenti UML
    private Studente studente; // Chi effettua la richiesta
    private Tirocinio tirocinio; // Su quale tirocinio
}