package simulazioni.simulazione_35;

public class Hockej extends Squadra
{
   
    private double num_falli;
    private double num_goal;

    public Hockej(int codice, String nome, int partite_vinte, int partite_perse, double num_goal, double num_falli)
    {
        super(codice, nome, partite_vinte, partite_perse);
        this.num_falli = num_falli;
        this.num_goal = num_goal;
    }

    public String toString()
    {
        return super.toString() + num_goal + "\t" + num_falli +"\t-\t"+"Hockej";
    }
}
