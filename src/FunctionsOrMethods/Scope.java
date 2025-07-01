package FunctionsOrMethods;

public class Scope
{
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String name = "Kunal";
        {
            /*int a = 98; already initialised outside the block in the same method,
            you cannot initialise it again.
             */
            a =100;//reassign the origin re value to some other value.
            System.out.println(a);
            int c = 99;
            name = "Ganesh";
            System.out.println(name);
            //values initialised in this block, will remains in the block
        }
        System.out.println(a);
        System.out.println(name);
//      System.out.println(c); //cannot use outside the block
        for (int i = 0; i < 4; i++) {
            System.out.println(i);
            int num = 10;
            //int a =  5;
            a = 1000;
        }
        System.out.println(a);
    }
    static void random(int marks) {
        int num = 67;
        System.out.println(num);
        System.out.println(marks);
        //this change will only be valid in this function scope only
    }

}
