package FunctionsOrMethods;

public class PassingValue
{
    public static void main(String[] args) {
        String chacha = "Iron Man";
        greet(chacha);
    }

    static void greet(String naam) {
        System.out.println(naam);
    }
}
