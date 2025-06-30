package Assignments.Ass2.Basic;

import java.util.Scanner;

public class AreaOfParallelogram
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base and height of a Parallelogram: ");
        int base = sc.nextInt();
        int height = sc.nextInt();
        int area = base * height;
        System.out.println("Area of Parallelogram: "+area);
    }
}
