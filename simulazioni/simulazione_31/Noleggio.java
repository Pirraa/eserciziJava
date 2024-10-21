package simulazioni.simulazione_31;

public class Noleggio
{
    private int veicolo;
    @SuppressWarnings("unused")
    private int giorni;

    public Noleggio(int veicolo,int giorni)
    {
        this.veicolo=veicolo;
        this.giorni=giorni;
    }

    public int getVeicolo()
    {
        return veicolo;
    }
}
