package ereditarietà_polimorfismo;

class Counter
{
    protected int val;
    public void reset()
    { val = 0; }
    public void inc()
    { val++; }
    public int getValue()
    { return val;}
}

class BiCounter extends Counter
{
    public void dec()
    { val--; }
}

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