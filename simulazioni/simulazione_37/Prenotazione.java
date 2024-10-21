package simulazioni.simulazione_37;

public class Prenotazione 
{
    int campo;
    int ora;

    public Prenotazione(int codice,int ora)
    {
        this.campo=codice;
        this.ora=ora;
    }

    public String toString()
    {
        return "("+campo+","+ora+")";
    }
}
