package simulazione_37;
import java.util.*;

public class Socio 
{
    private int codice, età, categoria;
    private String nome;

    List<Prenotazione> prenotazioni;

    public Socio(int codice, String nome,int età, int categoria)
    {
        this.codice=codice;
        this.età=età;
        this.categoria=categoria;
        this.nome=nome;
        prenotazioni=new LinkedList<Prenotazione>();
    }

    public String toString()
    {
        return codice + "\t" + nome + "\t" + età + "\t" + categoria;
    }

    public void addPrenotazione(Prenotazione p)
    {
        prenotazioni.add(p);
    }
    
}
