package Assignments.Ass1;

import java.util.Scanner;

public class PalindromeNum
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int temp = num;
        int res = 0;
        while(num>0){
            int rem = num%10;
            num /=10;
            res = (res*10)+rem;
        }
        if(res == temp){
            System.out.println(temp +" is Palindrome Number");
        }
        else {
            System.out.println(temp +" is not a Palindrome Number");
        }
    }
}
