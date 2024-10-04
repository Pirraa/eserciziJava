public class Orco extends Alieno
{
    int danno;
    public Orco(int salute, String nome,int danno)
    {
        super(salute,nome);
        this.danno=danno;
    }
    public int getDanno(){return this.danno;}
}