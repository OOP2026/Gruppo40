package model;

public class MainTest {
    public static void main(String[] args) {
        System.out.println("Seduta Laurea sistema");

        // Professore (Porfirio Tramontana)
        Docente profTramontana = new Docente();
        profTramontana.setNome("Porfirio");
        profTramontana.setCognome("Tramontana");
        profTramontana.setMail("p.tramontana@professori.unina.it");
        profTramontana.setIdDocente("DOC_UNINA_1");

        // Studente (Giuseppe Locricchio)
        Studente studenteGiuseppe = new Studente();
        studenteGiuseppe.setNome("Giuseppe");
        studenteGiuseppe.setCognome("Locricchio");
        studenteGiuseppe.setMail("g.locricchio@studenti.unina.it");
        studenteGiuseppe.setMatricola("DE1000216"); // Esempio di matricola Unina
        studenteGiuseppe.setCorsoStudi("Informatica");

        // 3. Creazione Tirocinio Esterno proposto dal Professore
        TirocinioEst tirocinioSoftware = new TirocinioEst();
        tirocinioSoftware.setTitolo("Sviluppo Sistemi Software");
        tirocinioSoftware.setDescrizione("Progetto di analisi e test del software");
        tirocinioSoftware.setStato(StatoTirocinio.Disponibile);
        tirocinioSoftware.setReferenteAzienda("Responsabile IT Azienda X");
        tirocinioSoftware.setReferente(profTramontana); // Associazione Docente -> Tirocinio

        // 4. Richiesta dello Studente
        RichiestaTirocinio richiesta = new RichiestaTirocinio();
        richiesta.setIdRichiesta(101);
        richiesta.setStato(StatoRichiesta.InAttesa);
        richiesta.setStudente(studenteGiuseppe); // Associazione Studente -> Richiesta
        richiesta.setTirocinio(tirocinioSoftware); // Associazione Richiesta -> Tirocinio

        // --- OUTPUT DI VERIFICA ---
        System.out.println("### RIEPILOGO RICHIESTA TIROCINIO ###");
        System.out.println("Studente: " + richiesta.getStudente().getNome() + " " + richiesta.getStudente().getCognome());
        System.out.println("Email Studente: " + richiesta.getStudente().getMail());
        System.out.println("-----------------------------------");
        System.out.println("Progetto: " + richiesta.getTirocinio().getTitolo());
        System.out.println("Tutor Universitario: Prof. " + richiesta.getTirocinio().getReferente().getCognome());
        System.out.println("Email Professore: " + richiesta.getTirocinio().getReferente().getMail());
        System.out.println("Stato Richiesta: " + richiesta.getStato());


    }
}