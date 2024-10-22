package simulazioni.simulazione_38;

public class Roulotte extends Veicoli
{
    private double peso;
    private String veranda;

    public Roulotte(int codice, String marca, double lunghezza, double larghezza, int posti_letto, double costo_giornaliero, double peso, String veranda) {
        super(codice, marca, lunghezza, larghezza, posti_letto, costo_giornaliero);
        this.peso = peso;
        this.veranda = veranda;
    }

    public String toString()
    {
        return "Roulotte: \t"+super.toString() + "\t" + peso + "\t" + veranda +"\t-";
    }
}
