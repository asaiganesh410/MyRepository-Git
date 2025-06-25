package BitwiseOperator;

public class SwappingOfTwoNumbers
{
    public static void main(String[] args)
    {
        int a = 9, b = 12;
        System.out.println("Before  Swapping a: "+a);
        System.out.println("Before  Swapping b: "+b);

        a = a^b;
        b = a^b;
        a = a^b;

        System.out.println("After  Swapping a: "+a);
        System.out.println("After  Swapping b: "+b);
    }
}
