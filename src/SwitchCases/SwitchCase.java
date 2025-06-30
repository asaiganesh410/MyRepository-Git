package SwitchCases;

import java.util.Scanner;

public class SwitchCase
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Program to describe fruit:

//        String fruit = sc.next();
//        switch(fruit){
//            case "Mango":
//                System.out.println("King of the fruit");
//                break;
//            case "Apple":
//                System.out.println("A sweet red fruit");
//                break;
//            case "Orange":
//                System.out.println("Round fruit");
//                break;
//            case "Grapes":
//                System.out.println("Small fruit");
//                break;
//            default:
//                System.out.println("Not a valid fruit");
//        }
        //Enchanced Switch Case
//        switch (fruit){
//            case "Mango" -> System.out.println("King of the fruit");
//            case "Apple" -> System.out.println("A sweet red fruit");
//            case "Orange" -> System.out.println("Round fruit");
//            case "Grapes" -> System.out.println("Small fruit");
//            default -> System.out.println("Not a valid fruit");
//        }
        /* Program to Display day Name b/w 1 & 7:

        int day = sc.nextInt();
        switch (day){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thrusday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
        }*/
        //Program to display Weekdays and Weekends:
        int day = sc.nextInt();
//        switch (day) {
//            case 1:
//            case 2:
//            case 3:
//            case 4:
//            case 5:
//                 System.out.println("Weekdays");
//                 break;
//            case 6:
//            case 7:
//                System.out.println("Weekend");
//                break;
//        }
        //Using enhanced Switch case:
        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekdays");
            case 6, 7 -> System.out.println("Weekend");
        }
    }
}
