package StringPractice;

public class ChallengeTwo
{
    public static void main(String[] args)
    {
        int b = 100034501;
        String str = String.valueOf(b);// str = b+"";
        System.out.println(str);
        System.out.println(str.matches("[01]+"));
    }
}
