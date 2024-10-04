package eccezzioni;

public class EsempioEccezioni
{
    public static void main(String args[])
    {
        int a = 0;
        String s = args[0];
        try
        {
            a = Integer.parseInt(s);
        }
        catch (Exception ex)
        {
            a = 0;
            System.out.println(ex.getMessage()); 
            System.exit(1);
        }
        System.out.println(a);
    }
}

