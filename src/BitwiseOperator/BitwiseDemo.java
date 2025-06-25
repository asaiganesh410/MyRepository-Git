package BitwiseOperator;

public class BitwiseDemo
{
    public static void main(String[] args)
    {
        int a = 0b1010;// 10;
        int b = 0b0110; //6;
        int c, d, e;
        c = a&b;
        d = a|b;
        e = a^b;
        System.out.println("AND Result: "+c);
        System.out.println("OR Result: "+d);
        System.out.println("XOR Result: "+e);

        int x =0b1000;
        int y;
        y = x<<2;//y = x<<1;
        System.out.println("Left Shift Result: "+y);

        int k = -0b1010;
        int l = k>>>1;// int l = k>>1;
        System.out.println(String.format("%s",Integer.toBinaryString(k)));
        System.out.println(String.format("%32s",Integer.toBinaryString(l)));

        //Not Operation

        int m = 0b1010;
        int n = ~m;
        System.out.println(String.format("%s",Integer.toBinaryString(n)));
        System.out.println(n);
    }
}
