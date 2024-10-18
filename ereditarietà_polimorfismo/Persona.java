public class Persona
{
    protected String nome;
    protected String cognome;
    public Persona(String n, String c){ nome=n; cognome=c;}
    public void print()
    {
        System.out.print("Mi chiamo " + nome + cognome);
    }
}


class Studente extends Persona
{
    protected int matr;
    public Studente(String n, String c, int m)
    {
        super(n,c);
        matr=m;
    }
    public void print()
    {
        super.print(); // stampa nome ed età
        System.out.println("Matr = " + matr);
    }
}