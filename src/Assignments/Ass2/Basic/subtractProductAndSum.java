package Assignments.Ass2.Basic;

public class subtractProductAndSum
{
    public static void main(String[] args) {
        int n = 234;
        int p =1,s =0;
        int result = 0;
        while(n>0){
            int rem = n%10;
            p = p*rem;
            s = s+rem;
            n =n/10;
        }
        result = p-s;
        System.out.println(result);
    }

}
