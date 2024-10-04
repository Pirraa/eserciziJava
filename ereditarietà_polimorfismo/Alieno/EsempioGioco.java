public class EsempioGioco 
{
    public static void main(String[] args)
    {
        GruppoAlieni ga=new GruppoAlieni(3);
        ga.aggiungiAlieno(new Serpente(100,"cobra",10),0);
        ga.aggiungiAlieno(new Orco(200,"shreck",6),1);
        ga.aggiungiAlieno(new Marshmallow(300, "cioccolatino", 1),2);
        System.out.println("Danno: "+ga.calcolaDanno());
    }
}