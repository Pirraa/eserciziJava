package simulazioni.simulazione_16_01_2022;
import java.util.*;

public class Negozio
{
    private int codice;
    private String nome;
    private String indirizzo;
    List<Giacenza> giacenze;

    public Negozio(String nome,String indirizzo,int codice)
    {
        this.codice=codice;
        this.nome=nome;
        this.indirizzo=indirizzo;
        giacenze=new ArrayList<>();
    }

    public float costoTotale()
    {
        float totale=0;
        for(Giacenza g : giacenze)
            totale+=g.calcolaCosto();
        return totale;
    }

    public void addGiacenza(Giacenza g)
    {
        giacenze.add(g);
    }

    public int numArticoli()
    {
        int totale=0;
        for (Giacenza g:giacenze)
        {
            totale+=g.getQuantità();
        }
        return totale;
    }

    public String toString()
    {
        return codice+"\t"+nome+"\t"+indirizzo+"\t"+numArticoli()+"\t"+giacenze+"\t";
    }
}
