package simulazioni.simulazione_38;

public class Noleggio 
{
    int codice_veicolo;
    int num_giorni;

    public Noleggio(int codice_veicolo, int num_giorni) {
        this.codice_veicolo = codice_veicolo;
        this.num_giorni = num_giorni;
    }

    public String toString()
    {
        return "( "+codice_veicolo +" "+num_giorni+" )";
    }
}
