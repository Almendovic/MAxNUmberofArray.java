package Day18Loops;

import java.util.Scanner;

public class NegativeNumber {
    public static void main(String[] args) {

        /*
        write a program that will ask the user to enter 5 numbers and print how many were positive and how many were negative
         */
        Scanner input=new Scanner(System.in);
       int count=0;
       int positive=0;
       int negative=0;
       while (count++ <5){
           System.out.println("Enter 5 numbers");
           int enter=input.nextInt();


           if(enter<0){
               negative++;
           } else if (enter>0) {
               positive++;
           }
           System.out.println("Negative NUmbers " +negative);
           System.out.println("Positive Number " +positive);
       }











    }
}
