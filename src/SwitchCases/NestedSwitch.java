package SwitchCases;

import java.util.Scanner;

public class NestedSwitch
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int empID = sc.nextInt();
        String dept = sc.next();
        switch (empID) {
            case 1 -> System.out.println("Kunal Kushwaha");
            case 2 -> System.out.println("Saiganesh Animella");
            case 3 -> {
                System.out.println("Employee num 3");
                switch (dept) {
                    case "IT" -> System.out.println("IT Department");
                    case "Management" -> System.out.println("Manaement Department");
                    default -> System.out.println("Not a correct Department");
                }
            }
            default -> System.out.println("Not an empID");
        }
    }
}
