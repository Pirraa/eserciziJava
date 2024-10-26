package simulazioni.simulazione_26;

public class Studente extends Partecipante
{
    String corso;
    String università;
    int anno;

    public Studente(int codice, String nome,String cognome,String corso,String università,int anno)
    {
        super(codice, nome, cognome);
        this.corso=corso;
        this.università=università;
        this.anno=anno;
    }

    public String toString()
    {
        return super.toString()+corso+"\t"+università+"\t"+anno+"\t-\t-\t-";
    }

    public String getUni()
    {
        return this.università;
    }
}
