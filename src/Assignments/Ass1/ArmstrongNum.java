package Assignments.Ass1;

import java.util.Scanner;

public class ArmstrongNum
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num: ");
        int n = sc.nextInt();
        int temp = n;
        int ans = 0;
        while(n>0){
            int rem = n%10;
            n = n/10;
            ans = ans +(rem*rem*rem);
        }
        if(ans == temp){
            System.out.println(temp +" is an Armstrong Number");
        }
        else {
            System.out.println(temp +" is not an Armstrong Number");
        }
    }
}
