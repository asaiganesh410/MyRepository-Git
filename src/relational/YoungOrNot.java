package relational;

import java.util.Scanner;

public class YoungOrNot
{
    public static void main(String[] args)
    {
        int age;
        System.out.println("Enter age of the person");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        if(age>=14 && age<=55)
        {
            System.out.println("Young Person");
        }
        else
        {
            System.out.println("Not a Young person");
        }
    }
}
