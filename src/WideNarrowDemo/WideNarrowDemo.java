package WideNarrowDemo;

public class WideNarrowDemo
{
    public static void main(String[] args)
    {
        byte b=10;
        short s = 10;
        int i = 10;
        long l = 10;
        float f = 10;
        double d = 10;
        char c = 10;
        boolean b1 = true;

        //Narrowing
        b=(byte)s;
        i = (int)f;
        //Widening
        i=b;
        l=b;
        f=b;
        d=b;

        }
    }
