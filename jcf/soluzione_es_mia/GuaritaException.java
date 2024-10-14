package jcf.soluzione_es_mia;

public class GuaritaException extends Exception
{
    public GuaritaException() { super();}
    public GuaritaException(String s){stampa(s);}
    public void stampa(String s)
    {
        System.out.println("La patologia "+s+" è guarita");
    }
}
