package StringPractice;

public class StringPracticeThree
{
    public static void main(String[] args)
    {
        String str1 = "Pyramid";
        String str2 = "Pyramid";
        String str3 = "pyramid";
        String str4 = new String("Pyramid");

        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str1.equalsIgnoreCase(str3));
        System.out.println(str1==str2);
        System.out.println(str1==str3);
        System.out.println(str1.equals(str4));
        System.out.println(str1==str4);

        System.out.println(str1.compareTo(str2));//0
        System.out.println(str1.compareTo(str3));//-32
        System.out.println(str3.compareTo(str1));//32

        String str5 = "china wall";
        String str6 = new String("china tall");//3

        System.out.println(str5.compareTo(str6));

        String str7 = "the great wall of china";
        System.out.println(str7.contains("wall"));//true

        String str8 = "the great wall";
        String str9 = " of china";
        System.out.println(str8.concat(str9));//the great wall of china
        System.out.println(str8 + str9);//the great wall of china




    }
}
