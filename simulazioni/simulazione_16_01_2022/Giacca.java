package simulazioni.simulazione_16_01_2022;

public class Giacca extends Articolo
{
    private int num_tasche;
    private float sconto;

    public Giacca(int codice,String marca,char taglia,String modello,int num_tasche,float sconto,float costo)
    {
        super(codice,marca,taglia,modello,costo);
        this.num_tasche=num_tasche;
        this.sconto=sconto;
    }

    public String toString()
    {
        return "Giacca"+"\t"+super.toString()+num_tasche+"\t-\t"+costo+"\t"+sconto;
    }
    
}
