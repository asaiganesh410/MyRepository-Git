package Assignments.Ass2.Basic;

import java.util.Scanner;

public class AreaOfEquiTriangle
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a side of an Equilateral Triangle: ");
        int a = sc.nextInt();
        double area = (Math.sqrt(3)*(a*a))/4;
        System.out.println("Area of an Equilateral Triangle: "+area);
    }
}
