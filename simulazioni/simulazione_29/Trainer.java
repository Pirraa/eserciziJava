package simulazioni.simulazione_29;

public class Trainer extends Dipendente
{
    private int ore;
    private String specialità;

    public Trainer(int codice, String nome, double costo_orario, int ore, String specialità)
    {
        super(codice, nome, costo_orario);
        this.ore = ore;
        this.specialità = specialità;
    }

    public String toString()
    {
        return "Trainer\t"+super.toString()+"\tOre: "+ore+"\t\tSpecialità: "+specialità;
    }
}
