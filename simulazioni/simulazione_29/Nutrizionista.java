package simulazioni.simulazione_29;

public class Nutrizionista extends Dipendente
{
    private int telefono;
    private boolean medico;
    int appuntamenti;

    public Nutrizionista(int codice, String nome, double costo_orario, int telefono, boolean medico, int appuntamenti)
    {
        super(codice, nome, costo_orario);
        this.telefono = telefono;
        this.medico = medico;
        this.appuntamenti = appuntamenti;
    }

    public String toString()
    {
        return "Nutrizionista\t"+super.toString()+"\tTelefono: "+telefono+"\tMedico: "+medico+"\tAppuntamenti: "+appuntamenti;
    }
    
}
