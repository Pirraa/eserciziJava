package simulazione_31;

public class Furgone extends Veicolo
{
    private boolean rimorchio;
    private int num_posti;
    private boolean vano;

    public Furgone(int codice, String targa, String modello, String marca, double costo,boolean rimorchio,int num_posti, boolean vano) 
    {
        super(codice,targa,modello,marca,costo);
        this.rimorchio = rimorchio;
        this.num_posti = num_posti;
        this.vano = vano;
    }

    public String toString()
    {
        return "Furgone"+"\t"+super.toString()+"-\t"+"-\t"+"-\t"+rimorchio+"\t"+num_posti+"\t"+vano;
    }
}
