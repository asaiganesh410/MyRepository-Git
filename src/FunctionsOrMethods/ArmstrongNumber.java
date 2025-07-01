package FunctionsOrMethods;

import java.util.Scanner;

public class ArmstrongNumber
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a num:");
//        int n = sc.nextInt();
//        boolean ans = isArmStrong(n);
//        System.out.println(ans);
        for (int i = 1; i < 1000; i++) {
            if(isArmStrong(i)){
                System.out.println(i);
            }
        }
    }
    static boolean isArmStrong(int n) {
        int temp = n;
        int res = 0;
        while (n>0) {
            int rem = n % 10;
            res = res + (rem * rem * rem);
            n = n / 10;
        }
        return temp == res;
    }
}
