package Assignments.Ass1;

import java.util.Scanner;

public class SimpleInterest
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();//p = principle
        float r = sc.nextFloat();// r = rate
        int t = sc.nextInt();//  t = time
        double si = (p * t * r)/100; //si = simple interest
        System.out.println("Simple Interest: "+si);
    }
}
