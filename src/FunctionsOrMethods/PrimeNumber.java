package FunctionsOrMethods;

import java.util.Scanner;

public class PrimeNumber
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        boolean ans = isPrime(n);
//        System.out.println(ans);
        System.out.println(isArmStrong(n));
    }

     static boolean isPrime(int n) {
        if(n<=1){
            return false;
        }
        int c = 2;
        while(c*c <=n){
            if(n%c==0){
                return false;
            }
            c++;
        }
        return c * c > n;
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
