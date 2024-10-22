package simulazioni.simulazione_35;

public class Giocatore 
{
    String cognome;
    int codice_squadra;
    String nome;
    int età;
    int numero_maglia;
    String ruolo;
    boolean titolare;

    public Giocatore(String cognome, int codice_squadra, String nome, int età, int numero_maglia, String ruolo, boolean titolare)
    {
        this.cognome = cognome;
        this.codice_squadra = codice_squadra;
        this.nome = nome;
        this.età = età;
        this.numero_maglia = numero_maglia;
        this.ruolo = ruolo;
        this.titolare = titolare;
    }

    public String toString()
    {
        return cognome + "\t" + nome + "\t" + età + "\t" + numero_maglia + "\t" + ruolo + "\t" + titolare;
    }
}
