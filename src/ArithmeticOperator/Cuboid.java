package ArithmeticOperator;

import java.util.Scanner;

public class Cuboid
{
    public static void main(String[] args)
    {
        int length, breadth, height;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values of Length, Breadth and Height: ");
        length = sc.nextInt();
        breadth = sc.nextInt();
        height = sc.nextInt();

        int area =  2*((length*breadth)+(breadth*height)+(height*length));
        int volume = (length*breadth*height);

        System.out.println("Area: "+area);
        System.out.println("Volume: "+volume);

    }
}
