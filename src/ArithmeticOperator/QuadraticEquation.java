package ArithmeticOperator;

import java.util.*;

public class QuadraticEquation
{
    public static void main(String[] args)
    {
        int a,b,c;
        double r1, r2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values of a, b, c:");

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        r1 = (-b+Math.sqrt((b*b)-(4*a*c)))/(2*a);
        r2 = (-b-Math.sqrt((b*b)-(4*a*c)))/(2*a);

        System.out.println("r1 is: "+r1);
        System.out.println("r2 is: "+r2);
        System.out.println("Roots are "+r1+" "+r2);
    }

}
