package simulazioni.simulazione_29;

public class Dipendente
{
    private int codice;
    private String nome;
    private double costo_orario;

    public Dipendente(int codice, String nome, double costo_orario)
    {
        this.codice = codice;
        this.nome = nome;
        this.costo_orario = costo_orario;
    }

    public String toString()
    {
        return "Codice: " + codice + "\tNome: " + nome + "\tCosto orario: " + costo_orario;
    }

    public double getCosto()
    {
        return costo_orario;
    }
}
