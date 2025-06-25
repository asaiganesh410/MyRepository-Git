package ArithmeticOperator;

import java.util.*;

public class AreaOfTriangle1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        float base;
        float height;
        float area;

        System.out.println("Enter value of Base & Height: ");

        base = sc.nextFloat();
        height = sc.nextFloat();

        area = (base * height)/2;

        System.out.println("Area of Triangle: " + area);
    }

}
