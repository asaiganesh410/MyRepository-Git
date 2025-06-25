package StringPractice;

public class RegularExpressions
{
    public static void main(String[] args)
    {
        String str1 = "a";
        System.out.println(str1.matches("."));//true

        String str2 = "p";
        System.out.println(str2.matches("[abc]"));// ab = false or a = true or p = false

        String str3 = "p";
        System.out.println(str3.matches("[^abc]"));//true
        System.out.println(str3.matches("[a-z0-9]"));//true

        String str4 = "a7";//"k8" = true, //"a$" = false
        System.out.println(str4.matches("[a-z][0-9]"));//true

        String str5 = "p";//"b" = true
        System.out.println(str5.matches("a|b"));//false

        String str6 = "abcd";//"abc" = true
        System.out.println(str6.matches("abc"));//false

        //Meta Characters

        String str7 = "9";//"a" = true
        System.out.println(str7.matches("\\w"));//true

        String str8 = "9";//"a" = false
        System.out.println(str8.matches("\\d"));//true

        String str9 = "t";
        System.out.println(str9.matches("\\d"));//false

        String str10 = "6";//"a" = true
        System.out.println(str10.matches("\\D"));//false

        String str11 = "$";//"a" = false
        System.out.println(str11.matches("\\W"));//true

        String str12 = " ";//"a" = false
        System.out.println(str12.matches("\\s"));//true

        String str13 = " ";//"a" = true
        System.out.println(str13.matches("\\S"));//true


    }
}
