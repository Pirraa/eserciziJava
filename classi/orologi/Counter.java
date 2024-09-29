package orologi;

public class Counter
{
    private int val;
    public Counter() { val = 0; }
    public Counter(int n) { val = n; }
    public void reset() { val = 0; }
    public void inc(){ val++; }
    public int getValue() { return val;}
}