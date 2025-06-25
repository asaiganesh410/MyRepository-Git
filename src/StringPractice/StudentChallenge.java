package StringPractice;

public class StudentChallenge
{
    public static void main(String[] args)
    {
        String str = "programmer@gmail.com";
        String userName = str.substring(0,10);
        System.out.println(userName);
        String domainName = str.substring(11,16);
        System.out.println(domainName);
        System.out.println(domainName.contains("gmail"));
        System.out.println(domainName.equals("gmail"));
        System.out.println(domainName.compareTo("gmail"));
    }
}
