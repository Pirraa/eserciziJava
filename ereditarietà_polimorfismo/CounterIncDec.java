public class CounterIncDec
{
    public static void main(String[] args)
    {
        BiCounter c = new BiCounter();
        c.reset();
        c.inc();
        c.inc();
        c.dec();
        System.out.println(c.getValue());
    }
}