package simulazione_37;

public class Squash extends Campo
{
    private float altezza;
    private int piano;

    public Squash(int codice, String nome, float larghezza, float lunghezza, float costo,float altezza,int piano) 
    {
        super(codice, nome, larghezza, lunghezza, costo);
        this.altezza = altezza;
        this.piano = piano;
    }

    public String toString()
    {
        return super.toString() + "\t-\t-\t" + altezza + "\t" + piano+"\t"+getCosto();
    }
}
