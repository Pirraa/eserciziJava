package eccezzioni;

public class NumberTooBigException extends Exception
{
    public NumberTooBigException() { super();}
    public NumberTooBigException(String s){super(s);}
}


class Thousand
{
    public static int parseInt(String s)
    throws NumberFormatException,NumberTooBigException
    {
        int a = Integer.parseInt(s);
        if (a >= 1000)
        {
            NumberTooBigException e = new NumberTooBigException();
            throw e;
        }
        return a;
    }
}
