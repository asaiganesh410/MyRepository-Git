package Assignments.Ass2.Basic;

import java.util.Scanner;

public class PeriOfCircle
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of a circle: ");
        float radius = sc.nextFloat();
        float circle = (2*(3.14159f) * radius);
        System.out.println("Perimeter of circle: "+circle);
    }
}
