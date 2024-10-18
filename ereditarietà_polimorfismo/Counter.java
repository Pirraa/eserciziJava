class Counter
{
    protected int val;
    public Counter(){ val = 0; }
    public Counter(int i) {
        //TODO Auto-generated constructor stub
    }
    public void reset()
    { val = 0; }
    public void inc()
    { val++; }
    public int getValue()
    { return val;}
}