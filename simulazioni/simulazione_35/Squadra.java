package simulazioni.simulazione_35;

public class Squadra
{
    private int codice;
    private String nome;
    private int partite_vinte;
    private int partite_perse;

    public Squadra(int codice, String nome, int partite_vinte, int partite_perse)
    {
        this.codice = codice;
        this.nome = nome;
        this.partite_vinte = partite_vinte;
        this.partite_perse = partite_perse;
    }

    public String toString()
    {
        return nome+"\t"+codice+"\t"+partite_vinte+"\t"+partite_perse+"\t";
    }

    public String getNome()
    {
        return nome;
    }
}