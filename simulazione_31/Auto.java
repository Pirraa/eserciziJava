package simulazione_31;

public class Auto extends Veicolo
{
    private double capienza;
    private int cilindrata;
    private String categoria;

    public Auto(int codice, String targa, String modello, String marca, double costo,double capienza, int cilindrata, String categoria) 
    {
        super(codice,targa,modello,marca,costo);
        this.capienza = capienza;
        this.cilindrata = cilindrata;
        this.categoria = categoria;
    }

    public String toString()
    {
        return "Auto"+"\t"+super.toString()+capienza+"\t"+cilindrata+"\t"+categoria+"\t-"+"\t-"+"\t-";
    }
}
