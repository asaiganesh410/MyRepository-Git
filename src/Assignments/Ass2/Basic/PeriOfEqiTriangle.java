package Assignments.Ass2.Basic;

import java.util.Scanner;

public class PeriOfEqiTriangle
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side of an equilateral: ");
        float side = sc.nextFloat();
        float perimeter = 3*side;
        System.out.println("Perimeter of an equilateral: "+perimeter);
    }
}
