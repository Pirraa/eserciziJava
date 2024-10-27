package simulazioni.simulazione_16_01_2022;

public class Piumino extends Articolo
{
    private int peso;
    private float sconto;

    public Piumino(int codice,String marca,char taglia,String modello,int peso,float sconto,float costo)
    {
        super(codice,marca,taglia,modello,costo);
        this.peso=peso;
        this.sconto=sconto;
    }

    public String toString()
    {
        return "Piumino"+"\t"+super.toString()+"\t-\t"+peso+"\t"+costo+"\t"+sconto;
    }
}
