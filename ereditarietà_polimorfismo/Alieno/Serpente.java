public class Serpente extends Alieno
{
    int danno;
    public Serpente(int salute, String nome,int danno)
    {
        super(salute,nome);
        this.danno=danno;
    }
    public int getDanno(){return this.danno;}
}
