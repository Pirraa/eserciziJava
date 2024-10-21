public class Counter2
{
    protected int val;
    public Counter2(){ val = 0; }
    public void reset()
    { val = 0; }
    public void inc()
    { val++; }
    public int getValue()
    { return val;}
}