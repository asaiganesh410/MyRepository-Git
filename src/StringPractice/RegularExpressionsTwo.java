package StringPractice;

public class RegularExpressionsTwo
{
    public static void main(String[] args)
    {
        String str1 = "abc def";
        System.out.println(str1.matches(".*"));//true

        String str2 = "abcdef";//"ab6cdef" = false //"abBcdef" = false
        System.out.println(str2.matches("[a-z]*"));//true

        String str3 = "";
        System.out.println(str3.matches(".*"));//true 0 or more

        String str4 = "";
        System.out.println(str4.matches(".+"));//false 1 or more

        String str5 = "abc";//"ab" = false /"accb" = false
        System.out.println(str5.matches("[abc]{3}"));//true

        String str6 = "abcbcab";// "aaabbbccc" = false must be B/W 3,7
        System.out.println(str6.matches("[abc]{3,7}"));//true

        String str7 = "john@gmail.com";
        System.out.println(str7.matches(".*gmail.*"));//true
        System.out.println(str7.matches("\\w*@gmail(.*)"));//true
    }

}
