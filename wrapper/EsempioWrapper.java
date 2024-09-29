public class EsempioWrapper
{
    public static void main(String args[])
    {
        int x = 35;
        Integer ix = Integer.valueOf(x);
        x = 2*ix.intValue();
        System.out.println("x =" + x);

        int n;
        Integer in = Integer.valueOf("23");
        n = in.intValue();

        n = Integer.parseInt("23");

        int x2 = 35;
        Integer ix2 = new Integer(x);
        x2 = 2 * ix2.intValue();

        System.out.println("ix ="+ix2.toString());
        System.out.println("x ="+Integer.toString(x2));
    }
}
