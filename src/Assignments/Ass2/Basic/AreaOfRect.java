package Assignments.Ass2.Basic;

import java.util.Scanner;

public class AreaOfRect
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length and Width of a rectangle: ");
        int len = sc.nextInt();
        int wid = sc.nextInt();
        int area = len * wid;
        System.out.println("Area of Rectangle: "+area);
    }
}
