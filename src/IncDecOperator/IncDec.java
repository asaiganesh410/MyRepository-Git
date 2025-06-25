package IncDecOperator;

public class IncDec
{
    public static void main(String[] args)
    {
        int x = 5, y;
        y = x++;
        System.out.println(x+" "+y);

        int a=5, b= 4, c, d;
        c = 2*a++ + 3* ++b;
        System.out.println(c);

        d = 2*a++ + 3* ++a;
        System.out.println(d);

        float e = 3.5f;
        e++;
        System.out.println(e);

        char f = 'A';
        f++;
        System.out.println(f);

        byte g = 3;
        g++;
        System.out.println(g);




    }
}
