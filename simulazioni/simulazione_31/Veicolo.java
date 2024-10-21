package simulazioni.simulazione_31;

public class Veicolo 
{
    private int codice;
    private String targa;
    private String modello;
    private String marca;
    private double costo;

    public Veicolo(int codice, String targa, String modello, String marca, double costo) 
    {
        this.codice = codice;
        this.targa = targa;
        this.modello = modello;
        this.marca = marca;
        this.costo = costo;
    }

    public String toString()
    {
        return targa+"\t"+codice+"\t"+modello+"\t"+marca+"\t"+costo+"\t";
    }

    public double getCosto()
    {
        return this.costo;
    }

    public String getTarga()
    {
        return this.targa;
    }

}
