package simulazione_37;

public class Tennis extends Campo
{
    private float temperatura;
    private String terreno;

    public Tennis(int codice, String nome, float larghezza, float lunghezza, float costo,float temperatura,String terreno) 
    {
        super(codice, nome, larghezza, lunghezza, costo);
        this.temperatura = temperatura;
        this.terreno = terreno;
    }

    public String toString()
    {
        return super.toString() +"\t"+temperatura+"\t"+terreno+"\t"+getCosto();
    }
}
