package FunctionsOrMethods;

public class MethodOverloading
{
    public static void main(String[] args) {
        fun(34);
        fun("Ganesh");
        int ans = sum(5,6);
        System.out.println(ans);
        int res = sum(2,3,4);
        System.out.println(res);
    }
    static int sum(int a, int b){
        return a + b;
    }
    static int sum(int a, int b, int c){
        return a + b + c;
    }
    static void fun(int a){
        System.out.println("First one");
        System.out.println(a);
    }
    static void fun(String name){
        System.out.println("Second one");
        System.out.println(name);
    }
}
