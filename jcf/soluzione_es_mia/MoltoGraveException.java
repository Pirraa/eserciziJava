package soluzione_es_mia;

public class MoltoGraveException extends Exception
{
    public MoltoGraveException() { super();}
    public MoltoGraveException(String s){stampa(s);}
    public void stampa(String s)
    {
        System.out.println("La patologia "+s+" è guarita");
    }
}

