package Dottori;

public class Paziente extends Persona
{
    private String identificativo;
    public Paziente(String nome,String identificativo)
    {
        super(nome);
        this.identificativo=identificativo;
    }

    public String getId()
    {
        return identificativo;
    }

    public boolean equals(Paziente paziente)
    {
        return  this.identificativo==paziente.getId() && super.equals((Persona)paziente);
    }
}
