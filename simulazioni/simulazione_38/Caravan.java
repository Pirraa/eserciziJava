package simulazioni.simulazione_38;

public class Caravan extends Veicoli
{
    private int potenza;

    public Caravan(int codice, String marca, double lunghezza, double larghezza, int posti_letto, double costo_giornaliero, int potenza) {
        super(codice, marca, lunghezza, larghezza, posti_letto, costo_giornaliero);
        this.potenza = potenza;
    }

    public String toString()
    {
        return "Caravan: \t"+super.toString() + "\t-"+"\t-\t"+ potenza;
    }
}
