package simulazione_31;
import java.util.*;

public class Cliente 
{
    private String nome;
    List<Noleggio> noleggi;
    private double costoMax;

    public Cliente(String nome) 
    {
        this.nome = nome;
        this.noleggi = new LinkedList<>();
        costoMax=0;
    }

    public void aggiungiNoleggio(Noleggio n)
    {
        noleggi.add(n);
    }

    public String toString()
    {
        return nome+"\t"+"Costo massimo: "+costoMax+"\t Noleggi: "+noleggi.size();
    }

    public double getCostoMax()
    {
        return costoMax;
    }

    public double setCostoMax(double costo)
    {
        return costoMax=costo;
    }
}
