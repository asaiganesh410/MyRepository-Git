package ConditionsNLoops;

import java.util.Scanner;

public class Loops
{
    public static void main(String[] args) {
        /*
            for loop syntax:

            for(initialisation; condition; increment/decrement){
                //body;
            }
         */
        //Q: Print numbers from 1 to 5
//        for(int num =1; num<=5; num+=1){
//            System.out.println(num);
//        }
//        for(int num =1; num<=5; num+=2){
//            System.out.println(num);
//        }
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        for (int num = 1; num <=n ; num++) {
//            //System.out.print(num+ " ");
//            System.out.println("Hello World");

        /*
            while loop:
            syntax:
            while(condition;){
                //body;
            }
         */
//        int num = 1;
//        while (num<=5){
//            System.out.println(num);
//            num+=1;
//        }
        /*do while loop:
            Syntax:
                do{
                    //body
                }while(condition);
         */
        int n = 1;
        do{
            System.out.println(n);
            n+=1;
        }while(n<=5);
        }
    }
