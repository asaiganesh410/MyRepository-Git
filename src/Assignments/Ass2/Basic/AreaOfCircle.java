package Assignments.Ass2.Basic;

import java.util.Scanner;

public class AreaOfCircle
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of a circle: ");
        float radius = sc.nextFloat();
        float area = ((3.14159f)*(radius * radius));
        System.out.println("Area of circle: "+area);
    }
}
