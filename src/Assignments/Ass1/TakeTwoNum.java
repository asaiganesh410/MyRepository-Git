package Assignments.Ass1;

import java.util.Scanner;

public class TakeTwoNum
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        String opr = sc.next();
        if(opr.equals("+")){
            System.out.println(num1+num2);
        } else if (opr.equals("-")) {
            System.out.println(num1-num2);
        } else if (opr.equals("*")) {
            System.out.println(num1*num2);
        } else if (opr.equals("/")) {
            System.out.println(num1/num2);
        }else if (opr.equals("%")){
            System.out.println(num1%num2);
        }
    }
}
