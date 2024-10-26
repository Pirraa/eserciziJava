package simulazioni.simulazione_26;
import java.util.*;

public class Conferenza 
{
    private String nome;
    private String luogo;
    private List<Partecipazione> partecipazioni;

    public Conferenza(String nome,String luogo)
    {
        this.nome=nome;
        this.luogo=luogo;
        partecipazioni=new ArrayList<>();
    }

    public void aggiungiPartecipazione(Partecipazione p)
    {
        partecipazioni.add(p);
    }

    public String toString()
    {
        return nome+"\n"+luogo+"\n"+spesa()+"\t"+numPartecipanti()+"\n"+partecipazioni;
    }

    public int spesa()
    {
        int totale=0;
        for (Partecipazione p : partecipazioni)
        {
            totale+=p.getSpesa();       
        }
        return totale;
    }

    public int numPartecipanti()
    {
        return partecipazioni.size();
    }
}
