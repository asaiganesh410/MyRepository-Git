package ConditionsNLoops;

import java.util.Scanner;

public class Calculator
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = 0;
        while(true){
            System.out.println("Enter an operator");
            char opr = sc.next().trim().charAt(0);
            if(opr == '+' || opr == '-' || opr == '*' || opr == '/' || opr == '%'){
                System.out.println("Enter two numbers: ");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();
                if(opr == '+'){
                    ans = num1+num2;
                }
                if(opr == '-'){
                    ans = num1-num2;
                }
                if(opr == '*'){
                    ans = num1*num2;
                }
                if(opr == '/'){
                    if(num2!=0){
                        ans = num1/num2;
                    }
                }
                if(opr == '%'){
                    ans = num1%num2;
                }
            } else if (opr =='X' || opr == 'x')
            {
                break;
            }
            else{
                System.out.println("Invalid operator");
            }
            System.out.println(ans);
        }
    }
}
