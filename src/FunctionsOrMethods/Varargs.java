package FunctionsOrMethods;

import java.util.Arrays;

public class Varargs
{
    public static void main(String[] args) {
//        fun(2,3,4,5,6,6,7,7);
//        multiple(1,2,"Ganesh", "Kunal", "Manoj");
        demo("ganesh", "kunal", "Manoj");
        //demo();
    }
    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void demo(String ...v){
        System.out.println(Arrays.toString(v));
    }

    static void multiple(int a, int b, String ...v) {
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
