package ArithmeticOperator;

import java.util.Scanner;

public class AreaOfTriangle2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        float s;

        System.out.println("Enter values of a, b, c: ");

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        s= (a+b+c)/2f;

        Double area;
        area = Math.sqrt(s*(s-a)*(s-b)*(s-c));

        System.out.println("Area of triangle: "+area);

    }


}
