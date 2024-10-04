package Dottori;

public class Dottore extends Persona
{
    private String specializzazione;
    private double parcella;

    public Dottore(String nome,String specializzazione,double parcella)
    {
        super(nome);
        this.specializzazione=specializzazione;
        this.parcella=parcella;
    }

    public String getSpec()
    {
        return specializzazione;
    }

    public double getParcella()
    {
        return parcella;
    }

    public boolean equals(Dottore dottore)
    {
        return this.parcella==dottore.getParcella() && this.specializzazione.equalsIgnoreCase(dottore.getSpec()) && super.equals((Persona)dottore);
    }
}
