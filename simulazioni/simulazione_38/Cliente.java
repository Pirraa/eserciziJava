package simulazioni.simulazione_38;
import java.util.*;

public class Cliente
{
    private int codice;
    private String nome;
    private String cognome;
    private String indirizzo;
    List<Noleggio> noleggi;

    public Cliente(int codice, String nome, String cognome, String indirizzo) {
        this.codice = codice;
        this.nome = nome;
        this.cognome = cognome;
        this.indirizzo = indirizzo;
        this.noleggi = new ArrayList<>();
    }

    public void addNoleggio(Noleggio n) {
        noleggi.add(n);
    }

    public String toString()
    {
        return codice +"\t"+nome+"\t"+cognome+"\t"+indirizzo+"\t"+noleggi;
    }
}
