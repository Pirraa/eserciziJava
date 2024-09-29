class Orologio
{
    Counter[] lancette = new Counter[2];
    public Orologio()
    {
        lancette[0] = new Counter();
        lancette[1] = new Counter();
    }
    public void reset()
    {
        lancette[0].reset();
        lancette[1].reset();
    }
    public int getMinuti()
    {
        return lancette[0].getValue();
    }
    public int getOre()
    {
        return lancette[1].getValue();
    }
    public void tic()
    {
        lancette[0].inc();
        if (lancette[0].getValue() == 60)
        {
            lancette[0].reset();
            lancette[1].inc();
        }
        if (lancette[1].getValue() == 24)
        lancette[1].reset();
    }
}

class Counter
{ 
    private int val;
    public Counter() { val = 0; } //overloading
    public Counter(int n) 
    { 
        val =n;
    }
    public void reset() { val = 0; }
    public void inc(){ val++; }
    public void inc(int n){ val=val+n; }
    public int getValue() { return val;}
    public void copy(Counter x) { val = x.val; }
    public boolean equals(Counter x){return val == x.val;}
}

public class OrologioArray
{
    public static void main(String[] args)
    {
        Orologio o = new Orologio();
        for (int i = 0; i < 150; i++)
            o.tic();
        System.out.println(o.getOre() + ":" + o.getMinuti());
        o.reset();
        System.out.println(o.getOre() + ":" + o.getMinuti());
    }
}





