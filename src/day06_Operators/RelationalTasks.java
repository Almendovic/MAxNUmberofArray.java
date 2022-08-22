package day06_Operators;

public class RelationalTasks {
    public static void main(String[] args) {

        /*
        declare speed variable
        speed limit is 50mph
        find out if you are speeding
        true/false


         */

        int speedLimit = 50;
        int currentSpeed = 45;
        boolean isSpeeding = currentSpeed > speedLimit;
        System.out.println("is Speeding: " + isSpeeding);
        System.out.println("is Speeding = " + isSpeeding);

        System.out.println("----------------------------------");
        int number = -4;
        boolean isPositive = number > 0;
        boolean isNegative = number < 0;
        boolean isZero = number ==0;
        System.out.println("isPositive = " + isPositive);
        System.out.println("isNegative = " + isNegative);
        System.out.println("isZero = " + isZero);


        /*
        define a number
        fint out if ti is even or odd
         */

        int num= 5;
        boolean isEven = num % 2==0;
        boolean isOdd  = num % 2!=0;// number2 % 2==1 //isEven != true
        System.out.println("isEven = " + isEven);
        System.out.println("isOdd = " + isOdd);




    }
}
