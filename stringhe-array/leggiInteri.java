public class leggiInteri 
{
    public static void main(String args[])
    {
        if(args.length!=2)
        {
            System.out.println("Inserire due numeri interi");
            System.exit(0);
        }
        int x=Integer.parseInt(args[0]);
        int y=Integer.parseInt(args[1]);
        int somma=x+y;
        System.out.println("La somma di "+x+" e "+y+" è "+somma);
    }
}
