package Assignments.Ass1;

import java.util.Scanner;

public class LarNumOfTwo
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 Numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        if(num1>num2){
            System.out.println("Largest Number: "+num1);
        }
        else {
            System.out.println("Largest Number: "+num2);
        }
    }
}
