package simulazione_37;

public class Campo
{
    private int codice;
    private String nome;
    private float larghezza;
    private float lunghezza;
    private float costo;
    protected int prenotazioni;

    public Campo(int codice, String nome, float larghezza, float lunghezza, float costo) 
    {
        this.codice = codice;
        this.nome = nome;
        this.larghezza = larghezza;
        this.lunghezza = lunghezza;
        this.costo = costo;
    }

    public String toString()
    {
        return nome +"\t"+codice+"\t"+larghezza+"\t"+lunghezza;
    }

    public float getCosto()
    {
        return costo;
    }

    public void addPrenotazione()
    {
	    prenotazioni++;	
    }	
    	
    public float incasso()
    {
	   return prenotazioni*costo;
    }
}
