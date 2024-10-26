package simulazioni.simulazione_26;
//14:34
public class Partecipante 
{
    private int codice;
    private String nome;
    private String cognome;

    public Partecipante(int codice,String nome,String cognome)
    {
        this.nome=nome;
        this.cognome=cognome;
        this.codice=codice;
    }

    public String toString()
    {
        return codice+"\t"+nome +"\t" +cognome +"\t";
    }

    public String getCognome()
    {
        return cognome;
    }
}
