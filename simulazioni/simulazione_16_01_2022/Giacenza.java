package simulazioni.simulazione_16_01_2022;

public class Giacenza 
{
    private int codice_articolo;
    private int quantità;
    private float costo;

    public Giacenza(int codice_articolo,int quantità,float costo)
    {
        this.codice_articolo=codice_articolo;
        this.quantità=quantità;
        this.costo=costo;
    }

    public String toString()
    {
        return "("+codice_articolo+","+quantità+")";
    }

    public int getQuantità()
    {
        return quantità;
    }

    public float calcolaCosto()
    {
        return costo*quantità;
    }
}
