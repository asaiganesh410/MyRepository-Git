package Assignments.Ass1;

import java.util.Scanner;

public class OutputInUSD
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount in Rupees");
        float inr = sc.nextFloat();
        float usd = inr * (0.011695f);// as per 2025-06-30 1 Indian rupee = 0.011695 USD
        System.out.println(inr+ " Indian Rupees = "+ usd + " US Dollars");
    }
}
