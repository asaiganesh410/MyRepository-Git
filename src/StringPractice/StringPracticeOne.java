package StringPractice;

public class StringPracticeOne
{
    public static void main(String[] args)
    {
        String str = new String("Intellij");
        int l = str.length();
        System.out.println(l);

        String str2 = str.toUpperCase();
        System.out.println(str2);

        String str3 = str.toLowerCase();
        System.out.println(str3);

        String str4 = str.trim();
        System.out.println(str4);

        String str5 = str.substring(3);
        System.out.println(str5);

        String str6 = str.substring(3,6);
        System.out.println(str6);

        String str7 = str.replace('l', 'm');
        System.out.println(str7);



    }
}
