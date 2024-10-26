package simulazioni.simulazione_26;

public class Partecipazione 
{
    private int spesa;
    private Partecipante part;
    
    public Partecipazione(int spesa,Partecipante p)
    {
        this.spesa=spesa;
        this.part=p;
    }

    public String toString()
    {
        return part.getCognome()+"\t"+spesa;
    }

    public int getSpesa()
    {
        return spesa;
    }
}
