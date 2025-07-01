package FunctionsOrMethods;

import java.util.Scanner;

public class StringExample
{
    public static void main(String[] args) {
//        String message = greet();
//        System.out.println(message);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String naam = sc.next();
        String personalised = MyGreet(naam);
        System.out.println(personalised);
    }

    static String MyGreet(String name) {
        String message = "Hello " + name;
        return message;
    }


    static String greet() {
        String greeting = "How are you?";
        return greeting;
    }

}
