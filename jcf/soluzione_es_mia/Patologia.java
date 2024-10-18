package soluzione_es_mia;
public class Patologia 
{
    private String nome;
    private int gravità;

    public Patologia(String nome, int gravità) 
    {
        this.nome = nome;
        this.gravità = gravità;
    }

    public String getNome() 
    {
        return nome;
    }

    public int getGravità() 
    {
        return gravità;
    }

    public void aggrava() throws MoltoGraveException
    {
        if(gravità<10)
            gravità++;
        else
            throw new MoltoGraveException(this.nome);
    }

    public void attenua() throws GuaritaException
    {
        if(gravità>1)
            gravità--;
        else
            throw new GuaritaException(this.nome);
    }

    public void confronta(Object o)
    {
        if(o instanceof Patologia)
        {
            Patologia p = (Patologia) o;
            if(p.getNome().equals(nome))
                System.out.println("Le patologie sono uguali");
            else
                System.out.println("Le patologie non sono uguali");
        }
    }

    public String toString()
    {
        return "Nome: " + nome + " Gravità: " + gravità;
    }

    /*
     * aggrava() e attenua(): che aumentano o diminuiscono la
gravit`a di 1 grado se `e possibile, o altrimenti lanciano la
MoltoGraveException (gravit`a 10) e la GuaritaException (gravit`a
1) rispettivamente
• equals(Object o): che controlla se l’oggetto passato (una
patologia) `e uguale a quello su cui `e stato invocato (per nome)
• toString(): che restituisce i valori degli attributi
     */

}


