package simulazioni.simulazione_38;

public class Veicoli 
{
    private int codice;
    private String marca;
    private double lunghezza;
    private double larghezza;
    private int posti_letto;
    private double costo_giornaliero;

    public Veicoli(int codice, String marca, double lunghezza, double larghezza, int posti_letto, double costo_giornaliero) {
        this.codice = codice;
        this.marca = marca;
        this.lunghezza = lunghezza;
        this.larghezza = larghezza;
        this.posti_letto = posti_letto;
        this.costo_giornaliero = costo_giornaliero;
    }

    public String toString()
    {
        return codice +"\t"+marca+"\t"+larghezza+"\t"+lunghezza+"\t"+posti_letto+"\t"+costo_giornaliero;
    }

    public Double getCosto()
    {
        return costo_giornaliero;
    }

    public int getCodice()
    {
        return codice;
    }
}
