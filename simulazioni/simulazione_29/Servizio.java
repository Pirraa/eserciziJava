package simulazioni.simulazione_29;

public class Servizio 
{
    @SuppressWarnings("unused")
    private int codice;
    @SuppressWarnings("unused")
    private double ore;
    private double costo;

    public Servizio(int codice, double ore,double costo)
    {
        this.codice = codice;
        this.ore = ore;
        this.costo=costo;
    }

    public double getCosto()
    {
        return this.costo;
    }
}
