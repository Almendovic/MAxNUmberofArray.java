package day22_Array;

import java.util.Scanner;

public class One_1convert {
    public static void main(String[] args) {
        /*
        Create a program that will ask the user to enter a number and print the number as a word. Set a range from 0 - 15 and any number not in the range should get an invalid number message

            Ex:
               > 1
                one

             > 10
               ten
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number 0 - 15");
        int num = input.nextInt();

        String[] count = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen"};


        if (num >=1 && num <= 15) {
            System.out.println(count[num - 1]);


        } else {

           //
            System.err.println("Invalid number please enter 0-15");

        }
    }
}
