package simulazioni.simulazione_16_01_2022;

public class Articolo
{
    //10.58
    private int codice;
    private String marca;
    private char taglia;
    private String modello;
    protected float costo;

    public Articolo(int codice,String marca,char taglia,String modello,float costo)
    {
        this.modello=modello;
        this.marca=marca;
        this.codice=codice;
        this.taglia=taglia;
        this.costo=costo;
    }

    public String toString()
    {
        return codice+"\t"+marca+"\t"+modello+"\t"+taglia+"\t";
    }

    public float getCosto()
    {
        return costo;
    }
}