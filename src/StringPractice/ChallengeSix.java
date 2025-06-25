package StringPractice;

public class ChallengeSix
{
    public static void main(String[] args)
    {
        String str = " abc    def  gh  ijk ";
        String str1 = str.trim();
        System.out.println(str1);
        System.out.println(str1.replaceAll("\\s+", " "));

        System.out.println(str);
        System.out.println(str.replaceAll("\\s+", " ").trim());
    }
}
