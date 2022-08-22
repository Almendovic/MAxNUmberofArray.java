package Day18Loops;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        /*
        write a program that calculates the factorial of a number:
    ex: 5! = 5 * 4 * 3 * 2 * 1 = 120
         */

           Scanner input=new Scanner(System.in);
          System.out.println("Enter Number");
           int num=input.nextInt();
           int factorial=1;

           while(num>1){
               factorial*=num--;
               }
        System.out.println(factorial);


    }
}
