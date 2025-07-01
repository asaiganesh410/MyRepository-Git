package FunctionsOrMethods;

import static java.util.Collections.swap;

public class Swap
{
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        swap(a,b);
        System.out.println(a +" "+ b);

        String name = "Ganesh";
        changeName(name);
        System.out.println(name);
    }

    static void changeName(String naam) {
        naam = "Kunal";
    }

    static void swap(int c, int d) {
        int temp = c;
        c = d;
        d = temp;
    }
}
