package ereditarietà_polimorfismo;

public class Persona
{
    protected String nome;
    protected int anni;
    public Persona(String n, int a){ nome=n; anni=a;}
    public void print()
    {
        System.out.print("Mi chiamo " + nome);
        System.out.println(" e ho " + anni + "anni");
    }
}


class Studente extends Persona
{
    protected int matr;
    public Studente(String n, int a, int m)
    {
        super(n,a);
        matr=m;
    }
    public void print()
    {
        super.print(); // stampa nome ed età
        System.out.println("Matr = " + matr);
    }
}