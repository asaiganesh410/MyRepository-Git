package Assignments.Ass2.Basic;

import java.util.Scanner;

public class VolumeOfCone
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius and height of a cone: ");
        int r = sc.nextInt();
        int h = sc.nextInt();
        float vol = ((3.14159f)*(r*r)*h)/3;
        System.out.println("Volume of a cone: "+vol);
    }
}
