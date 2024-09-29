
class MainCounter
{
    public static void main(String[] args)
    {
        int n;
        StaticCounter.reset();
        StaticCounter.inc();
        n = StaticCounter.getValue();
        System.out.println(n);

        Counter c1, c2;
        c1 = new Counter();
        c2 = new Counter(5);
        c1.inc(); 
        c2.inc(6);
        n = c1.getValue() + c2.getValue();
        System.out.println(n);
    }
}
