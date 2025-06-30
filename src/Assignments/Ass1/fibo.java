package Assignments.Ass1;

import java.util.Scanner;

public class fibo
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 1;
        int num = sc.nextInt();
        int count = 2;
        while(num>=count){
            int temp = b;
            b = a + b;
            a = temp;
            count++;
        }
        System.out.println(b);
    }
}
