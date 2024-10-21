package simulazioni.simulazione_29;
import java.util.*;

public class Cliente 
{
    private int codice;
    private String nome;
    private List<Servizio> servizi;

    public Cliente(int codice, String nome)
    {
        this.codice = codice;
        this.nome = nome;
        servizi = new ArrayList<>();
    }

    public void addServizio(Servizio s)
    {
        servizi.add(s);
    }

    //totale del costo dei servizi che ha utilizzato, ottenuto sommando i costi dei singoli servizi, a loro volta ottenuti moltiplicando 
    //il numero di ore del servizio per il costo orario del dipendente che ha svolto il servizio
    //metto costo nel servizio e lo passo al costruttore
    public double calcolaCosto()
    {
        double tot=0;
        for (Servizio s : servizi)
        {
            tot+=s.getCosto();
        }
        return tot;
    }

    public String toString()
    {
        return "Cliente: "+nome+"\tCodice: "+codice+"\tCosto totale: "+calcolaCosto();
    }
}
