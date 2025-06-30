package Assignments.Ass2.Basic;

import java.util.Scanner;

public class AreaOfTriangle
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Base & Height: ");
        int base = sc.nextInt();
        int height = sc.nextInt();
        int area = (base * height)/2;
        System.out.println("Area of triangle: "+area);
    }
}
