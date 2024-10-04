public class Alieno 
{
    protected int salute; // 0=morto, 100=forza piena
    protected String nome;

    public Alieno(int salute, String nome) 
    {
        this.salute = salute;
        this.nome = nome;
    }
    public int getDanno(){return 0;}
}