package Assignments.Ass2.Basic;

import java.util.Scanner;

public class FacOfaNum
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        for(int i =1; i<=n;i++){
            if(n%i==0){
                System.out.println(i);
            }
        }
    }
}
