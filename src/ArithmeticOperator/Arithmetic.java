package ArithmeticOperator;

public class Arithmetic
{
    public static void main(String[] args)
    {
        int a = 14, b= 5;
        int c = a/b;
        int r = a%b;
        System.out.println(c);
        System.out.println(r);

        float d = (float)a/b; //TypeCasting to Float
        int s = a%b;
        System.out.println(d);
        System.out.println(s);

        float e = 14.3f, f= 5.2f;
        float g = e%f;
        System.out.println(g);

        System.out.println((10+2)/2);
        System.out.println(10/(2*5));

    }


}
