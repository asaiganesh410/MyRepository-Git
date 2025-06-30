package Assignments.Ass2.Basic;

import java.util.Scanner;

public class AreaOfRhombus
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter p-diagonal and q-diagonal of a Rhombus: ");
        int p = sc.nextInt();
        int q = sc.nextInt();
        int area = (p * q)/2;
        System.out.println("Area of Rhombus: "+area);
    }
}
