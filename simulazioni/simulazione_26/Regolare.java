package simulazioni.simulazione_26;

public class Regolare extends Partecipante
{
    String ente;
    boolean accademico;
    int dipendenti;

    public Regolare(int codice, String nome,String cognome,String ente,boolean accademico,int dipendenti)
    {
        super(codice, nome, cognome);
        this.accademico=accademico;
        this.dipendenti=dipendenti;
        this.ente=ente;
    }

    public String toString()
    {
        return super.toString()+"-\t-\t-\t"+ente+"\t"+accademico+"\t"+dipendenti;
    }

    public String getente()
    {
        return this.ente;
    }
}
