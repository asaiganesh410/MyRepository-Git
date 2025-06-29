package ConditionsNLoops;

public class ConditionsNloops
{
    public static void main(String[] args)
    {
        /*
            Syntax of if statements:
            if(boolean expression T or F)
            {
                //body
            }
            else
            {
                //do this
            }
         */
          int salary = 25400;
//        if(salary>10000){
//            salary = salary + 2000;
//        }
//        else{
//            salary = salary + 1000;
//        }
//        System.out.println(salary);

        //Multiple if-else statements:
        if(salary>10000){
            salary = salary + 2000;
        } else if (salary>20000) {
            salary = salary + 3000;
        } else{
            salary = salary + 1000;
        }
        System.out.println(salary);

    }
}
