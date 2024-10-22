package simulazioni.simulazione_35;

public class Pallamano extends Squadra
{
    private double num_reti;
    public Pallamano(int codice, String nome, int partite_vinte, int partite_perse, double num_reti)
    {
        super(codice, nome, partite_vinte, partite_perse);
        this.num_reti = num_reti;
    }

    public String toString()
    {
        return super.toString() + "-\t" +"-\t"+num_reti+"\tPallamano";
    }
}