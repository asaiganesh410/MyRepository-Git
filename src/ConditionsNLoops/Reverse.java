package ConditionsNLoops;

public class Reverse
{
    public static void main(String[] args) {
        int num = 123456;
        int res = 0;
        while(num>0){
            int rem = num % 10;
            num= num/10;
            res = res * 10 + rem;
        }
        System.out.println(res);
    }
}
