public class Marshmallow extends Alieno
{
    int danno;
    public Marshmallow(int salute, String nome,int danno)
    {
        super(salute,nome);
        this.danno=danno;
    }
    public int getDanno(){return this.danno;}
}