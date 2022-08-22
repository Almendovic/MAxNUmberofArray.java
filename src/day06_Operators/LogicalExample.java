package day06_Operators;

public class LogicalExample {

    public static void main(String[] args) {

        boolean isWeekend =true;
        boolean isGoodTemp = false;//both need to be true for the result to be true
        boolean doBbq = isWeekend && isWeekend;
        System.out.println("Do bbq:" + doBbq);
        /*
        isWeekend == true && isGoofTemp ==true

         */
         boolean isTeacher = true;
         boolean isPolice = false;
         boolean isFireFighter = false;
         boolean getDiscount = isTeacher || isPolice || isFireFighter;// || pt only one of the boolean need to be true, for the result to be true
        System.out.println("get a discount = " + getDiscount);


        //goal is to check if a number is  5<number<10
        int number = 8;
        System.out.println(number > 5 && number < 10); // true && true -->true
        System.out.println(number > 0 && number < 5); // true && false -->false
        int age =40 ;
        boolean invalidAge= age < 0 || age >120;//false||false= false







    }
}
