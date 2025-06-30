package Assignments.Ass2.Basic;

import java.util.Scanner;

public class SumOfNums
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =1;
        while(true){
            int i = sc.nextInt();
                n++;
            if (i==0) {
                break;
            }
            System.out.println(n);
        }
    }
}
